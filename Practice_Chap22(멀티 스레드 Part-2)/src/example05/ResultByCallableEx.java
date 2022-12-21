package example05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableEx {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		//Callable �Ϳ� ���� ��ü�� ���� (�۾� ��ü)--> ���ϰ��� <T>Ÿ������ �����ϹǷ�
		// ���� Ÿ�Ե� ����<T> Ÿ���̿����Ѵ�.
		System.out.println("[�۾� ó�� �䫊]");
		Callable<Integer> callable = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				
				int sum = 0;
				for(int i=0;i<=100;i++) {
					sum += i;
				}
				return sum;
			}
		};		
		// �۾�ť�� �۾���ü�� �ִ´�.
		// Future ���׸� ���� ���� <T>Ÿ������ ��������� �Ѵ�.
		System.out.println("���ŷ ���� : "+System.currentTimeMillis());
		Future<Integer>future= executorService.submit(callable);
		
		try {
			int value = future.get();
			System.out.println("���ŷ ���� : "+System.currentTimeMillis());
			System.out.println("[�۾� ó�� ���] : "+value);
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch (InterruptedException | ExecutionException e) {
		
			e.printStackTrace();
		}
		
		executorService.shutdown();
		
		
		
	}

}
