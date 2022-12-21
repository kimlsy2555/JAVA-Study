package example05;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class CheckEx extends Frame{
	
	CheckboxGroup group;
	Checkbox cb1;
	Checkbox cb2;
	Checkbox cb3;
	
	// �����ڿ��� �ѹ��� ó�� �ϱ�
	
	public CheckEx(String title) {
		super(title);
		this.group = new CheckboxGroup();
	
		// �Ʒ� 3���� CheckBox�� CheckboxGroup�� ���ϰ� ������
		// �ϳ��ۿ� ������ ���� ���Ѵ�.
		// ���� , �Ű��� �� 3��°�� true�� ����ÿ� �̸� üũ�� �϶�� �� ���̴�.
		this.cb1 = new Checkbox("red",group,true);
		this.cb2 = new Checkbox("green",group,false);
		this.cb3 = new Checkbox("blue",group,false);
		
		// CheckBox�� ������ CYAN���� �����Ͽ���.
		this.cb1.setBackground(Color.CYAN);
		this.cb2.setBackground(Color.CYAN);
		this.cb3.setBackground(Color.CYAN);
		
		this.cb1.addItemListener(new EventHadler());
		this.cb2.addItemListener(new EventHadler());
		this.cb3.addItemListener(new EventHadler());
		// CheckBox�� ItemListener�� ����ϰ� �ִ�.
	

		this.setLayout(new FlowLayout());
		
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		
		this.setBackground(Color.RED);// ���۽� ������ ������ RED����
		this.setSize(500,300);
		this.setLocation(500,300);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
	
	}
	// ��ø Ŭ������ EventHadlerŬ������  ItemListener �������̽��� �����ϰ��ִ�.
	
	class EventHadler implements ItemListener{
	
		// CheckBox�� ��ư�� Ŭ���ϰ� �Ǹ� itemStateChanged()�� ȣ��ȴ�.
		@Override
		public void itemStateChanged(ItemEvent e) {
		 System.out.println("������ �̺�Ʈ �߻���");
		
		// getSource()�� ��� �̺�Ʈ Ŭ������ ������ 
		// java.util.EventObjectŬ������ �ִ� ������ �޼����̸鼭
		// ��� �̺�Ʈ Ŭ�������� ����Ҽ��� �ִ�.
		// ����Ÿ���� Objcet�� Ÿ�Ժ�ȯ�� �ʿ��ϴ�.
		 
		Checkbox cb = (Checkbox)e.getSource();
		String color = cb.getLabel();
		
				if(color.equals("red")){
					CheckEx.this.setBackground(Color.red);
				}
				else if(color.equals("green")) {
					CheckEx.this.setBackground(Color.green);
				}
				else  {
					CheckEx.this.setBackground(Color.blue);
				}
			
			
			}
		
		
		}

}
