package example07;
 // ���� ��ü
public class Calculator {

	private int memory;
	int vlaue = 100;
	public int getMemory() {
		return this.memory;
	}
	// �񵿱�ȭ �޼��� -> ������ �ŷڼ��� �����ϱ� ���ؼ��� �ݵ�� ����ȭ ó���� �ʼ���.
	public synchronized void setMemory(int memory) {
		
		this.memory= memory;
		
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" : "+this.getMemory());
	}
	
	
	public synchronized void	print() {
	//	System.out.println(Thread.currentThread().getName()+" "+"vlaue �� : "
				//										      +this.vlaue);
		
//		for(int i = 0; i<10;i++) {
//			System.out.println(Thread.currentThread().getName()+" : "+ i);
//		}
	}
}
