package example10;

public class YieldEx {

	public static void main(String[] args) throws Exception{
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		//2�ʵ����� ThreadA ThreadB ������ ���鼭 ����� �Ѵ�.
		Thread.sleep(3000);
		
		threadA.work = true;
		threadB.work = false;
		
		Thread.sleep(3000);
		threadA.stop = true;
		threadB.stop = true;
		
	}

}
