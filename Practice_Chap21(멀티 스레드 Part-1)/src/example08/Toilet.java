package example08;
// ���� ��ü
public class Toilet {


	// ����ȭ �޼���

	public synchronized void use() throws Exception {
		
		String name = Thread.currentThread().getName();
		
			
			System.out.println(name + "��/�� ȭ��� ����");
		
			Thread.sleep(1000);
			System.out.println(name+"������ -b");
		
			System.out.println(name + "��/�� ȭ��� ����");
		
			System.out.println();

	}
	// �񵿱�ȭ  �޼���
	public  void noke() {
		
		System.out.println(Thread.currentThread().getName()+"�ȵ�");
		
		

		
		
	}
}

