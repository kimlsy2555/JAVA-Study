package example07;

public class User2 extends Thread {

	// ���� ��ü����
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator ) {
		this.calculator = calculator;
		this.setName("User-2");
	}
	@Override
	public void run() {
		this.calculator.print();
		// ������ü �ʵ��� memory���� 50�� ����
		this.calculator.setMemory(50);
	}
}
