package example11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PanelEx {

	public static void main(String[] args) {
	 
		Frame frame = new Frame("Panel");
		
		frame.setBounds(500,300,500,300);
		
		frame.setLayout(null);
		
		// Panel �������� �����̳� �ν� �⺻������ 
		// FlowLayout() �� ����Ѵ�.
		// ���� Panel �ȿ� �� ������Ʈ�� ��ġ�� ���� ���� ���� �ʾƵ� �ȴ�.
		
		Panel panel = new Panel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(50, 50, 150, 150);
		
		Button ok = new Button("ok");
		Button cancel = new Button("cancel");
		
		// �̺�Ʈ ó������ Button�� �̺�Ʈ�� �ٿ����̰�,
		// ActionListener�� ��ư�� ������(������)�� �������
		// ��ư�� Ŭ�� �Ǿ��ٸ� �Ʒ��� actionPerformed()�� ����Ǵ� 
		// �ڵ鷯�̴�.
		
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK��ư Ŭ����");
			}
		});
		
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("cancel ��ư Ŭ����");
			}
		});
		
		// ���� ��ư���� Panel �����̳ʿ� �߰��� �ǰ� �ֱ� ������
		// ������ �����̳ʿ� ������ �޴°��̾ƴ϶�
		// Panel�����̳� ���̾ƿ� �Ŵ����� ������ �޴´ٴ�
		// ��ǵ� �ݵ�� ���� �ؾ��Ѵ�.
		
		
		panel.add(ok);
		panel.add(cancel);
		
		frame.add(panel);

		
		// ������ �̺�Ʈ�� ����ϱ� ���ؼ� �Ű����� ������
		// WindowListener �������̽��� �͸�����ü�� ������ �ϰ� �Ǹ�
		// �Ʒ��� ���� �ʿ���� �޼������ �츮��
		// �������̵��� �ؾ��ϴ� �������� �ִ�.
		// �ڵ差�� �þ �Ӵ��� ���� �������� ��������.
		// �Ͽ� XXXAdapter Ŭ������ ����Ͽ� �ʿ��� 
		// �޼��常 �������̵��� �ϸ� �Ǵ� ���̴�.
		
		
		// ������ �̺�Ʈ ó�� �κ�, �Ű������� ,WindowAdapterŬ�����̴�.
		// WindowAdapter Ŭ������ WindowListener �������̽��� �߻�޼���
		// ���� �� �������̵��� �ص� Ŭ�����̴�. �� ������ ����
		// �Ͽ� �ʿ��� �޼��带 ������ �������̵� �Ͽ� ����ϸ� �ȴ�.
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("������ �̺�Ʈ �߻�");
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}

}
