package example04;

import javax.swing.JOptionPane;

public class TimerEx {

	public static void main(String[] args) throws Exception {
		
		Thread thread = new TimerThread();
		thread.start();

		String input = JOptionPane.showInputDialog("10 �ʾȿ� ���� �Է��Ͻÿ� ");
		
		if(input != null) {
			System.out.println("�Է� �� : "+input);
			System.exit(0);
		}
		else
		{
			Thread.sleep(10000); /// 9�ʴ��
			System.out.println("�Է� ���� ��");
			System.exit(0);
		}
		
		
		
		
		
		
		
	}

}
