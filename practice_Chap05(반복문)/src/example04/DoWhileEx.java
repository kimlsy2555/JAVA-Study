package example04;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޼��� �Է�");

		System.out.println("q�Է� ����");
		
		String str= null;
		// do - while ���� �ּ� �ѹ� �̻� ������ �����ϴ� �ݺ���
		// ������ ���ǹ��� �޺κп� �����ϱ� �����̴�.
		do {
		
			System.out.print(">");
			//String Ŭ���� next()�޼���� ���鸸 ���� �� �� ����
			//next() �Ѵܾ �Է¹��� �� ����.
			//nextLine() ���� ���� ����Ű �Է��� ������ ���� ����
			str = sc.nextLine();
			System.out.println("�Է� ���� �޼��� : "+str);
			
			
		}while(!str.equals("q"));
		
		System.out.println("���α׷� ����"); 
		sc.close();
	}

}
