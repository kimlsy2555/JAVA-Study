package example03;

public class ReverseEx {

	public static void main(String[] args) {
	
		String str = "�ȳ��ϼ���";
		
		String reverse = "";
		
		int count = 0;
		
		
		count = str.length();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			reverse +=str.charAt(count-(i+1));
			System.out.println(reverse);
			
		}
		// ���� : charAt�� ���ο� �ν��Ͻ� ��ü�� �����ϱ� ������
		// �޸��� ������ �߻��� 
		
		System.out.println("���� ��� : "+ reverse);

		
		String r = reverseString(str);
		System.out.println("reverseString() ȣ�� : "+r);
	}
	public static String reverseString(String str) {
		
		return  new StringBuilder(str).reverse().toString();
	}
	
	
}
