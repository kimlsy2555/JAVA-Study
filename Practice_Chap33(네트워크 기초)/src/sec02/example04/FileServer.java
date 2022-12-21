package sec02.example04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket =null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",7777));
			System.out.println("[���� ����]");
		} catch (IOException e) {}
		
		// ������ ���������� ���ѷ���
		while(true) {
			try {
				
			Socket socket =	serverSocket.accept();
			InputStream inputStream = socket.getInputStream();
			int readCount = -1;
			byte[] byteArr = new byte[100];
			// ���� �̸� �б�
			inputStream.read(byteArr,0,100);
			String fileName = new String(byteArr,0,100,"UTF-8");
			// ���� �̸� �յ� ���� ����
			fileName= fileName.trim();
			
			System.out.println("[���� �ޱ� ����]" +fileName);
			// ������ �ޱ� ������ �ϰ� �Ǹ�, �����θ� �� ������ ������ �����ϸ�ȴ�.
			FileOutputStream fileOutputStream =new FileOutputStream("C:/Test/"+fileName);
			
			while( (readCount = inputStream.read(byteArr)) != -1) {
				fileOutputStream .write(byteArr,0,readCount);
			}
			fileOutputStream.flush();
			System.out.println("[���� �ޱ� �Ϸ�]");
			
			fileOutputStream.close();
			inputStream.close();
			socket.close();
			
			}catch (Exception e) {
				System.out.println("���� �ޱ� ���� �߻�");
				break;
				
			}
		}
		try {
			serverSocket.close();
			System.out.println("[������ ����Ǿ����ϴ�.]");
		} catch (IOException e) {}
	}
}
