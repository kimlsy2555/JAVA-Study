package example05;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelEx {

	public static void main(String[] args) {

		Frame frame = new Frame("Label");
		frame.setSize(300,200);
		frame.setLayout(null);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize(); // ȭ�� ũ��
		
		frame.setLocation((screenSize.width/2) -150,(screenSize.height/2) -100);
	
	// Label ���� (�ؽ�Ʈ�� ǥ���� ���� �����)
		
		Label id = new Label("ID : ");
		id.setBounds(50,50,30,10);
		
		Label pwd = new Label("Password : ");
		pwd.setBounds(50,65,100,10);
	
		frame.add(id);
		frame.add(pwd);
		frame.setVisible(true);
		frame.setResizable(true);
	
	
	}

}
