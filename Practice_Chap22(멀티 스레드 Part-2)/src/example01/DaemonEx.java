package example01;

public class DaemonEx {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		// deamon ����(���� ,strat() ȣ�� ���� ���� �ؾ��Ѵ�.)
		
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		// ���ν����尡 5�� ���� �����ϸ� ,daemon �������� autoSaveThread��
		// ����ǰ� , ���ν����尡 ����Ǹ� �� �̻� autoSaveThread ������� ����
		// ������ ���� 
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("���� ������ �����");
	}

}
