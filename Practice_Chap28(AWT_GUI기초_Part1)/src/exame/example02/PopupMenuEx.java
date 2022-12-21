package exame.example02;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopupMenuEx {

	public static void main(String[] args) {
		 
		Frame frame = new Frame("PopupMenu");
		frame.setSize(300,200);
		
		PopupMenu pMenu = new PopupMenu(); 
		
		MenuItem mCut = new MenuItem("�߶󳻱�");
		MenuItem mCopy = new MenuItem("�����ϱ�");
		MenuItem mPaste = new MenuItem("�ٿ��ֱ�");
		
		// �˾��޴��� �޴������� �߰���
		
		pMenu.add(mCut);
		pMenu.add(mCopy);
		pMenu.add(mPaste);
		
		frame.add(pMenu);
		
		// �����ӿ� �̺�Ʈ ó���� ���ؼ� ������ �߰��Ͽ���.
		// ���콺 ������ Ŭ������ �߰��Ͽ� �������̵��� �ϴ� �͸� �ڽİ�ü�� ������ִ�.
		
		frame.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				 if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					 
					 System.out.println("���콺 ������ X : "+e.getX());
					 System.out.println("���콺 ������ y : "+e.getY());
					 
					 pMenu.show(frame, e.getX(), e.getY());
					 
				 }
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}

}
