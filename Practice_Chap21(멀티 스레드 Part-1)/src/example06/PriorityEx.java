package example06;

public class PriorityEx {

	public static void main(String[] args) {
		
		Thread thread1 = Thread.currentThread();
		System.out.println(thread1.getName()+" : "+thread1.getPriority());
		for(int i = 1; i<=5; i++) {
			
			Thread thread = new CalcThread("Thread : "+i);
			// Thread1,2,3,4 �� �켱������ ���� ����.
			
			if(i!= 5) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
			// �ƹ��� �켱������ 10���� �־��� �ϳ� �۾��� ��ġ�� �󵵰� ���� ��
			// ������ 100% ���� �����ٴ� ������ ����.
			// ������ �ڹٴ� ��ȯ�Ҵ�(Round-Robin)����� ����ϰ� �ֱ� ������
			// CPU �����췯�� ���¿� ���� �޶�����.
			
			// �켱������ ���� ���ΰ� �ƴϴ�
		}

	}

}
