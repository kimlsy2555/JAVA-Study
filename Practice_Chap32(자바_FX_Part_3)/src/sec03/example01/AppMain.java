package sec03.example01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AppMain extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
	Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
	Scene scene = new Scene(parent);
	
	// �ܺο��� �ۼ��� CSS������ Scene�� �����ϴ� �ڵ带 �Ʒ��� ���� �ۼ��Ѵ�.
	
	//scene.getStylesheets().add(getClass().getResource("test.css").toString());
	
	primaryStage.setTitle("������ ���ü�");
	primaryStage.setScene(scene);
	primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		 Application.launch(args);
	 
	}
	
	

}


