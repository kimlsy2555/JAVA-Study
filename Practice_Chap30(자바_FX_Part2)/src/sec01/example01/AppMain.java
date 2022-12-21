package sec01.example01;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	// Main �� �׻� javafx.application.Application (�߻� Ŭ����)�� �׻� ����ؾ��Ѵ�.
	 
	// ApplicationŬ���� start()�� �ݵ�� �������̵� �ؾ��Ѵ�.
	@Override
	public void start(Stage primaryStage) throws Exception {
		String threadName = Thread.currentThread().getName();
		System.out.println("start �޼��� �����̴� ������ : "+ threadName);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
	 
		String threadName = Thread.currentThread().getName();
		System.out.println("main �޼��� �����̴� ������ : "+ threadName);
		//launch()����Ǹ鼭 JavaFX���ø����̼� �����尡 �����Ǿ� start()ȣ���Ͽ� �ش�.
		Application.launch(args);
	 
	}

}
