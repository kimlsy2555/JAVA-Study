package example04;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TextComponentEvent extends Frame{
	
	TextField textField;
	TextArea textArea;
	
	// ActionEvent�� �߻��Ǵ� ���� 4�������ִ�.
	// 1. Button�� Ŭ���Ǿ��� ��
	// 2. Menu�� Ŭ������ ��
	// 3. TextField���� EnterŰ�� ��������
	// 4. List�� item�ϳ��� �����켭 ����Ŭ���� ���� ��
	
	public TextComponentEvent(String title) {
		super(title);
	}
	
	public void TextComponentShow() {
		
		this.textField = new TextField();
		this.textArea = new TextArea();
		
		// �������� ���� BorderLayout�̹Ƿ� �Ʒ��� ���� �߰��ϸ� �ȴ�.
		
		this.add(textArea,"Center");
		this.add(textField,"South");
		
		// TextField�� �͸� ���� ��ü�� �̺�Ʈ ���Ǹ� �ϰ� �ִ�.
		
		this.textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TextField���� Enter�� ġ��, TextArea�� �Էµ�  
				// text�� TextArea�� �߰��Ѵ�.
				textArea.append(textField.getText()+"\n"); 
				// TextField�� ������ �����.
				textField.setText("");
				textField.requestFocus();
			}
		});
		// TextArea�� ���ڸ� �������� ���ϰ��Ѵ�.
		this.textArea.setEditable(false);
		
		this.setSize(300,200);
		this.setLocation(500,300);
		this.setVisible(true);
		// Focus�� ����ʰ� ���ÿ� TextField�� ��ġ�ϵ��� ����
		this.textField.requestFocus();
		
		
		WindowAdapter wAdapter = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				 System.exit(0);
			}
		};
		
		this.addWindowListener(wAdapter);
		
	}
	
	
	















}

