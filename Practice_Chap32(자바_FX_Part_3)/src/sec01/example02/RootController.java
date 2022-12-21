package sec01.example02;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class RootController implements Initializable{
	
	// FXML�� ������ ���´�
	@FXML private VBox vBox;
	
	private Stage primaryStage;
	
	public RootController() {
		System.out.println("RootController ������ ȣ��");
	}
		
	 public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
		System.out.println("setterȣ��");
	}

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("initialize() ȣ���");
	}
	
	public void OpenFileChooser(ActionEvent event) {
		
		FileChooser fileChooser =  new FileChooser();
		// getExtensionFilters()�� ����Ȯ����� �������� ���͸��� ���ִ� �޼����̴�.
		// �ƿ﷯ �Ű������� ExtensionFilter��ü�� ������.
		fileChooser.getExtensionFilters().addAll(
				
				new ExtensionFilter("Txt Files(*.txt)","*.txt"),
				new ExtensionFilter("Image Files(*.png,*.jpg,*gif)","*.png","*.jpg","*.gif"),
				new ExtensionFilter("Audio Files(*.mp3,*aac)","*.mp3","*.aac"),
				new ExtensionFilter("All Files(*.*)","*.*(")
				
				);
		
		// primaryStage�� ������ �� ��������� ������ �ؾ��Ѵ�.
		// File selectedFile = fileChooser.showOpenDialog(primaryStage);
		
		// 2��° ������� �����̳ʳ� ��Ʈ�ѿ��� ���� primaryStage�� ������ ��´�.
		File selectedFile = fileChooser.showOpenDialog(vBox.getScene().getWindow());
		
		
		
		if(selectedFile != null) {
			System.out.println("���� ���� ��� :" +selectedFile.getParent());
			System.out.println("������ ũ�� : "+ selectedFile.length());
		}

		
	}
	
	// ���� ����
	public void SaveFileChooser(ActionEvent event) {
		FileChooser fileChooser =  new FileChooser();
		
		fileChooser.getExtensionFilters().addAll
					(new ExtensionFilter("All Files(*.*)","*.*("));
		
		File selectedFile = fileChooser.showSaveDialog(vBox.getScene().getWindow());
		
		if(selectedFile != null) {
			System.out.println("����� ���� ��� :" +selectedFile.getParent());
			System.out.println("����� ����ũ�� : "+ selectedFile.length());
		}
		
	}
	
	// ���� ����
	public void OpenDirectoryFileChooser(ActionEvent event) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedFolder = directoryChooser.showDialog(primaryStage);
		if(selectedFolder!= null) {
			System.out.println("���õ� ���� ��� :" +selectedFolder.getParent());
		
			
		}
	}
	
	// �˾�â
	public void OpenPopup(ActionEvent event) throws Exception{
		Popup popup = new Popup();
		Parent parent = FXMLLoader.load(getClass().getResource("popup.fxml"));
		
		// lookup()�� �Ű������� fxml������ id���� �ȴ�.
		// id�� �ο��� ��Ʈ���� ã�´� ����Ÿ���� Node�̱� ������ ImageView�� �ٿ�ĳ������ �ϸ� �ȴ�.
		// �ñ������� ����ϴ� ������ �ڹ��ڵ忡�� �������� �̹����� �������ֱ� ���� ��
		ImageView imageView = (ImageView)parent.lookup("#imgMessage");
		imageView.setImage(new Image(getClass().getResource("images/dialog-info.png").toString()));
		
		Label lblMessage =  (Label)parent.lookup("#lblMessage");
		lblMessage.setText("�˸�â�� �����ϴ�!!!");
		
		// Popupâ�� fxml������ ������ �߰��Ѵ�.
		popup.getContent().add(parent);
		// ���콺 �����Ͱ� �ٸ� ������� �������� �˾�â�� �ڵ����� �����Բ� ��
		popup.setAutoHide(true);
		
		popup.show(primaryStage);
	}
	
	// ����� ���� ���̾�α�
	public void OpenCustom(ActionEvent event) throws Exception{
		// �������� ����̰� ����� �ݱ� ��ư�� �����ϴ� stage�� �����Ѵ�.
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("Ȯ��");
		
		Parent parent = FXMLLoader.load(getClass().getResource("custom.fxml"));
		
		// fxml���Ͽ� �ִ� Label��Ʈ���� ������ �� �Ʒ��� ���� �������� �޼��� �ۼ�
	 	Label txtTitle =  (Label)parent.lookup("#txtTitle");
		txtTitle.setText("Ȯ���ϼ̳���?");
	 	txtTitle.setFont(new Font(30));
	 	
	 	Button btnOk= (Button)parent.lookup("#btnOK");
		btnOk.setOnAction(e-> dialog.close());
		
		Scene scene = new Scene(parent);
		
		dialog.setOnCloseRequest(e-> System.out.println("���̾�α� ����"));

		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}
	
	

}
