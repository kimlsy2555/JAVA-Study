package example04;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Toolkit;

public class ListEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("List");
		frame.setSize(300, 200);
		frame.setLayout(null);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize(); // ȭ�� ũ��
		
		frame.setLocation((screenSize.width/2) -150,(screenSize.height/2) -100);
		
	
		
		List list1 = new List();
		
		list1.setBounds(20, 40, 100,120);
		// ������ �߰�
		list1.add("���Ͽ�");
		list1.add("��Ը�");
		list1.add("�̻���");
		list1.add("�̼���");
		list1.add("�̳���");
		list1.add("������");
		list1.add("������");
		list1.add("������");
		
		
		// �������� 2��° ���ڰ��� true�� �����Ͽ� 
		// list����߿��� ���� ������ �� �� �ֵ��� ��
		
		List list2 = new List(100,true);
		list2.setBounds(150, 40, 100, 120);
		
		list2.add("���Ͽ�");
		list2.add("��Ը�");
		list2.add("�̻���");
		list2.add("�̼���");
		list2.add("�̳���");
		list2.add("������");
		list2.add("������");
		list2.add("������");
		
		
		frame.add(list1);
		frame.add(list2);
		frame.setVisible(true);
		frame.setResizable(true);
	}

}
