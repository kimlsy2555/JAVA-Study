package example01;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.nextLine();
		
		System.out.println(str);
		
		 byte [] b1 = str.getBytes();
		// char [] ch =  str.toCharArray();
		System.out.println(Arrays.toString(b1));
		
		// ��� ������ �ѱ��� �Է��Ұ��
		// byte�� �����÷��� ����߻��Ͽ� �̻��� ���� ����ȴ�.
//		System.out.println(ch.length);
//		for(int i = 0 ; i<ch.length;i++) {
//			System.out.println(ch[i]);
//		}
		
		sc.close();

	}

}
