package sec02.example01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		 	
		ServerSocket serverSocket =  null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",7777));
			
			// ������ �׻� Ŭ���̾�Ʈ�� ��û�� ��ٷ��� �ϱ� ������
			// ���� ������ �������� �Ѵ�.
			while(true) {
				System.out.println("[���� �����]");
				
				// accept() �� Ŭ���̾�Ʈ�� ���� ��û�� �ؿ��� �������� ���
				// �� ���ŷ ���·� �ȴ� Ŭ���̾�Ʈ�� ��û�� ������ 
				// ��μ�  ��ſ� Socket���� �����Ѵ�.
				Socket socket =	serverSocket.accept();
			
				// Ŭ���̾�Ʈ�� IP�ּҸ� ��� �ڵ�
				// Ÿ�Ժ�ȯ�� �ϴ� ������ getRemoteSocketAddress()�� 
				// SocketAddressŬ������ ����
				// �ڼ��� InetSocketAddress �� �ٿ�ĳ������ �ϴ� ���̴�
				InetSocketAddress inetSocketAddress =  (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("[���� ������] : "+inetSocketAddress.toString());
			}
			
		} catch (IOException e) {}
		
		// �ڿ��� �� ����ϰ� ���� �ݵ�� close()�� ȣ������
		// ������ ���ڵ尡 �� �ǹ̰� ����. ui �� ���� �����̾��� ������
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
				
			} catch (IOException e) {}
			
		}
	}

}
