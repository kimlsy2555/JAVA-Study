package example12;

public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA()����");
		notify(); // wait() �� ���� BLOCKED�� �����带 ���� ��� ���·� �ƿ��.
		
		try {
			wait();// ������ �ܴ�. �ٸ������忡�� notify()notifyAll()ȣ��� ���
			
		} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB()����");
		notify(); // wait() �� ���� BLOCKED�� �����带 ���� ��� ���·� �ƿ��.
		
		try {
			wait();// ������ �ܴ�. �ٸ������忡�� notify()notifyAll()ȣ��� ���
			
		} catch (InterruptedException e) {}
	}
}
