package example05;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws Exception {

		long start = 0;
		long end = 0;
		
		File file = new File("C:\\JAVA �۾�\\Practice_Chap26(IO�����-part2)\\src\\example05\\���� �ϰ� �߾�.mp3");
		// ����Ʈ ������� �ӵ��� ���̸� ���� ���� ���α׷� �ۼ�
		FileInputStream fStream1 = new FileInputStream(file);
	
		System.out.println("���� ũ�� : "+file.length());
	
		System.out.println("����Ʈ ��� �б� ����");
		
		start = System.currentTimeMillis();
		// �б⸸ �Ѵ�.
		
		while((fStream1.read() != -1)) {}
		System.out.println("����Ʈ ��� �б� ����");
	
		// 5�� �ҿ��
		end = System.currentTimeMillis();
		System.out.println("���۸� ��� ���� �ʾ��� �� (����Ʈ ��� ) :  "+(end-start)+"ms");
		
		fStream1.close();
		System.out.println();
		
		// �� �Է½�Ʈ�� FileInputStream ���ٰ� �ӵ� �� ���� ���
		// ���� ��Ʈ���� BufferdInputStream�� �����Ѵ�.
		// �������� file�� �о���� ��Ʈ���� �� ��Ʈ��
		// �� �����͸� ���� ó�� ���ִ� ������ �ٷ� ���� ��Ʈ��  BufferedInputStream �̴�
		
		FileInputStream fStream2 = new FileInputStream(file);
		BufferedInputStream bStream = new BufferedInputStream(fStream2);
		
		start = System.currentTimeMillis();
		
		System.out.println("���� ��� �б� ����");
		
		while(bStream.read()!= -1) {}
		
		// 0.011�� �ҿ�� 
		System.out.println("���� ��� �б� ����");
		end = System.currentTimeMillis();
		
		
		System.out.println("���۸� ������� �� (���� ��� ) :  "+(end-start)+"ms");
		
		bStream.close();
		fStream2.close();
		
	}

}
