package example02;

import java.awt.Button;
import java.awt.Frame;

public class ButtonEx01 {

	public static void main(String[] args) {
			
		Frame frame = new Frame("Button");
	
		frame.setSize(500,500);
		// �������� �⺻���� ���̾ƿ� �Ŵ��� BorderLayout Manager��
		frame.setLayout(null); // ���̾ƿ� �Ŵ��� ���� ������
	
		// ��ư ����
		Button btn1 = new Button("Ȯ��");
		Button btn2 = new Button("���");
		// ��ư ũ�� ����
		 btn1.setSize(100,50);
		 btn2.setSize(100,50);
		 
		 btn1.setLocation(110, 50);
		 btn2.setLocation(220, 50);
		 
		 frame.add(btn1);
		 frame.add(btn2);
		 
		 //setResizable() �� true�� ������ �ϸ� ����ڰ� �������� ũ�⸦ ���� ���ϰ��Ѵ�.
		 
		 
		 frame.setResizable(true);
		 frame.setVisible(true);
	}

}
