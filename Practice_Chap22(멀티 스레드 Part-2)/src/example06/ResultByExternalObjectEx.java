package example06;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByExternalObjectEx {
	
	public static void main(String[] args) {
		
		ExecutorService executorService =  Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		System.out.println("[�۾� ó�� ��û]");
		
		// ���� Ŭ����
		
		class Task implements Runnable {
			// �ܺ� ��ü�� ������ ��� ���ؼ�
			Result result;
			
			public Task(Result result) {
				this.result = result;
			}
			@Override
			public void run() {
				int sum = 0;
				for(int i=1;i<=10;i++) {
					sum += i;
				}
				
				// �����忡 ���ؼ� ���Ǿ��� ���� ���� ��ü�� Result��
				// �����ϱ� ���ؼ� addValue() �� ȣ���Ѵ�.
				result.addValue(sum);
				System.out.println("���� ���� ������ �̸� : "+ Thread.currentThread().getName());
				System.out.println("�۾��� ��� : "+result.getValue());
			}
			
		}
		
		// ���� ��ü�ǻ���
		
		Result result = new Result();
		// �۾���ü ����
		
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		// �۾� ��û�ϱ�
		Future<Result> future1 = executorService.submit(task1,result);
		try {
			result = future1.get();
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
			
		Future<Result> future2 = executorService.submit(task2,result);
		try {
			result = future2.get();
			System.out.println("[�۾� ó�� ���] : "+ result.getValue());
			System.out.println("[�۾� ó�� �Ϸ�]");

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	
		System.out.println("���� ���� ������ �̸� : "+Thread.currentThread().getName());
		System.out.println("�۾� ��� : "+result.getValue());
		
		executorService.shutdown();
	}
	

}
