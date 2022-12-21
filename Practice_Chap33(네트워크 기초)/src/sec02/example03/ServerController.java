package sec02.example03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
 

public class ServerController extends Application implements Initializable {

	//fxml���� ���
	@FXML private TextArea txtDisplay;
	@FXML private Button btnStartStop;
	
	/////////////////////////////////
	ExecutorService executorService;  //������ Ǯ ��ü ����� ���� ����
	ServerSocket serverSocket;
	List<Client> clientList = new Vector<Client>();  //Ŭ���̾�Ʈ�� �����ϱ� ���� �÷��� ����
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		txtDisplay.setEditable(false);
		//��ư���κ��� ������ ������ �˸��� �ڵ�� ������ �ߴ��ϴ� �ڵ带 �ۼ�
		btnStartStop.setOnAction(event -> {
			if(btnStartStop.getText().equals("start")) {
				startServer();
			}
			else if(btnStartStop.getText().equals("stop")) {
				stopServer();				
			}
		});		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("server.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ä�� ����");
		primaryStage.show();		
	}
	
	//�α׸� ����� ���ؼ� �ؽ�Ʈ�� ǥ���ϴ� �޼���
	public void displayText(String data) {
		txtDisplay.appendText(data + "\n");
	}
	
	//������ �����ϱ� ���� �ڵ带 �ۼ�
	public void startServer() {
		//������ Ǯ�� ����
		executorService = Executors.newFixedThreadPool(10);
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 7777));
		} catch (IOException e) {
			if(!serverSocket.isClosed()) {
				stopServer();
				return;
			}
		}	
		//�������� accept()���� ���ŷ�� �Ͼ�� ������ ���� �ϳ��� �����尡 ����ϵ��� �ڵ带 �ۼ��Ѵ�.
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				//UI�����ڵ� -- JAVA FX���ø����̼� ������ ó��
				Platform.runLater(() -> {
					displayText("[������ ���۵Ǿ����ϴ�]");
					btnStartStop.setText("stop");					
				});
				while(true) {
					try {
						//Ŭ���̾�Ʈ�� ������ ���� ������ �ϰ� ��ſ� ������ �����Ѵ�.
						Socket socket = serverSocket.accept();
						String data = "[���� ���� : " + socket.getRemoteSocketAddress() +
								      " : " + Thread.currentThread().getName() + "]";
						Platform.runLater(() -> displayText(data));
						
						Client client = new Client(socket);
						clientList.add(client); //����� Client�� �߰��ϴ� �ڵ�
						Platform.runLater(() -> displayText("[����� Ŭ���̾�Ʈ�� �� : " + 
						                        clientList.size() + "]"));						
						
					} catch (IOException e) {
						if(!serverSocket.isClosed()) {
							stopServer();							
						}
						break;
					}
				}				
			}
		};
		//������ Ǯ�� �ִ� �۾�ť���ٰ� runnable��ü�� �־�θ� �ϳ��� �����尡 ���þƼ� ���������� ó��
		executorService.submit(runnable);	
	}
	//������ �����ϴ� �ڵ带 �ۼ��Ѵ�.
	public void stopServer() {
		try {
			Iterator<Client> iterator = clientList.iterator();
			while(iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();				
			}
			//�������� �ݱ�
			if(serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			//������Ǯ ����
			if(executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();				
			}
			Platform.runLater(() -> {				
				displayText("[������ ����Ǿ����ϴ�]");
				btnStartStop.setText("start");
			});			
		} catch (IOException e) {System.out.println("catch");}
		
	}		
		
	//��øŬ���� Client������.
	class Client{
		Socket socket;
		
		public Client(Socket socket) {
			this.socket = socket;
			receive();
		}
		
		//�����͸� �޴� �޼��� �ڵ� �ۼ��غ���
		public void receive() {
			Runnable runnable = new Runnable() {				
				@Override
				public void run() {
					try {
						while(true) {
							byte[] byteArr = new byte[1000];
							InputStream inputStream = socket.getInputStream();
							
							int readCount = inputStream.read(byteArr); //���ŷ ����
							
							//Ŭ���̾�Ʈ�� ���������� Socket�� close()�� ȣ������ ���
							if(readCount == -1) {
								throw new IOException();
							}
							
							String data = "[Ŭ���Ʈ�� ��û ó�� : " + socket.getRemoteSocketAddress() 
										  +	" : " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(data));
							
							String message = new String(byteArr, 0, readCount, "UTF-8");
							
							//������ ����� Ŭ���̾�Ʈ ���ο��� ������ ���� �ڵ�
							for(Client client : clientList) {
								client.send(message);
							}							
						}
					} catch (Exception e) {
						try {
							clientList.remove(Client.this);
							String data = "[Ŭ���̾�Ʈ�� ������ϴ�. : " + socket.getRemoteSocketAddress() 
							 			+ " : " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(data));
							socket.close();
						} catch (IOException e1) {}
					}
				}
			};	
			executorService.submit(runnable);
		}
		//�����͸� ������ �޼��� �ڵ� �ۼ��غ���
		public void send(String data) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);  //���ŷ ����
						outputStream.flush();						
					} catch (Exception e) {
						try {
							String data = "[Ŭ���̾�Ʈ�� ������ ������ϴ� : " + socket.getRemoteSocketAddress() 
							              + " : " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(data));
							clientList.remove(Client.this);
							socket.close();
						} catch (IOException e1) {}
					}					
				}
			};
			executorService.submit(runnable);
		}		
	}
}
