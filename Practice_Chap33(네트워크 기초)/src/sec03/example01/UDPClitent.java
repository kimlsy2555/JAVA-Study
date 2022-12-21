package sec03.example01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClitent {
	
	private String str;
	private static int SERVERPORT = 7777;
	private Scanner scanner = new Scanner(System.in);
	
	// ������
	public UDPClitent(String ip, int port) {
		
		try {
			InetAddress inetAddress = InetAddress.getByName(ip);
			DatagramSocket datagramSocket = new DatagramSocket(port);
			System.out.print("������ ���� ���� : ");
			str = scanner.nextLine();
			
			// ���ڵ�
			byte[] bytes = str.getBytes("UTF-8");
			DatagramPacket datagramPacket = 
			new DatagramPacket(bytes,bytes.length,inetAddress,SERVERPORT );
			// ���������� DatagramPacket���� �����.
			// DatagramSocket�� �̿��Ͽ� �����͸� ������.
			datagramSocket.send(datagramPacket);
			datagramSocket.close();
			
			
		}catch (Exception e) {
			System.out.println("������ ������ ����");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
	 
		new UDPClitent("localhost", 9999);
	}

}
