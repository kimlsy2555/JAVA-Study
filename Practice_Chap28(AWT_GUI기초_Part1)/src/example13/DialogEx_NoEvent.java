package example13;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class DialogEx_NoEvent {

	public static void main(String[] args) {

		Frame frame = new Frame("Dialog");
		frame.setSize(500,500);
		
		//parent Frame �� (��� ���谡 �ƴϴ�.) frame���� �ϰ� modal��
		// true�ؼ� �ʼ� ���� Dialog�� �Ѵ�.�̷��� �Ǹ�
		// Dialogâ�� ������ �� �������� Frame�� ����� ���� �ִ�.
		// ������ false������ �ϰ� �Ǹ� 
		// ���������� ���� �ൿ�Ѵ�.
		
		Dialog dialog = new Dialog(frame, "Info", true);
		dialog.setSize(150,100);
		
		// Dialog�� ��ġ�� ������ �������� �����̳��̱� ������
		// �����츦 �������� ��ġ�� ��´�.
		dialog.setLocation(550, 50);
		dialog.setLayout(new FlowLayout());
		
		Label label = new Label("�� ���̾�α״� �����",Label.CENTER);
		
		Button button = new Button("Ȯ��");
		
		dialog.add(label);
		dialog.add(button);
		
		frame.setVisible(true);
		dialog.setVisible(true);
		
		
		
	}

}
