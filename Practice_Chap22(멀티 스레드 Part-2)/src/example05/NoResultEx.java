package example05;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultEx {

	public static void main(String[] args) {
	
		// ��  PC CUP�� �ھ���� �ִ� ������ ���� �ش�.(Ex ��� �ھ�2�� �����ھ� 4��)	
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
				System.out.println("�ھ� �� :  "+Runtime.getRuntime().availableProcessors());
	//Runnable �͸� ���� ��ü ����(�۾� ��ü)--> ���ϰ��� ����.
				System.out.println("[�۾� ó�� ��û]");
				Runnable runnable = new Runnable() {
					
					@Override
					public void run() {
						int sum = 0;
						for(int i=1;i<=10;i++) {
							sum += i ;
							//���ϰ��� ���⋚���� run()�ȿ��� �����
						}
						System.out.println("[�۾� ó�� ���] : "+sum);
						
					}
				};
				// �۾�ť�� �۾� (runnable��ü)�� �ִ´�
				// �۾��� �Ϸ�� ������ ���ŷ �� ��ٸ���. Future�� ���� �Ϸ� ��ü �̴�.
				
			Future<?>	future = executorService.submit(runnable);
			
			try {
				//get()�� �۾� ��ü�� �۾��� �Ϸ��� ������ ��ٸ���.(���ŷ)
				Object obj = future.get();
				String str= (String)obj;
				System.out.println("[�۾�ó�� �Ϸ�]");
				System.out.println("Future�� get()�� ������ �� : "+str);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
		executorService.shutdown();
	}

}
