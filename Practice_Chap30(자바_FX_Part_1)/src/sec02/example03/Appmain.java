package sec02.example03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Appmain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// �� ���� ������ �ִ� ����� �� ������ �ʿ䰡 �ִ�.
		
		HBox hBox = new HBox();
		// HBox �� �������� �Ͽ� ,�ð�������� ���� ���� ������ �ش�. (�鿩 ���� ����)
//		hBox.setPadding(new Insets(20, 20, 0, 60)); // Padding ���� ����
//		
//		Button button = new Button();
//		button.setPrefSize(100, 100);
		
		// ���� ���� 
		// HBox.setMargin() �� ȣ���� �� �Ű������� ��Ʈ���� �ְ� �Ǹ�,
		// ��Ʈ���� �������� ����(�ٱ� ����)�� �����ȴ�
		Button button = new Button();
		button.setPrefSize(100, 100);
		HBox.setMargin(button, new Insets(20, 20, 0, 60));
		
		// �оȸ��� (�е��� ���ʿ���, ������ �ٱ�����)
		
		hBox.getChildren().add(button);
		Scene scene = new Scene(hBox);
		primaryStage.setTitle("����");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
	public static void main(String[] args) {
		 Application.launch(args);
	}

}
