package example01;

import java.io.IOException;

public class KeyboarToString {

	public static void main(String[] args) {
		
		byte[] bytes = new byte[100];
		
		System.out.print("�Է� : ");
		// Ű����� �Է��� �޴� �޼���
		
		int readBytesNo = 0;
		
		
		try {
			// Ű����(ǥ���Է�) ���κ��� �Է��� �ް� �� ������ bytes�� ������ �ϰ� 
			// �Է¹��� ����Ʈ ���� ������.
			readBytesNo = System.in.read(bytes);
			// ���ڼ� EUC-KR ���ڵ� 

			String str = new String(bytes,0,readBytesNo-2,"EUC-KR");
			//String str = new String(bytes,0,readBytesNo-2,"UTF-8");
			System.out.println(str);
			// abc ���� ������ 9����Ʈ�� ������ ���� ����Ű �� 2����Ʈ�� �����ϱ� 
			// ������ readBytesNo + 2����Ʈ�� �� ����ȴ�.
			System.out.println("�Է� ���� ����Ʈ �� : "+ readBytesNo);
			
			// �ڹ� ������ �⺻���� EUC ��
			//EUC-KR : �ѱ� 2 byte ���� 1byte
			//UTF-8  : �ѱ� 3 byte ���� 1byte
			
			//�ش簪�� �����ϰ� byte�� ����� ���� ���
			byte[] b = str.getBytes("EUC-KR");
			System.out.println(b.length);
			
			
			
			// ���ڵ��� ���ڵ��� �������� �ݵ�� ���ڼ��� �����ϰ� ��������
			// ���ڰ� ������ ������ ������ �� �ִ�.
			
			byte [] b2 ="�ȳ��ϼ���".getBytes("UTF-8");
			//String str1 = new String(b2,0,b2.length,"EUC-KR");
			String str1 = new String(b2,0,b2.length,"UTF-8");
			System.out.println(str1);
			
			System.out.println(b2.length);
			
		} catch (IOException e) {
			
		}

	}

}
