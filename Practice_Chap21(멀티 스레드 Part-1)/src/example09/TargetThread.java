package example09;
// �������� ���¸� �˾ƺ��� ���� Ŭ����
public class TargetThread extends Thread{

	@Override
	public void run() {
	// 20 ��� ����, ����-> ������(Runnable)->����
		for(long i = 0;i<2000000000; i++) {
			
		}
		// �Ͻ����� (TIMED_WAITING)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		for(long i = 0;i<2000000000; i++) {
			
		}
	}// ����(TERMINATED)
}
