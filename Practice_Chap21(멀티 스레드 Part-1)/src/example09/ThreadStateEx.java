package example09;

public class ThreadStateEx {

	public static void main(String[] args) {
		
		// �������� ������ ����Ŭ�� �˾ƺ��� ����
		Thread thread = new StatePrintThread(new TargetThread());
		
		thread.start();

	}

}
