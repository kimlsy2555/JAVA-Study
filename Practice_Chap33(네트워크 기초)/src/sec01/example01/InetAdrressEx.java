package sec01.example01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdrressEx {

	public static void main(String[] args) {
	 
		try {
			// �ڽ��� PC�� IP�� �˱� ���ؼ� �Ʒ��� ���� �ڵ带 �ۼ��غ���.
			InetAddress iAddress = InetAddress.getLocalHost();
			String ip = iAddress.getHostAddress();
			System.out.println("����ǻ�� IP�ּ� : "+ip);
			
			// ������ ������ �̿��ؼ� IP�ּҸ� �˾Ƴ��� ���� �ڵ带 �ۼ��غ���
			// ���� ū ������ ������ �ִ� ȸ����� IP�� ��� 2�� �̻��̴ٵȴ�.
			
			InetAddress[] iAddresses = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress inetAddress : iAddresses) {
				ip = inetAddress.getHostAddress();
				System.out.println("���̹��� IP �ּ� : " + ip);
			}
			
			InetAddress[] iAddresses2 = InetAddress.getAllByName("www.samsung.com");
			
			for(InetAddress inetAddress : iAddresses2) {
				ip = inetAddress.getHostAddress();
				System.out.println("samsung IP �ּ� : " + ip);
			}
			
			
		} catch (UnknownHostException e) {
			 
		 
		}

	}

}
