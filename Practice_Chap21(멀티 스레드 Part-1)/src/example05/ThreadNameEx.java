package example05;

public class ThreadNameEx {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		
		System.out.println("���α׷� ���� ������ �� : "+thread.getName());
		
		Thread threadA = new ThreadA();
		System.out.println("[ThreadA �� ������ ������ �̸�]: "+Thread.currentThread().getName() );
		System.out.println("[main �����尡 threadA�� �̸��� ������ ��] : "+ threadA.getName());
		threadA.start();
		
		
		Thread threadB = new ThreadB();
		System.out.println("[ThreadB �� ������ ������ �̸�]: "+Thread.currentThread().getName() );
		System.out.println("[main �����尡 threadB�� �̸��� ������ ��] : "+ threadB.getName());
		threadB.start();
		
		// �� �� �ڵ���� ���̽����� 2���� �����带 �����ؼ� start() �����ִ°�
		// ��μ� threadA�� threadB�� ���������� ������ �̷��  ����.
	}

}
