package example01;

import java.awt.Toolkit;

public class BeepPrintEx {
	
	// main() �� JVM�� �����Ѵ�.
	public static void main(String[] args) {
		// ���� ���� ���� ��������� �����
		//System.out.println(Thread.currentThread().getName());
		
		
		// Tooljit�� �߻� Ŭ�����ε�, ���߿� GUI ���õ� �޼��� ��� �����Ǿ���
		// �ν��Ͻ���  getDefaultToolkit() �� ���ؼ� Toolkit Ŭ������ ������ 
		// ����.
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 
		 for(int i = 0; i<5;i++) {
			
			 System.out.println("for���� �����ϴ� ������ �̸� : "+
					 			Thread.currentThread().getName());
			 toolkit.beep(); // ������ ��� 
			 
			// �����尡 �ʹ� ���� ����Ǽ� ������ �׽��� �ȵ�
			// �׷��� sleep() �޼��带 �̿��Ͽ� ������ ������ ��� ���� 0.5�ʵ���
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {e.printStackTrace();}
		 }
		 
		 for(int i = 0; i<5;i++) {
	
			System.out.println("����~");
			 try {
				 Thread.sleep(500);
			} catch (InterruptedException e) {e.printStackTrace();}
		 }
	
		 // �̱۽����带 ��Ƽ������� �ٲ㼭 ���α׷����� ����°��� �츮�� ����
		 // �������� �����鼭 �����̶�� ��� ������ ���� ��Ÿ���� ���� 

	}

}
