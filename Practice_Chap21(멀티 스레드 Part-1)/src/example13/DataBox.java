package example13;

// ������ü
public class DataBox {

	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				System.out.println("!!!");
				wait();
				
			} catch (InterruptedException e) {}
		}
		String returnValue = this.data;
		
		System.out.println(Thread.currentThread().getName()+"�� ���� ������ "+ this.data);
		this.data = null;
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
	
		// Consumer  �����尡 �����͸� �Һ����� �ʾҴٸ�...
		if(this.data != null) {
			try {
				System.out.println("zzz");
				wait();
			} catch (InterruptedException e) {}
			
		}
		
		this.data = data;
		System.out.println(Thread.currentThread().getName()+"�� ������ ������ : "+this.data);
		
		notify();
	}
}
