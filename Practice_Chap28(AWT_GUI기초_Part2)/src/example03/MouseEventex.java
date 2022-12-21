package example03;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MouseEventex extends Frame {
	
	
	private Label location;
	
	public MouseEventex(String title) {
		
		super(title);
		

	}
	
	public void MouseShow() {
		this.setSize(300,200);
		this.setLocation(500, 300);
		// Label �� ���� ����
		this.location = new Label("");
		this.location.setBounds(50, 50, 200, 20);
		this.location.setBackground(Color.YELLOW);
		
		this.add(location);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}});
		// �̺�Ʈ ������ ���
		
		// ���콺 Ŭ�������� �̺�Ʈ ����
		this.addMouseListener(new EventHandler()); 
		//  ���콺 �̵��� ���� �̺�Ʈ ����
		this.addMouseMotionListener(new EventHandler()); 
		
		this.setLayout(null);
		this.setVisible(true);
	}
	
	class EventHandler extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			 if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
				 // ���� �����尡 �̷��� �̺�Ʈ�� ó���� ���ִ� ���̾ƴ϶�
				 // AWT �����尡 ���� ó���� �ϰ� ������ Ȯ���� ���� �ִ�.
				 System.out.println("���콺Ŭ�� �̺�Ʈ ó�� ������"+Thread.currentThread().getName());
				 System.out.println("X : "+e.getX()+" Y : "+e.getY());
			 }
		 
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			// �ֿܼ��� ǥ��
			 System.out.println("���콺���� �̺�Ʈ ó�� ������"+Thread.currentThread().getName());
			 //Label�� ǥ���Ѵ�
			 location.setText("X : "+e.getX()+" Y : "+e.getY());
		
		}
		
	}
	
}
