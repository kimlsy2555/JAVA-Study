package sec01.example01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;


public class RootController implements Initializable{
	
	// FXML�� ������ ���´�
	@FXML private TextArea textArea;
	@FXML private ComboBox<String> comboBox;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	

	public void handleNew(ActionEvent eveent) {
		//setText�� �̺�Ʈ�� ó���� �� ������ ���� �����ϹǷ� appendText()������Ѵ�
		//textArea.setText("���θ����\n");.
		textArea.appendText("���θ����\n");
	}
	
	public void handleOpen() {
		textArea.appendText("����\n");
	}
	

	public void handleSave() {
		textArea.appendText("�����ϱ�\n");
	}

	public void handleExit() {
		textArea.appendText("������\n");
	}
	public void handleCombo() {
		if(comboBox.getValue().equals("����")) {
			textArea.appendText("����\n");
	 	}
	 	else {
	 		textArea.appendText("�����\n");
	 	}
	}
	
}
