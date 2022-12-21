package sec02.example01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable{
	
	// FXML�� ������ ���´�
	@FXML private Label label1;
	@FXML private Label label2;
	
	
	// Slider 0.0���� 100.0������ double���� ���Ѵ�.
	@FXML private Slider slider;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		

			 
		// slider��Ʈ���� �Ӽ���(0.0~100.0)�� �����ϱ� ���ؼ� valueProperty()��
		// ChangeListener�� ����� �Ѵ�.
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number>
			observable, Number oldValue, Number newValue) {
				
				// oldValuer���� ����Ǳ� ���� ��, newValue�� ����� ���� �ǹ��Ѵ�.
				// �ƿ﷯ <? extends Number>�� ���׸� ���ϵ� ī�� Ÿ������ 
				// Number�̰ų� NnmberŬ������ ��ӹ޴� ����Ŭ������ ������
				// ����Ÿ���� ������ �ǹ��Ѵ�.
				
				
				
				// slider�� ���� ����(�Ӽ�����)�� ���� Label��Ʈ���� Font������ ���� 
				// ���������ν�, ������ ũ�Ⱑ ������ �Ǵ� ���̴�.
				label1.setFont(new Font(newValue.doubleValue()));
				label2.setFont(new Font(newValue.doubleValue()));
				
//				System.out.println("������ �� : "+oldValue.doubleValue());
//				System.out.println("������ �� : "+newValue.doubleValue());
				
			}
		});
		
	}
}
