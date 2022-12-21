package example03;

public class WorkThread extends Thread {

	public WorkThread(ThreadGroup threadGroup,String threadName) {
		super(threadGroup,threadName); // ���� Ŭ������ �Ű������� �ִ� ������ ȣ�� 
	}
	
	@Override
	public void run() {
	// ���� ����ǰ� �ִ� ������ �׷��� ����
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		
		String str = mainGroup.getName();
		
		System.out.println("������ �׷� �̸� : "+ str);
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			System.out.println(this.getName()+"���ͷ�Ʈ ȣ���");
			break;
			}
			
		}
		System.out.println(this.getName()+"�����");
		
	}
}
