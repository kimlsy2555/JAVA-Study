package sec02.example02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
				System.out.println("[���� ������] : "+inetSocketAddress.getHostName());
				
				//////////////////////////////////////////////////////
				byte[] bytes = null;
				String data = null;;
				
				// �����͸� �ޱ� ���ؼ� ���Ͽ��� �Է� ��Ʈ���� ��� �ڵ�
				InputStream inputStream = socket.getInputStream();
				bytes = new byte[1000];
				
				// Ŭ���̾�Ʈ���� ������ �����͸� �д� �κ�
				int readcount = inputStream.read(bytes);
				// �����ߴ� ����Ʈ �迭�� ���ڵ��ϴ� ����
				data = new String(bytes,0,readcount,"UTF-8");
				
				System.out.println("[�����͹ޱ� ����] : "+data);
				
				
				
				/////////////////////////////////////////////////////////////
				// �����͸� ������ ���ؼ� ���Ͽ��� ��� ��Ʈ���� ��� �ڵ�
				OutputStream outputStream = socket.getOutputStream();
				data = "�ȳ��ϼ��� Ŭ���̾�Ʈ";
				// ���ڵ� �ڵ�
				bytes = data.getBytes("UTF-8");
				outputStream.write(bytes);
				outputStream.flush();
				
				System.out.println("[�����ͺ����� ����]");
				
				inputStream.close();
				outputStream.close();
				socket.close();
			}
			
		} catch (IOException e) {}
		
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
				
			} catch (IOException e) {}
			
		}
	}

}
