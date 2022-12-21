package example02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TextFieldEvent extends Frame {
	
	 
			
		Label lId;
		Label lPwd;
		TextField tfid;
		TextField tfPwd;
		
		Button ok;
	
		public TextFieldEvent(String title) {
			
			super(title); // ����Ŭ������ Frame(String title)�� ȣ����
			
		}
		public void textFieldShow() {
			this.lId = new Label("TD : ",Label.RIGHT);
			this.lPwd = new Label("PassWord : ",Label.RIGHT);
			
			this.tfid  = new TextField(10);
			this.tfPwd  = new TextField(10);
			
			this.tfPwd.setEchoChar('*'); // ��й�ȣ �Ⱥ��̰� ����
			
			this.ok = new Button("OK");
			
			this.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
				
				System.exit(0);
				}
			});
			
			
			// ������ ���
			this.tfid.addActionListener(new EventHandler());
			this.tfPwd.addActionListener(new EventHandler());
			this.ok.addActionListener(new EventHandler());
			
			this.setLayout(new FlowLayout());
			
			this.add(lId);
			this.add(tfid);
			
			this.add(lPwd);
			this.add(tfPwd);
			
			this.add(ok);
			this.setSize(450,80);
			this.setLocation(500,300);
			this.setVisible(true);
			this.setResizable(false);
			
		}
		// ���� Ŭ���� �ۼ�
		class EventHandler implements ActionListener {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				String id = tfid.getText().trim();
				String pwd = tfPwd.getText().trim();
				
						if(!id.equals("spark")) {
							System.out.println("���̵� Ʋ�ǽ��ϴ�.");
							tfid.requestFocus(); // ���콺Ŀ��(��Ŀ��)�� �ٽ� ���̵�â���� ����
							tfid.selectAll(); // �Է��� ���ڸ� ���� ���õǰԲ� ��
							
							
						}
						else if(!pwd.equals("12345")) {
							System.out.println("��й�ȣ�� Ʋ�ǽ��ϴ�.");
							tfPwd.requestFocus(); // ���콺Ŀ��(��Ŀ��)�� �ٽ� ��й�ȣâ���� ����
							tfPwd.selectAll(); // �Է��� ���ڸ� ���� ���õǰԲ� ��
						}
						else {
							System.out.println(id+"�� ȯ���մϴ�.");
						}
			
			
			}
			
		}
		
	
 }
