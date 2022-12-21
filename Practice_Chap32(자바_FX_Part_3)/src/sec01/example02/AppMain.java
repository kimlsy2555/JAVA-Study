package sec01.example02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AppMain extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
	//Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
	
	// FXMLLoader Ŭ������ �ν��Ͻ��� �����ϰ� �ִ�.
	FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
	Parent root = loader.load();
	// RootController�� ������ ��´�.
	RootController rootController = loader.getController();
	// RootController�� setter�� ȣ�������� primaryStage�� �ѱ����ν�
	// RootController������ ������ �� �� �ְ� �ȴ�. 
	rootController.setPrimaryStage(primaryStage);
	
	Scene scene = new Scene(root);
	
	primaryStage.setTitle("���̾� �α�");
	primaryStage.setScene(scene);
	primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		 Application.launch(args);

	}
	
	

}


