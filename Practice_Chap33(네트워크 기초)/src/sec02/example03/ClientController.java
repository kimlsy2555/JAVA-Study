package sec02.example03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
 

public class ClientController extends Application implements Initializable {

	//fxml���� ���
	 
	/////////////////////////////////
	@FXML private TextArea txtDisplay;
	@FXML private TextField txtInput;
	@FXML private Button btnConn;
	@FXML private Button btnSend;
	
	////////////////////////////////
	Socket socket;

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 
		txtDisplay.setEditable(false);
		// �ؽ�Ʈ �ʵ忡 Ű����� ����Ű�� �Է��� �������� ���� ���� �ǵ��� �̺�Ʈ ó���ڵ� ���
		txtInput.setOnAction(e -> send(txtInput.getText()));
		btnConn.setOnAction(e->{
			
			if(btnConn.getText() .equals("start")) {
				startClient();
			}
			else if(btnConn.getText().equals("stop")) {
				stopClient();
			}
			
		});
		
		// ���� Ŭ���̾�Ʈ â�� �߸�  send��ư�� ��Ȱ��ȭ �ϴ��ڵ�
		btnSend.setDisable(true);
		btnSend.setOnAction(e -> send(txtInput.getText()));
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Ŭ���̾�Ʈ");
		primaryStage.show();		
	}
	
	
	public void displayText(String text) {
		// ��ȭ ������ ��������ؼ� appentText()���
		txtDisplay.appendText(text+"\n");
	}
	
	
				
	public void startClient() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress("localhost",7777));
					Platform.runLater(() ->{
						displayText("[���� ���� : "+socket.getRemoteSocketAddress() +"]");	
						// ������ �����ϸ� start��ư�� stop���� �ٲٰ� sned��ư�� Ȱ��ȭ
						// 
						btnConn.setText("stop");
						btnSend.setDisable(false);
					});
				} catch (Exception e) {
					 Platform.runLater(() ->  displayText("[���� ��� �Ұ�]"));
					 
						 if(!socket.isClosed()) {
							 stopClient();
						 }
					return;
				}
				// ���ῡ ������ �ϸ� ������ ������ ���� �ϱ� ���ؼ� receive() �� �ٷ� ȣ�����ֵ��� �Ѵ�.
				receive();
			}
		};
		thread.start();
		
	}
	
	public void stopClient() {
		try {
			Platform.runLater(() ->{
				displayText("[���� ����]");
				btnConn.setText("start");
				btnSend.setDisable(true);
			});
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		}catch (Exception e) {}
	}
	
	public void receive() {
		// �����͸� ��������� �ޱ� ���ؼ� ���ѷ����� �ۼ���
		while(true) {
			try {
				byte[] byteArr = new byte[1000];
				InputStream inputStream =socket.getInputStream();
				
				// ������ ������������ �������� ��� IOException�� �߻���Ŵ
				
				int readCount = inputStream.read(byteArr);
				// ������ ����������  Socket�� close() ȣ��������
				if(readCount == -1) {
					throw new IOException();
				}
				// ���� ������ ���ڵ�
				String data = new String(byteArr,0,readCount,"UTF-8");
				Platform.runLater(() -> displayText("[���� �Ϸ�] "+data));
			}catch (Exception e) {
				Platform.runLater(() -> displayText("[���� ��� �Ұ�] "));
				stopClient();
				break;
			}
			
		}
	}
	
	
	
	//�����͸� �����ϴ� �޼���	
		public void send(String data) {
			Thread thread = new Thread() {
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);
						outputStream.flush();
						Platform.runLater(() -> {
							displayText("[�۽� �Ϸ�] " + data);
							//�����͸� ������ ���� �ؽ�Ʈ �ʵ带 ���� �ʱ�ȭ
							txtInput.setText("");
						});					
					}catch (Exception e) {
						Platform.runLater(() -> displayText("[���� ��� �Ұ�]"));
						stopClient();					
					}
				}			
			};
			thread.start();		
		}	
	}

