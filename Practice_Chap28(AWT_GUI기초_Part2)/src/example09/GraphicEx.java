package example09;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicEx extends Frame implements MouseMotionListener{
	
	int x = 0;
	int y = 0;
	
	// �ʵ�� Image��ü�� Graphics��ü�� �����ߴ�.
	Image img = null;
	Graphics gImg= null;
	public GraphicEx(String tiile) {
		 
		super(tiile);
		this.addMouseMotionListener(this);
	  
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		
		// Image�� Image�� Graphics�� ��� ������  �����ϰ�, �����ڿ��� createImage()�� 
		// ���ؼ� Frame�� ���� ũ���� Image�� �����ϰ� ,������ Image���� getGraphics()�� ȣ���Ͽ�
		// Image�� ���� Graphics�� ��´�. �̷��� �ؼ� ����� Graphics�� drawString() ȣ���ؼ�
		// �۾��� ������ Image�� �׷����� �Ѵ�.
		
		
		
		this.img = this.createImage(500,500);
		this.gImg = img.getGraphics();
		this.gImg.drawString("���� ��ư�� ����ä�� ���콺�� ������ ������", 10, 50);
		repaint();
		
	}
		
	@Override
	public void paint(Graphics g) {
	  if(this.img != null) {
		  
		  // ����ȭ�鿡 �׷��� �׸��� frame�� �����ϰ�  �ִ� �����̴�.
		  // �� �κ��� Image�� �׷��� ������ ��� this(Frame)�� ���縦 �ϰ� �ִ�
		  // ���⼭ ImageObserver�� this�� ���� ���ִµ� ImageObserver
		  // �������̽��� ��� ������Ʈ Ŭ������ ������ �������̽��̴�.
		  // �̹����� �ε��Ǵµ� �ð��� �ɸ��� ������ �ε��� ����ǰ� �ִ� ���¸� 
		  // ���������� �˷���� �ϴµ� �״���� �ٷ� �̼ҽ� ������ this�� �ȴ�.
		  // �ε��Ǵ� ���¿� ���� ȭ�鿡 �ٽ� �׷���� �Ѵ�.
		  
		  
		  System.out.println(Thread.currentThread().getName());
		  System.out.println("����Ʈ");
		  
		  g.drawImage(img, 0, 0, this);
	  	}
		  
	}
	
	

	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			
			this.x = e.getX();
			this.y = e.getY();
			this.gImg.drawString("*",this.x, this.y);
			repaint();
		}
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	
}
