package example10;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class CanvasEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Canvas");
		
		frame.setSize(300,200);
		frame.setLayout(null);
		
		
		// Canvas�� ���� �������� ���� ����Ǿ� ������ �ʴ´�.
		// ImageView, Label, MideaView �� ��ü�Ǿ� ����.
		
		Canvas canvas = new Canvas();
		// Canvas �� ���� �� �Ķ������� �Ѵ�.
		canvas.setBackground(Color.blue);
		canvas.setBounds(50, 50, 150, 100);
		
		frame.add(canvas);
		frame.setVisible(true);
		
	}

}
