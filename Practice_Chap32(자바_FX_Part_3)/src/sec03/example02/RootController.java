package sec03.example02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;




public class RootController implements Initializable {
	
	@FXML private ProgressBar progressBar;
	@FXML private Label lblWorkDone;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	// ��� ���� ���� Task�� ����� ���ؼ� VoidŸ���� ������.
	
	private Task<Void> task;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		// �̺�Ʈ ó�� �κ� ���
		btnStart.setOnAction(e-> BtnStart(e));
		btnStop.setOnAction (e-> BtnStop(e));
	}
	
 

	public void BtnStart(ActionEvent e) {
		
		 System.out.println("BtnStart()���� ������ �� : "+Thread.currentThread().getName());
		
		 
		 task = new Task<Void>() {
			
			@Override
			protected Void call() throws Exception {
			 
				System.out.println("Call()���� ������ �� : "+Thread.currentThread().getName());
				for(int i=0;i<=100;i++) {
					//��Ұ� �Ǿ����� ��Ӱ����ϴ� �ڵ带 �Ʒ��� ���� �ۼ�
					if(this.isCancelled()) {
						
						this.updateMessage("��ҵ�");
						break;
					}
					// updateProgressme ProressBar , ProgressIndiacator���� ���ѵǾ� �ִ�.
					this.updateProgress(i, 100); //i�� ���ప, 100�� �Ϸᰪ
					// �۾��� �Ϸᰡ �Ǹ� i���� lblWorkDone�� �ѷ��ش�.
					this.updateMessage(String.valueOf(i)+"%");
					
					
					// �������� cancel() ��������� ȣ���ؾ� ���� �����ڵ尡 ����
					//call()���� ����ó���� �Ǿ� �ִ�. ������, ������ �ܺο���
					// interrupt()�� ȣ���ϸ� task�� ��ҵǵ������� ���ܱ����� �����ڵ��̴�.
					
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
						if(this.isCancelled()) {
							this.updateMessage("���ͷ�Ʈ�� ���� ���");
							break;
						}
					}
					
				}
				return null;
			}
		};
		
		// �Ӽ����ε� �ڵ� 
		// ProgressBar ��Ʈ���� �Ӽ��� task�� updateProgress�� progress �Ӽ��� ���ε� ó���� �Ѵ�.
		// �̷��� ���ָ� ��μ� ProgressBar�� ���������� ���ϰ� �ȴ�.
		
		progressBar.progressProperty().bind(task.progressProperty());
		// ���� ���� Label��Ʈ���� �Ӽ��� updateMessage�� �Ӽ��� ���ε��Ѵ�.
		lblWorkDone.textProperty().bind(task.messageProperty());
		
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}
	
	public void BtnStop(ActionEvent e) {
		 
		System.out.println("BtnStop()���� ������ �� : "+Thread.currentThread().getName());
		task.cancel();
	}
	
}
