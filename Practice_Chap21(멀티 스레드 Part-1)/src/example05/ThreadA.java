package example05;

public class ThreadA extends Thread {

	public ThreadA() {
		this.setName("ThreadA");// �������� �̸��� �����ϰ� �ִ�.
	}
	@Override
	public void run() {
		System.out.println("[���� ���� ���� ������] : "+ this.getName());
		for(int i = 0; i<5;i++) {
			System.out.println(this.getName()+"�� ����� ���� : "+i);
		}
	}
}
