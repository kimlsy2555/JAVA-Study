package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx02 {

	public static void main(String[] args) throws Exception{

		
		InputStream istStream = new FileInputStream("C:/test.txt");
		
		int readBtyeNo;
		
		byte[] b = new byte[2];
		
		while( (readBtyeNo  = istStream.read(b))!=-1) {
			
			System.out.println("���� ����Ʈ �� : "+readBtyeNo);
			//StringŬ������ �ݵ�� ���ڵ��ؾ� �ѱ۷� ǥ�õȴ�.
			String str = new String(b);
			System.out.println("����  ���ڿ� : "+str);
		}
		istStream.close();
	}

}
