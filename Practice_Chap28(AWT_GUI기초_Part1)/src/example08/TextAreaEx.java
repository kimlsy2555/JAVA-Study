package example08;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaEx {

	public static void main(String[] args) {
	 
		Frame frame = new Frame("TextArea");
		
		frame.setSize(400,220);
		frame.setLayout(new FlowLayout());
		
		// text - TextArea�� ������ Text�� �����Ѵ�.
		// row - ��(row)�� ���� ����
		// col - ��(column) �� ���� ����
		TextArea tArea = new TextArea("�ϰ� ���� ���� �������� ",10,50, TextArea.SCROLLBARS_BOTH);
		
		frame.add(tArea);
		
		// TextArea�� text �� ��ü ���� �ǵ��� �Ѵ�.
		tArea.selectAll();
	
		frame.setVisible(true);
	}

}
