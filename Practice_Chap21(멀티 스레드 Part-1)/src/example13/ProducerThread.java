package example13;

public class ProducerThread extends Thread{
	
	private DataBox dataBox;
	public ProducerThread( DataBox dataBox) {
		this.setName("ProucerThread");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
	
		for(int i = 1; i<=3;i++) {
			String data ="Data"+ i; // ������ ����
			this.dataBox.setData(data); // �����͸� ������ü�� ����
			
		}
	}

}
