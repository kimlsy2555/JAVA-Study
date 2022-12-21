package sec03.example04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class RootController implements Initializable{
	
	// FXML�� ������ ���´�
	@FXML private TableView<Car> tableView; //CarŬ������ ����
	@FXML private ImageView imageView;
	 
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// �������� ���̺�信 �����͸� �߰��ϱ� ���ؼ� �Ʒ��� ���� Car�� �ν��Ͻ��� �߰��Ѵ�.
		ObservableList<Car>carList = FXCollections.observableArrayList(
				new Car("���������_������_��������","30��","01_���������_������_��������.jpg"),
				new Car("�ΰ�Ƽ_���̷� �׷���_������_�κ��","25��","02_�ΰ�Ƽ_���̷� �׷���_������_�κ��.jpg"),
				new Car("�ΰ�Ƽ_���̷�_���۽���Ʈ","24��","03_�ΰ�Ƽ_���̷�_���۽���Ʈ.jpg"),
				new Car("�ڴм���_Ʈ����Ÿ","23��","04_�ڴм���_Ʈ����Ÿ.jpg"),
				new Car("�ڴм���_CCXR","05��","05_�ڴм���_CCXR.jpg"),
				new Car("�ֽ��渶ƾ_ONE-77","21��","06_�ֽ��渶ƾ_ONE-77.jpg"),
				new Car("�İ���_����_ģ��_�ε彺��","20��","07_�İ���_����_ģ��_�ε彺��.jpg"),
				new Car("���_FXX","19��","08_���_FXX.jpg"),
				new Car("���������_������","16��","09_���������_������.jpg"),
				new Car("�ڴм���_������","15��","10_�ڴм���_������R.jpg")
		);
		// ���̺���� 0��° �÷��� �����´�.
		// ���̺���� �÷��߿� �ִ�  "�̸�" �÷��� �������
		// Car Ŭ������ ��������� carName�� ������ �ϰ� �ִ�.
		TableColumn<?, ?> tcCarName = tableView.getColumns().get(0);
		
		tcCarName.setCellValueFactory(new PropertyValueFactory<>("carName"));
		
		// ���̺���� 1��° �÷��� �����´�.
		// ���̺���� �÷��߿� �ִ�  "����" �÷��� �������
		// Car Ŭ������ ��������� CarMoney�� ������ �ϰ� �ִ�.
		TableColumn<?, ?> tcCarMoney = tableView.getColumns().get(1);
		tcCarMoney.setCellValueFactory(new PropertyValueFactory<>("carMoney"));
		
		// ���̺���� ������ carList�� ������
		tableView.setItems(carList);
		
		// �Ӽ����� �ڵ�
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Car>() {

			@Override
			public void changed(ObservableValue<? extends Car> observable, 
						Car oldValue, Car newValue) {
				// ����� Ŭ���� ��� �Ǹ� �ȵǱ� ������ ��ȿ�� �˻� �ǽ�
				if (newValue != null) {
					//CarŬ������ ����� �̹��� ���ϸ�.jpg�� ���� ��  url��ü�� �Ѱ��ش�.
					imageView.setImage(new Image(getClass().getResource("images/"+newValue.getCarImage()
					.toString()).toString()));
				}
				
				
				
			}
		});
		
		
	}




















	
	
	
	
}
