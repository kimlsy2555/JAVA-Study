package example01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameEx02 {

	public static void main(String[] args) {


		 Frame frame = new Frame("Center");
		 frame.setSize(300,200);
		 
		 
		  
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 // ȭ���� ũ�⸦ ���ϴ¹�
		 
		Dimension screenSize = 	toolkit.getScreenSize();
		System.out.println(screenSize.toString());
		
		// ȭ�� ũ���� ���� ������ �������� ũ���� ���� ���� �A ��ġ�� �ؾ���
		// ȭ�� ��� ��ġ�ϰ� �ȴ�.
		frame.setLocation((screenSize.width/2)-150, (screenSize.height/2)-100);
		frame.setVisible(true);
	}

}
