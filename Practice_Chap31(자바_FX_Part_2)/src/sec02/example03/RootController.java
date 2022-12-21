package sec02.example03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable{
	
	// FXML�� ������ ���´�
	@FXML private TextArea textA2_1;
	@FXML private TextArea textA10_1;
	
	@FXML private TextArea textA8_2;
	@FXML private TextArea textA10_2;
	
	@FXML private TextArea textA16_3;
	@FXML private TextArea textA10_3;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 10������ �Է��ϸ� TextArea�� �Ӽ������Ͽ� 10������ �ԷµǸ� 2������ ��ȯ�ؼ�
		// TextArea�κп� ��Ÿ����.
		textA10_1.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, 
								String oldValue, String newValue) {
				String temp="";
				try {
					temp = Integer.toBinaryString(Integer.parseInt(newValue));
					textA2_1.setText(temp);
					
				} catch (Exception e) {
				 System.out.println("���ڸ� �Է��ϼ���");
				}
			}
		});
		
		// 10������ �Է��ϸ� TextArea�� �Ӽ������Ͽ� 10������ �ԷµǸ� 8������ ��ȯ�ؼ�
		// TextArea�κп� ��Ÿ����.
		textA10_2.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, 
								String oldValue, String newValue) {
				String temp="";
				try {
					temp = Integer.toOctalString(Integer.parseInt(newValue));
					textA8_2.setText(temp);
					
				} catch (Exception e) {
				 System.out.println("���ڸ� �Է��ϼ���");
				}
			}
		});
		
		// 10������ �Է��ϸ� TextArea�� �Ӽ������Ͽ� 10������ �ԷµǸ� 16������ ��ȯ�ؼ�
		// TextArea�κп� ��Ÿ����.
		textA10_3.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, 
								String oldValue, String newValue) {
				String temp="";
				try {
					temp = Integer.toHexString (Integer.parseInt(newValue));
					textA16_3.setText(temp);
					
				} catch (Exception e) {
				 System.out.println("���ڸ� �Է��ϼ���");
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
