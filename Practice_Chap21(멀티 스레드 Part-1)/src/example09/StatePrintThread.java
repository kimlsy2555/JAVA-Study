package example09;

public class StatePrintThread extends Thread {

	// �������� ���¸� �˾ƺ��� ���� ����� ����
	private TargetThread targetThread;
	
	public StatePrintThread(TargetThread targetThread) {
		
		this.targetThread= targetThread;
	}
	
	@Override
	public void run() {
		while (true) {
			// �������� ���� ������ �˾Ƴ���.
			// Thread.State�� Thread Ŭ���� Enum(������) Ÿ���̴�.
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� : "+ state);
			
			// �����尡 �����Ǿ����� ����
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			// �����尡 ����Ǿ����� ���ѷ��� ����
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
		
	
}
