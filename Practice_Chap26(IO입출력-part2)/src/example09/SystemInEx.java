package example09;

import java.io.InputStream;
import java.util.Arrays;

public class SystemInEx {

	public static void main(String[] args) throws Exception {
		
		// �ַܼκ��� �Է��� �ޱ� ���ؼ� System.in �ʵ带 �Է½�Ʈ�����ٰ� 
		// ������ �Ѵ�.
		
		InputStream iStream = System.in;
		
		byte[] bArr = new byte[100];
		
		System.out.print("�̸� : ");
		 
		// Ű����� �Է��� �����͸� bArr �迭�� �����ϰ�
		// ���� ����Ʈ ���� �������Ѵ�.
		int nameBytes = iStream.read(bArr);
		
		System.out.println(Arrays.toString(bArr));
		
		
		// ����Ű (ĳ���� ����(13) , �����ǵ�(10)) ������ �������� ���ڿ��� �����.
		String name = new String(bArr,0,nameBytes-2);
		
		System.out.print("���� ��  : ");
		int comBytes = iStream.read(bArr);
		System.out.println(Arrays.toString(bArr));
		String comment = new String(bArr,0,comBytes-2);
		
		System.out.println("�Է��� �̸� : "+name);
		System.out.println("���� �� : "+comment);
	}

}
