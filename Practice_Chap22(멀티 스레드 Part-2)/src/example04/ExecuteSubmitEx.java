package example04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitEx {

	public static void main(String[] args)  {
		// �ִ� 2���� �����带 ������ ������Ǯ �����ϱ�
		
		ExecutorService  executorService = Executors. newFixedThreadPool(2);
		
		for(int i = 0; i<20;i++) {
			//20���� �۾���ü �����
			Runnable runnable = new  Runnable() {
				
				@Override
				public void run() {
					// newFixedThreadPool(). newCachedThreadPool()�� ���������� 
					// ThreadPoolExecutor �� ����� ���� ������ ���� Ÿ�Ժ�ȯ�� �����ϴ�
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					
					// ���� ������Ǯ�� �ִ� ������ ������ ��������
					int poolSize = threadPoolExecutor.getPoolSize();
					
					
					//�۾����� ������ ���� ��� 
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ �� : "+poolSize+"] "+"�۾� ������ �̸� : "+ threadName);
					
					// ���ܹ߻� ŷ�η�
					// executor() Submit() ����  ������ ���� ������ ��Ȱ��
					Integer.parseInt("��");
					
				}
			};
			
			// �۾� ť�� runnable ��ü�� �ִ� ����, execute()�� �۾�ó�� ���߿� ���ܰ� �߻� �ϸ�
			// �ش� �����带 ������Ǯ���� �����ϰ� ���ο� �����尡 �����ȴ�.
			// submit()�� ���ܰ��߻��ϴ���,
			// �ش� �����带 ������ Ǯ���� �������� �ʰ� ������ ���� �� �� �ִ�.
			// �Ͽ� submit()�� ����ϴ°��� cpu ���ϰ� ���� �ٶ��� �ϴ�.
			
			//executorService.execute(runnable);
			executorService.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
			
			// ������ Ǯ ����(�� ,�۾�ť�� �ִ� ��� �۾��� �������� �� ������)
			
		}
		executorService.shutdown();
	}

}



