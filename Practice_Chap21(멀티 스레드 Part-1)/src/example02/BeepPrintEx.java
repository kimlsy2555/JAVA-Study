package example02;

import java.awt.Toolkit;

public class BeepPrintEx {
	
	// main() �� JVM�� �����Ѵ�.
	public static void main(String[] args) {
		
		// ���� �����ϴ� ��Ƽ������ ��� 3����
		// ��� 1 --> ���� ��ü ����
		Runnable runnable = new Beep(); // ������ü ����
		Thread thread = new Thread(runnable);
		thread.start();
		// ������� �ѹ� start() �� �ٽ����ϰ� ���� ,������� �ȵȴ�.
		// ������� �ϰ����Ѵٸ� �Ʒ��� ���� �ν��Ͻ��� �Ѱ� �� �������Ѵ�.(�߿�)
//		thread = new Thread(runnable);
//		thread.start();
		
		//��� 2 --> �͸� ���� ��ü
		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//			
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				
//				for(int i = 0;i<5;i++) {
//					
//					System.out.println("������ ���� ������ �� : "+
//										Thread.currentThread().getName());
//					toolkit.beep();
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {}
//				
//
//				}
//			}
//		});
//		thread.start();
		
		
		
		// ���3 --> ���ٽ�(�Լ��� �������̽� (�������̽� �Լ��� ��1��)) JDK1.8 �ڵ����� ������ b
//			Thread thread = new Thread( ()-> {
//				
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				
//				for(int i = 0;i<5;i++) {
//					
//					System.out.println("������ ���� ������ �� : "+
//										Thread.currentThread().getName());
//					toolkit.beep();
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {}
//				
//
//				}
//			});
//			thread.start();
		
		 for(int i = 0; i<5;i++) {
			 System.out.println("for���� �����ϴ� ������ �̸� : "+
			 			Thread.currentThread().getName());
			System.out.println("����~");
			 try {
				 Thread.sleep(500);
			} catch (InterruptedException e) {e.printStackTrace();}
		 }
	
		 // �̱۽����带 ��Ƽ������� �ٲ㼭 ���α׷����� ����°��� �츮�� ����
		 
		 
		 
		 
		 
		 
	}

}
