package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx01  {

	public static void main(String[] args) throws Exception {
		
		// �������� ����� �ڵ�, �Ϲݿ��ܰ� �߻��ϴµ� 
		// �� ���ܸ� JVM���� ������ �ִ�
		InputStream iStream = new FileInputStream("C:\\test.txt");
		int  readByte; // ���� ����Ʈ ���� ���� �޴� ����
	
		
		// InputStream�� read()�� ���̻� ������ ���ٸ�, -1���� �����Ѵ�.
		// �⺻������ ��Ŭ������ �ѱ��� 2����Ʈ�� �о� ���δ�.
		
		while((readByte = iStream.read())!=-1) {	
			System.out.println("���� ����Ʈ �� : "+readByte);	// �ƽ�Ű�ڵ尪 ���
			System.out.println("���� ���� : "+(char)readByte); // ���� Ÿ�� ĳ������ ���ڸ� ���

		}
		iStream.close(); //���Ҹ� ����
		
	}

}
