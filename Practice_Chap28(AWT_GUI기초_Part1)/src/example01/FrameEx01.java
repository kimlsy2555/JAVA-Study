package example01;

import java.awt.Frame;

public class FrameEx01 {

	public static void main(String[] args) {
		
		// �������� ������Ʈ�̸鼭 �����̳��̴�.
		Frame frame = new Frame("Longin");
		
		// �������� ũ�⸦ ����, ���η� �����Ѵ�.(ComponentŬ������ ���ǵ� �޼���)
		frame.setSize(300,500);
		// �������� ��ġ�� �����Ѵ�
		frame.setLocation(500,200);
		
		// setLocation �� setSize �� ���ĳ��� �޼���  setBounds()
		//frame.setBounds(500, 200, 300, 500);
		
		// ������ �������� ȭ�鿡 ���̵��� �Ѵ�.
		frame.setVisible(true);
		
		// ������ �������� �ݱ� ���ؼ� �ݱ� ��ư�� ������ �ݱ⸦ �ؾ� �ϴµ�
		// ������ �̺�Ʈ ó���� �Ǿ� ���� �ʱ� ������ �ܼ�â�� Terminate
		// ���� ��ư�� �̿��ؼ� �ݵ��� ����.
		
		
	}

}
