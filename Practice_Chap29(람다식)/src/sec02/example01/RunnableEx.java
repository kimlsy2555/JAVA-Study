package sec02.example01;

public class RunnableEx {

	public static void main(String[] args) {
		
		
		// ���� ���� �͸�����ü�� ���� ���
		Runnable runnable = new Runnable( ) {
			
			@Override
			public void run() {
				 for(int i =0;i<10;i++) {
					 System.out.println(i);
				 }
				
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		
		System.out.println("===================");

	
		// ���ٽ����� ���� �ۼ��Ͽ� Thread�� �Ű������� �ִ� �ڵ� (���1)
		 runnable = ()->{
			 System.out.println("����1");
			for(int i =0;i<10;i++) {
				
				 System.out.println(i);
			 }
		};
		
	    thread = new Thread(runnable);
		thread.start();
		 
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		
		System.out.println("===================");
		
		thread = new Thread( ()-> {
			System.out.println("����2");
			for(int i =0;i<10;i++) {
				
				 System.out.println(i);
			 }
	
		}); 
		
		 
		thread.start();

	}

}
