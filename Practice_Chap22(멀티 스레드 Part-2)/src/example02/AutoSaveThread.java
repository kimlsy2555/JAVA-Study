package example02;

public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("�۾� ���� ������");
	}
	@Override
	public void run() {
		// 1�ʴ����� save() �޼ҵ� ȣ��
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			this.save();
		}
	}
	
	
	
	
}
