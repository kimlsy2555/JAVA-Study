package example02;


public class EqualsEx {

	public static void main(String[] args) {
	
		String str1 = new String("ȫ�浿");
		String str2 = "ȫ�浿"; //���ͷ� Ÿ������ ���� 
		String str3 = "ȫ�浿"; //���ͷ� Ÿ������ ����

		
		
		
		// == �����ڰ� �ּ� �� 
		if(str1 == str2) {
			System.out.println("���� ������ �ν��Ͻ�");
		}
		else {
			System.out.println("�ٸ� ������ �ν��Ͻ�");
		}
		
		// ���� ���ͷ��� ���  ���� ������ ����
		
		if(str2 == str3) {
			System.out.println("���� ������ �ν��Ͻ�");
		}
		else {
			System.out.println("�ٸ� ������ �ν��Ͻ�");
		}
		
		System.out.println();
		// String equals()�� ��(Object Ŭ������ equals()  �������̵�)
		if(str1.equals(str2)) {
			System.out.println("���� ���ڿ� �Դϴ�.");
		}
		else {
			System.out.println("�ٸ� ���ڿ� �Դϴ�.");
		}
		
		if(str2.equals(str3)) {
			System.out.println("���� ���ڿ� �Դϴ�.");
		}
		else {
			System.out.println("�ٸ� ���ڿ� �Դϴ�.");
		}
		
	}

}
