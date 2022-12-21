package example08;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("unused")
public class GraphicEx extends Frame implements MouseMotionListener{
	
	int x = 0;
	int y = 0;
	
	 public GraphicEx(String title) {
	 
		 super(title);
		 // �����ʿ� �̺�Ʈ ���
		 this.addMouseMotionListener(this);
		 this.addWindowListener(new WindowAdapter() {
			 
			 @Override
			public void windowClosing(WindowEvent e) {

				 System.exit(0);
			}
		});
		 this.setBounds(100, 100, 500, 500);
		 this.setVisible(true);
 
		 
	}
	
	 // AWT������� ��ҿ� �ڿ��� �����ϴٰ� ,GUI���ø����̼� ���α׷��� ���۵Ǹ�
	 // �ڵ����� paint()�� ȣ���Ѵ�. AWT�����忡 ���ؼ� �ڵ������� ȭ���� ���ŵǴ�
	 // ��Ȳ�� ������ �غ��� �Ʒ��� ����.
	 // 1. ó�� ȭ�鿡 ��Ÿ�� ��
	 // 2. �ٸ����鿡 ������ �ִ� �κ��� �ٽ� ȭ�鿡 ��Ÿ�� ��
	 // 3. ������ȭ �Ǿ� �ִٰ� ���� ũ��� ȭ�鿡 ��Ÿ�� ��
	 // ������ �̷� ���� ��Ȳ �̿ܿ��� ȭ���� �ٽ� �׷������� ��ó�� ���� �ִ�.
	 // �׹���� repaint()�� ȣ���ϴ� ���̴�. ����ڰ� repaint() ȣ���ϸ�
	 // AWT�����忡�� �ٽ� ȭ���� �׸���� ��û�ϴ� ���̴�.
	 // AWT������� update()ȣ���ϰ� ���� update()�� �ٽ� paint()�� ȣ���Ѵ�.
	 
	 // repaint() - AWT�����忡�� ȭ���� ������ ���� ��û�� 0.1�ʸ���
	 // ��û�� ������ update()�� ȣ�� 
	 // update(Graphics g) - ȭ���� ����� paint()ȣ���Ѵ�.
	 
	 
	 
	 @Override
	public void paint(Graphics g) {
		 System.out.println("paint()�� �����̴� ������ "+Thread.currentThread().getName());
		 g.drawString("���콺�� ������ ������", 10, 50);
		 g.drawString("*", this.x,this.y);
	 }

	@Override
	public void mouseMoved(MouseEvent e) {
		
		this.x = e.getX();
		this.y = e.getY();
		
		this.repaint();
		
		
		
	}
	
	// update()�� ���� ȭ���� �������� �����, paint()�� ȣ���ϴµ� ������ �������̵���
	 // �߱� ������ ȭ���� �������� �ʰ� ����, paint()�� ȣ���ϰ� �ִ�.
	 // ȭ���� ��󠺴ٰ� �ٽ� Ȱ��ȭ �Ǹ�, paint()�� ȣ��Ǿ����Ƿ� ȭ�鿡�� ������ �ִ� ������
	 // ������� �ȴ�. �� ������ Frame��  ���� �׷ȱ� �����̴�.
	 
	 // ���� ���������� ���� ImageŬ������ �̿��ؼ� ����ȭ���� ���� �׸��� 
	 // ����ȭ�� �����ӿ��� ���� �����ϴ� �ڵ带 �־��ָ� �������� ���� ���̴�.
	
	
	@Override
	public void update(Graphics g) {
	
			System.out.println("update()�� �����̴� ������"+Thread.currentThread().getName());
			paint(g);

	}
	@Override
	public void mouseDragged(MouseEvent e) {}
}
