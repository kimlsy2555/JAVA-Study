package example10;

public class ThreadA extends Thread {

	public boolean stop = false;
	
	public boolean work = true;
	
	@Override
	public void run() {
	
		while(!stop) {
			if(work) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {}
				System.out.println("ThreadA �� �۾� ����");
			}
			else {
				// ���ǹ��� �ݺ��� �������ؼ� �ٸ� ������ ���� �纸����
				Thread.yield();

			}

		}
		System.out.println("ThreadA ����");
	}
}
