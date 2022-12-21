package sec03.example02;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class RootController implements Initializable{
	
	// FXML�� ������ ���´�
	@FXML private TextField txtTitle;
	@FXML private PasswordField txtPassword;
	@FXML private ComboBox<String> comboTxt;
	@FXML private DatePicker date;
	@FXML private TextArea textArea;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	
	public void handleBtnPrint() {
		
		String title = 	txtTitle.getText();
		System.out.println("���� : "+title);
	
		String passWord = 	txtPassword.getText();
		System.out.println("�н����� : "+passWord);
	
		String combo = comboTxt.getValue();
		// ������ ���� �ʾ��� ��쵵 �־� ���ǹ��� �־���Ѵ�
		if(combo !=null) {
			System.out.println("�������� : "+combo);
		}
		// DatePick�� ����ڷκ��� ��¥�� ������ �Ǿ�����
		// �� ���� LocalDate Ÿ������ �������Ѵ�.
		// ������ ���ߴٸ� null ���ϵǾ����Ƿ� ��ȿ�� �˻��ϴ� �ڵ尡 �ʿ��ϴ�
		LocalDate localDate = date.getValue();
		
		if(localDate !=null) {
			System.out.println("�Խ� ������ : " +localDate.toString());
		}
		
		String content = textArea.getText();
		System.out.println("���� : "+ content);
		
	
		
	}
	
	
	public void handleBtnExit() {
		System.exit(0);
	}
	
	
}
