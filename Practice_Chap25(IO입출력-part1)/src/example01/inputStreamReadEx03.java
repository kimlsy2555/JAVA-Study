package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class inputStreamReadEx03 {

	public static void main(String[] args) throws Exception {
	
		InputStream iStream = new FileInputStream("C:/test.txt");
		
		int count;
		
		byte[] readBytes = new byte[8];
		
		// ���� �ε����� 2 �̰� 3���� �о �����ϴ� �ڱ� �ۼ�
		
		count =iStream.read(readBytes,2,4);
		System.out.println("���� ����Ʈ �� : "+count);
		System.out.println();
		
		for(byte b : readBytes) {
			System.out.println("���� ����Ʈ : "+(char)b);
		}
		
		iStream.close();

	}

}
