package example02;

public class ToLowerUpperEx {

	public static void main(String[] args) {
		
		
		String str1 =  "Java Programming";
		String str2 =  "JAVA Programming";
		
		System.out.println("�빮�� : "+ str1.toUpperCase());
		
		System.out.println("�ҹ��� : " +str2.toLowerCase());
		
		//equals ��� ���� �� ��
		System.out.println(str1.equals(str2));
		
		//equalsIgnoreCase ��� ���� �� ���� ���� 
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
