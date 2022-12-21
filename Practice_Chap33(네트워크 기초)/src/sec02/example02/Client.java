package sec02.example02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
			
			
			byte[] bytes = null;
			String data = null;
			////////////////////////////////////
			// �����͸� ������ ������ ���� �ڵ带 �ۼ�
			
			OutputStream outputStream =  socket.getOutputStream();
			data = "�ȳ� ����";
			// ���ڵ�, ��� ��Ʈ��ũ �ۼ����� �� ���� ���ڼ��� UTF-8�� ���� ����ȭ
			// �ѱ��� 3����Ʈ
			bytes = data.getBytes("UTF-8");
			outputStream.write(bytes);
			outputStream.flush();
			
			System.out.println("[�����ͺ����� ����]");
			
			////////////////////////////////////
			// �����͸� �ޱ� ���� �ڵ带 �ۼ��Ѵ�
			
			InputStream inputStream = socket.getInputStream();
			bytes = new byte[1000];
			
			// read() ���� ���ŷ���°� �ȴ�.
			int readCount = inputStream.read(bytes);
			
			data = new String(bytes,0,readCount,"UTF-8");
			System.out.println("[�����͹ޱ� ����] : " + data);
			
			outputStream.close();
			inputStream.close();

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
