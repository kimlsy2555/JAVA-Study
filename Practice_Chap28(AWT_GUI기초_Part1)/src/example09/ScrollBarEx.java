package example09;

import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollBarEx {

	public static void main(String[] args) {
		 
		Frame frame = new Frame("��ũ�ѹ�");
		
		// ScrollBar�� ����ڰ� ������ ���� ���� �ִ� ���� ���� ����
		// �� �� �ֵ��� ���ִ� ������Ʈ �̴�.
		// �ַ� �������� �ӵ� ���� ���� ���� �� ��������
		// ���� ���ȴ�.
		
		frame.setSize(300,200);
		frame.setLayout(null);
		
		// ���� ��ũ�ѹ�
		Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0,100);
		
		hor.setSize(100,15);
		hor.setLocation(60,100);
		
		frame.add(hor);
	
		
		// ���� ��ũ�ѹ�
		Scrollbar ver = new Scrollbar(Scrollbar.VERTICAL, 50, 20, 0,100);

		ver.setSize(15,100);
		ver.setLocation(30,30);
		
		frame.add(ver);
		
		frame.setVisible(true);
		
		
	}

}
