package sec03.example01;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable {
	
	@FXML private Label lblTime;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	
	private boolean stop;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// �̺�Ʈ ó�� �κ�
		btnStart.setOnAction(e-> BtnStart(e));
		btnStop.setOnAction(e-> BtnStop(e));
	}
	

	public void BtnStart(ActionEvent e) { // TODO Auto-generated method stub
	
		this.stop= false;
		Thread thread = new Thread() {
			@Override
			public void run() {
				SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
				while(!stop) {
					// ��� �ý����� �簣�� ���´�
					String strTime = sdf.format(new Date());
					System.out.println("run() ���� ������� : "+Thread.currentThread().getName());
					
					// �۾������尡 ���� UI�� �����ϴ� �ڵ带 �־�� ���ܰ� �߻��Ѵ�.
					
//					lblTime.setText(strTime);
//					System.out.println("����ð� : "+strTime);
					
					
					// �۾������尡 ��������� �ý������κ��� �ð��� ������ �װ���
					// �̺�Ʈ ť�� ������ ���ָ� JavaFX Application Thread�� �� �̺�Ʈ�� �����ͼ�
					// Platform.runLater() �� ������ �Ѵ�.
					// �Ͽ� UI�� �����ϴµ� ���� ������ ����.
					
					Platform.runLater( ()-> {
						System.out.println("runLater() ȣ���");
						System.out.println("runLater() ���� ������� : "+Thread.currentThread().getName());
						//UI �����ڵ�
						lblTime.setText(strTime);
					});
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			};
		};
		
		thread.setDaemon(true);
		thread.start();
	}
	
	
	private void BtnStop(ActionEvent e) {
		 
		this.stop = true;
		
		
	}
	
	
	
	
	
}
