package example05;

public class ThreadB extends Thread {

	public ThreadB() {
		this.setName("ThreadB");// �������� �̸��� �����ϰ� �ִ�.
	}
	@Override
	public void run() {
		System.out.println("[���� ���� ���� ������] : "+ this.getName());
		for(int i = 0; i<5;i++) {
			System.out.println(this.getName()+"�� ����� ����"+i);
			//  �������� �̸��� ��� 2�������
			// 1 ��°(���� �޼��� �̿�)
			// Thread.currentThread().getNmae()
			// 2��°(�ν��Ͻ� �޼��� �̿�)
			// this.getName()
			
		}
	}
}
