package example06;

public class CalcThread extends Thread{

	long sum;
	public CalcThread(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
	
		for(int i = 0;i<20000000;i++) {
			sum+=i;
		}
		System.out.println("[�۾� �Ϸ� ������] : "+this.getName());
		System.out.println("[�հ�]"+this.sum);
	}
}
