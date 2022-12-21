package example08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {

	public static void main(String[] args) throws Exception {


		File file = new File("C:/Test/printStream.txt");
		FileOutputStream fOutputStream = new FileOutputStream(file);
		PrintStream pStream = new PrintStream(fOutputStream);
		
		// ���Ͽ� ����� �Ѵ�. ��½�Ʈ���̶� System.out(�ܼ�) �ؼ� ����ص� �ȴ�.
		
		pStream.println("[����Ʈ ��Ʈ�� ���]");
		pStream.println("����");
		pStream.println("�ڹ����� �׷�����");
		pStream.println("���α׷��� ���� �����͸� ����մϴ�.");
		
		System.out.println("���� ���� �Ϸ�");
		// ���� �����ڿ� �Ű������� ������ �ݵ�� �����ϰ� ������ �ؾ��Ѵ�.
		System.out.printf("%d %d",10,20);
		
		pStream.flush();
		pStream.close();
		fOutputStream.flush();
		fOutputStream.close();
		
	}

}
