package example07;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicEx extends Frame{
	
	public GraphicEx(String title) {
		super(title);
		this.setBounds(100,100,400,300);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
	
	// paint �޼��带 ȣ���ϴ� ���� ��𿡵� ����.
	@Override
	public void paint(Graphics g) {
		// AWT�����尡 paint()�� ȣ���ϰ� �׸����� �׷��ִ� ������ �Ѵ�.
		Thread thread = Thread.currentThread();
		System.out.println("Paint() �����̴� ������ "+thread.getName());
		// ��Ʈ����
		g.setFont(new Font("Serif",Font.PLAIN,15));
		// ���ڿ� ���
		g.drawString("Graphics�� �̿��ؼ� �׸��� �׸��ϴ�.", 10, 50);
		
		// Ÿ���� �׸��� �κ�
		g.drawOval(200, 100, 100, 50); // �׳� ���̺�� 
		
		// �Ķ������� ���� ������ �Ѱͻ�
		g.setColor(Color.blue); // ���� �׷����� ���� ������ ������
		g.fillOval(50, 100, 100, 50); // �ȱ��� ä���� ��
		
		// ���׸��� 
		g.setColor(Color.RED); 
		g.drawLine(100 , 20, 150, 150);
		
		// �ձ� �簢��
		g.setColor(Color.green);
		g.fillRoundRect(150, 200, 120, 80, 30, 30);
		
		// ȣ �׸���
		
		g.setColor(Color.ORANGE);
		g.fillArc(250, 200, 100, 100, 0, 120);
		
	}
}
