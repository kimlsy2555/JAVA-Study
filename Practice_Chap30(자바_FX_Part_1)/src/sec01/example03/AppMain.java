package sec01.example03;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// VBox�� �����̳� Ŭ������ �� ���� �̸� ,�������� ����(��Ʈ��)���� 
		// ��ġ�ϴ� �����̳� �̴�.
		
		VBox root = new VBox();
		root.setPrefWidth(500); // ���� ����
		root.setPrefHeight(350);// ���� ����
		root.setAlignment(Pos.CENTER);// �߾�����
		root.setSpacing(20);// ��ġ�Ǵ� ��Ʈ�� ������ 20px �� �ϰڴ�.
		
		Label label = new Label();
		label.setText("�ȳ�! �ڹ� FX");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("Ȯ��");
		// ���ٽ����� ��ư�� Ŭ���� ����ǵ��� ������ �̺�Ʈ ó����
		button.setOnAction( (ActionEvent event)  -> Platform.exit());
		// �͸� ������ü�� ���� ���� �̺�Ʈ �ڵ鸵 
//		button.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent event) {
//				 System.out.println("������ ����");
//				 Platform.exit();
//			}
//		});
		
		// VBox �����̳ʿ� ��Ʈ�ѵ��� ��ġ��.
		ObservableList<Node> list = root.getChildren();
		list.add(new Label("HELLO!!!"));
		list.add(label);
		list.add(button); 
		
		// Scene�� �������� �Ű����� Parent��� �߻�Ŭ�����̴�.
		// VBox�� Parent�� ��� �����Ƿ� �Ű������� ���µ� ������ ����.
		// ��� �����̳ʰ� �Ű������� ����.
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		
		Application.launch(args);

	}
	// 1. ���� Stage�� ������ �� �� ������ â�� �ش��Ѵ�.
	// 2. �� Stage �� �����Ǹ� ��� �� Scene�� ���� �������ش�.
	// 3. Scene�� ������ �� �Ű����� ��� Parent Ŭ������ ���µ�,
	// �߻�Ŭ���� �̹Ƿ� ���� �����̳� Ŭ������ �Ѱ��ش�.
	// 4. ParentŬ������ ��� �޴� �����̳ʿ� ���� ��Ʈ��(����)�� �߰� ��ġ�Ѵ�.
}
