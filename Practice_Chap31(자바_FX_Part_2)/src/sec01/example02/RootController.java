package sec01.example02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
// fxml ���ϴ� �ϳ��� ��Ʈ�ѷ��� ������ �Ѵ�.
// ���� �̺�Ʈ�� ���� ó�� ������� ����ϴµ� , �ݵ�� �ؾ� �� ����
// Initializable �������̽��� ������ �ؾ� �Ѵٴ� ���� ��� �ؾ��Ѵ�.
import javafx.scene.control.Button;

public class RootController implements Initializable {
	
	public RootController() {
		
		System.out.println("RootController ������ ȣ��");
	}
	
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;
	
	// �̺�Ʈ ó�� ���� 
	// initializa()�� AppMain.java������ �ε��� �� ��, FXMLLoader.load() �� ���� �ɶ�
	// RootController��ü�� ���������, FXML���Ͽ� ����Ǿ� �ִ� ��Ʈ���� ������ �̷����
	// ���� initialize()�� �ڵ����� JavaFX Application Thread �� ȣ���� �ش�.
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// ���� initialize() �̺�Ʈ ó�� �ڵ��� ������ �ܼ� �����ϵ� 
		// ���� �ۼ��ϸ� ���� ������ �Ͽ� �̺�Ʈ ��ϸ� ���ְ� �� �������� ������ ����ϴ�
		// �޼������ �ܺη� ���� �޼��带 �ۼ��ϴ� ���� �ٶ����� ����̴�.
		
		
		System.out.println("initializa �޼���ȣ�� ");
		// ���⼭�� �̺�Ʈ ��ϸ� �ϴ� ���� ����
		button1.setOnAction(e-> buttonHandle1(e));
		button2.setOnAction(e-> buttonHandle2(e));
		button3.setOnAction(e-> buttonHandle3(e));
		 
	}
	// button1�� �������� �̺�Ʈ ó�� �޼��� �и�
	public void buttonHandle1(ActionEvent event) {
		System.out.println("Button1 �� Ŭ���Ǿ����ϴ�.");
	}
	
	public void buttonHandle2(ActionEvent event) {
		System.out.println("Button2 �� Ŭ���Ǿ����ϴ�.");
	}
	
	public void buttonHandle3(ActionEvent event) {
		System.out.println("Button3 �� Ŭ���Ǿ����ϴ�.");
	}
	
	public void buttonHandle4(ActionEvent event) {
		System.out.println("Button4 �� Ŭ���Ǿ����ϴ�.");
	}
	
}
