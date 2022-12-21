package sec02.example01;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	 // ���������� ġ����
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// ���α׷��� ���̾ƿ� 
		// �����̳� ���� �� ���� ��Ʈ�ѵ��� �����ϰ� ��ġ �ϴ°���
		// ���� �ڹ� �ڵ�� �̷���� 
	
		HBox hBox = new HBox(); // ��Ʈ �����̳�
		hBox.setPadding(new Insets(10,10,10,10)); // ���� ���� ����
		hBox.setSpacing(10); // ��Ʈ���� ���� 10�ȼ����Ѵ�
		
		// TextField ���� �Է� ���� �� �ִ� ��Ʈ�� 
		TextField textField = new TextField();
		textField.setPrefWidth(200); // ���� ����
		
		Button button = new Button();
		button.setText("Confirm");
		// �����̳ʿ� ��Ʈ�ѵ��� ��ġ�ϱ� ���ؼ�
	    ObservableList<Node> list = hBox.getChildren();
		list.add(textField);
		list.add(button);
		
		// ȭ�鿡 ��Ʈ �����̳� (Parent)
		
		Scene scene = new Scene(hBox); 	  // ��� ����
		primaryStage.setTitle("AppMain"); // ������ Ÿ��Ʋ
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		Application.launch(args);

	}

}
