package sec02.example01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		 
		Socket socket = null;
		
		
		
		try {
			socket = new Socket();
			System.out.println("[���� ��û]");

			// ������ �����ϴ� �ڵ�		
			socket.connect(new InetSocketAddress("localhost",7777));
	
			System.out.println("[���� ����]");
		} catch (IOException e) {}
		
		// ������ ���� ���� �ڵ�
		if (!socket.isClosed()) {
			
			try {
				socket.close();
				System.out.println("Ŭ���̾�Ʈ�� socket�� �������ϴ�.");
			} catch (IOException e) {}
			
		}
	}

}
