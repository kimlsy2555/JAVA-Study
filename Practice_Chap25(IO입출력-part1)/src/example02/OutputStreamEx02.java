package example02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

public class OutputStreamEx02 {

	public static void main(String[] args) throws Exception {
		
		// ���Ϸκ��� ��½�Ʈ���� �����ؼ� ������ �ϰ� �ִ�.
		OutputStream oStream = new FileOutputStream("C:/write.txt");
		//ABC������ ���ڿ��� ���ؼ� ����Ʈ �迭�� ��� �ִ�
		byte[] data ="ABC������".getBytes("UTF-8");
		//UTF-8 �ѱ� 3����Ʈ�� ������
		
		System.out.println("data����Ʈ �迭 ũ�� : "+data.length);
		
		// ����Ʈ �迭�� �ѹ��� ��Ʈ���� ������.
		// �ռ��� �� write(int b) �� �޼��忡 ���ؼ� 
		// �ξ� ȿ�����̴�.
		oStream.write(data);
		
		System.out.println("����Ϸ�");

		oStream.flush();
		
		// ������� ������ ������ write.txt������ �о� ���δ�.
		
		InputStream iStream = new FileInputStream("C:/write.txt");
		
		int count = 0;
		byte[] readByte = new byte[9];
		
		int i=0;
		
		while((count = iStream.read(readByte))!=-1) {
		
			i++;
			String str = new String(readByte,"UTF-8");// ���ڵ�
			
			System.out.println("���� ����Ʈ��  : "+count);
			System.out.println("���� ���� : "+ str);
			
			
		}
		System.out.println("���μ� : "+i);
		
		
		
		iStream.close(); 
		oStream.close();
		
		
	}

}
