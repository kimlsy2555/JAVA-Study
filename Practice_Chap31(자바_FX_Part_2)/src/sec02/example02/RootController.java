package sec02.example02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable{
	
	// FXML�� ������ ���´�
	@FXML private TextArea textArea;
	@FXML private TextField textField;
	
	
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// �ܹ��� ���ε� ó��
		// textArea.textProperty().bind(textField.textProperty());
		
		// �ܹ��� ���ε� ����
		// textArea.textProperty().unbind();
		
		// ����� ���ε� ó��
		// textArea.textProperty().bindBidirectional(textField.textProperty());
		
		// Bindings Ŭ������ �̿��Ͽ� ����ϴ°��� ���ϴ� �ٶ��� �ϴ�
		Bindings.bindBidirectional(textArea.textProperty(), textField.textProperty());
		
		// ����� ���ε� ����
		// Bindings.unbindBidirectional(textArea.textProperty(), textField.textProperty());
		
		
	}
}
