package example12;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollPaneEx {

	public static void main(String[] args) {
		 	
		Frame frame = new Frame("ScrollPane");
		frame.setSize(300,300);
		
		// ������ �����̳ʷ� ��, �ϳ��� ������Ʈ �� ���� ��ų�� �ִ�
		// �����̳��̴�. ũ�⸦ �ٿ��ٰ� �ÿ��� �ϸ� ��ũ�ѹٰ� �ڵ�����
		// �����Ǵ� ���� ������ �ִ�.
		ScrollPane sPane = new ScrollPane();

		Panel panel = new Panel();
		panel.setBackground(Color.MAGENTA);
		
		panel.add(new Button("ù ��°"));
		panel.add(new Button("�� ��°"));
		panel.add(new Button("�� ��°"));
		panel.add(new Button("�� ��°"));
		
		
		
		sPane.add(panel);
		frame.add(sPane);
		
		frame.setVisible(true);
	
	
	
	
	
	}

}
