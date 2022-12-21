package example01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutEx {

	public static void main(String[] args) {
		 
		Frame frame = new Frame("BoderLayout");
		
		frame.setSize(300,300);
		
		// frame�� �⺻�� ���̾ƿ��Ŵ����� BorderLayout �̴�
		// �� ������ ������ ����, �������� 10�ȼ��� ������
		frame.setLayout(new BorderLayout(10,10));
		
		Button north = new Button("����");
		Button east = new Button("����");
		Button south = new Button("����");
		Button west = new Button("����");
		Button center = new Button("�߾�");
		
		
		frame.add(BorderLayout.NORTH,north);
		frame.add(BorderLayout.EAST,east);
		frame.add(BorderLayout.SOUTH,south);
		frame.add(BorderLayout.WEST,west);
		frame.add(BorderLayout.CENTER,center);
		
	
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		frame.setVisible(true);


		
	}

}
