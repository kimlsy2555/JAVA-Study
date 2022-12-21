package example13;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogEx_Enevnt {

	public static void main(String[] args) {
		Frame frame = new Frame("Dialog");
		frame.setSize(500,500);
		
		Dialog dialog = new Dialog(frame, "Info", false);
		dialog.setSize(150,100);
		
		dialog.setLocation(550, 50);
		dialog.setLayout(new FlowLayout());
		
		Label label = new Label("�� ���̾�α״� �����",Label.CENTER);
		
		Button button = new Button("Ȯ��");
		
		// Button�� Ŭ���ϸ� Dialog�� �������.
		// �ƿ﷯ dispose()�� ���ؼ� �޸𸮿��� ���Ű� �ȴ�.
		
		button.addActionListener(new ActionListener() {	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���̾�α� ��ư �̺�Ʈ �߻�");
				dialog.setVisible(false);
				dialog.dispose(); // �޸�����
			}
		});
		
		dialog.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.out.println("���̾�α� ���� �̺�Ʈ �߻�");
				dialog.setVisible(false);
				dialog.dispose();
			}
		});
		// �����ϱ�
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.out.println("������ ���� �̺�Ʈ �߻�");
				System.exit(0);
			}
		});
		
		dialog.add(label);
		dialog.add(button);
		
		frame.setVisible(true);
		dialog.setVisible(true);
	}

}
