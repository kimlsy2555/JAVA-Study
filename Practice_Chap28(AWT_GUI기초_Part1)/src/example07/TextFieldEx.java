package example07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextFieldEx {

	public static void main(String[] args) {
		 
		Frame frame =new Frame("TextFile");
		
		frame.setSize(400,80);
		frame.setLayout(new FlowLayout());
		
		
		Label  lid = new Label("���̵� : ",Label.RIGHT);// ������ ����
		
		Label  lpwd = new Label("�н����� : ",Label.RIGHT);
		
		TextField id  = new TextField(10);
		TextField pwd = new TextField(10);
		
		// �Է��� �� ��ſ� *�� ���̵��� �Ѵ�.(���� ���� ) ��� ��ȣ ������ ����Ѵ�.
		pwd.setEchoChar('*'); 
		System.out.println("������ ���� ���� : "+pwd.getEchoChar());
		frame.add(lid);
		frame.add(id);
	
		
		frame.add(lpwd);
		frame.add(pwd);
		
		frame.setVisible(true);
	}

}
