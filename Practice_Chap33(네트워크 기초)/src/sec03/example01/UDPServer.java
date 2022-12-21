package sec03.example01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	
	public UDPServer(int port) {
		 
		try {
			
		
			while (true) { 
				DatagramSocket datagramSocket = new DatagramSocket(port);
				byte[] bytes = new byte[100];
				DatagramPacket datagramPacket =new DatagramPacket(bytes, bytes.length);
				System.out.println("���� ����");
				datagramSocket.receive(datagramPacket);
				// ���ڵ�
				String str = new String(datagramPacket.getData(),0,datagramPacket.getLength(),"UTF-8");
				System.out.println("���ŵ� ������ : "+str.trim());
			
				// Ŭ���̾�Ʈ�� ������ ����ϴ� �ڵ�
				InetAddress inetAddress = datagramPacket.getAddress();
				int clientPort = datagramPacket.getPort();
				
				System.out.println("Ŭ���̾�Ʈ IP :"+inetAddress+" Ŭ���̾�Ʈ Port :"+clientPort);
			
				datagramSocket.close();
			}
		}catch (Exception e) {
			 System.out.println("������ ���� ���� �߻�");
			 e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		new UDPServer(7777);
		
		
		
		
	}

}
