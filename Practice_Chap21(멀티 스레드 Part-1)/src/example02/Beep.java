package example02;

import java.awt.Toolkit;

// Runnable�������̽��� ���� �����ϰ� �ִ�.
public class Beep implements Runnable{
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0;i<5;i++) {
			
			System.out.println("������ ���� ������ �� : "+
								Thread.currentThread().getName());
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		

		}
	}

	
}
