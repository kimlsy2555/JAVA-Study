package example03;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceEx {

	public static void main(String[] args) {
		 
		Frame frame = new Frame("Choice");
		frame.setSize(300, 200);
		
		frame.setLayout(null);
		// ����� Choice ��� ��Ī�� ���� ����.
		// �ٸ� �޺� �ڽ�, ����ٿ� ����Ʈ
		// ��� �Ҹ�������.
		Choice choice = new Choice();
		// Choice �� ����Ʈ �������� �߰�
		
		choice.add("������");
		choice.add("ȭ����");
		choice.add("������");
		choice.add("�����");
		choice.add("�ݿ���");
		choice.add("�����");
		choice.add("�Ͽ���");
		
		System.out.println(choice.getItem(5));
		
		choice.setBounds(100, 70, 100, 50);
		
		frame.add(choice);
		
		frame.setVisible(true);
	}

}
