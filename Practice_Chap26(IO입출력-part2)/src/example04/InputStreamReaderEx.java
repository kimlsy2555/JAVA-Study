package example04;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx {

	public static void main(String[] args) throws Exception {

		// ��  �Է½�Ʈ���� ����Ʈ ����� InputStream���� �����Ѵ�.
		InputStream iStream = System.in; // �ַܼ� ���� �Է��� ����
		
		// ���ڸ� �ޱ� ���� ������Ʈ���� �� �Է½�Ʈ���� ���� �Ѵ�.
		Reader reader = new InputStreamReader(iStream);
		
		int readCount;
		char[] cArr = new char[100];
		System.out.print("���ڿ��� �Է� �ϼ���");
		
		
		// �ֿܼ��� �Է��� ���� ���� -1�� �����ϴ� ��� Ctrl+Z�� ������ �ȴ�.
		// �ܼ�â�� ����, ����â�� �ڼ��� ���� ������ �սô�.
		while( (readCount = reader.read(cArr))!= -1) {
			
			String str = new String(cArr,0,readCount); //String���� ����
			
			System.out.println("Ű����� ���� ���� ���ڿ� : "+str);
			
			
		}
		reader.close();
		iStream.close();
	}

}
