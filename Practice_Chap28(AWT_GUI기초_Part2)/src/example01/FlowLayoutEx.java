package example01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutEx {

	public static void main(String[] args) {
		Frame frame = new Frame("FlowLayout");
		
		frame.setSize(300,300);
		
		// ���� ���� ������ ������ ����, �������� 10�ȼ��� ������
		frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
			
		frame.add(new Button("ù��°"));
		frame.add(new Button("�ι�°"));
		frame.add(new Button("����°"));
		frame.add(new Button("�׹�°"));
		frame.add(new Button("�ټ���°"));
		
	
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}

}
