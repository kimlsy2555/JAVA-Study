package example08;

public class ToileEx {

	public static void main(String[] args) {
		
		Toilet toilet =new  Toilet();
		
		Thread thread1 = new UsingThread(toilet, "�ƹ���");
		Thread thread2 = new UsingThread(toilet, "��Ӵ�");
		Thread thread3 = new UsingThread(toilet, "�Ƶ�");
		Thread thread4 = new UsingThread(toilet, "��");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	
	}

}
