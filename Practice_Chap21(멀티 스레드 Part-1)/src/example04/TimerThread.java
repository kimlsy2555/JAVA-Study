package example04;

public class TimerThread extends Thread {

	@Override
	public void run() {
		for(int i = 10; i>0;i--) {
			System.out.println("���� �ð� : "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
