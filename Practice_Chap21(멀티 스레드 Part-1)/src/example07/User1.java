package example07;

public class User1 extends Thread {

	// ���� ��ü����

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator ) {
		this.calculator = calculator;
		this.setName("User-1");
	}
	@Override
	public void run() {
		this.calculator.print();
		// ������ü �ʵ��� memory���� 100�� ����
		this.calculator.setMemory(300);
		
	}
}
