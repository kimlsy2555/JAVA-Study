package example03;

public class StringEqualsEx {

	public static void main(String[] args) {
		// ������ Ÿ���� == != �� ����
		
		// == ���� != �ٸ���
		 
		// ���ͷ��� ��� ���� ���� �ִ�, ���� �޸𸮰���(heap)�� �ִ��� 
		// Ȯ���� �ϰ� �ִٸ� ���� �ּҸ� ������ �ϰ� �ȴ�.
		// ���ٸ� ���ο� ���� �ν��Ͻ��� �������ش�.
		
		
		String str1  = "����Ƽ��";
		String str2  = "����Ƽ��";
		//new �����ڸ� ������ ���ο� �ν��Ͻ��� ������.
		
		String str3  = new String( "����Ƽ��");
		
		
		// ������ Ÿ�Կ��� ���� == �� �ּ� �� �ϰ�����
		// ���� ���ͷ��� ��� ���� ���� ����
		// new�� ���ͷ� ���ο� ������� ���ο� �ν��Ͻ��� �����Ѵ�.
		
		boolean result = (str1 == str2);
		System.out.println(result); 
		
		result = (str1 == str3 );
		System.out.println(result); 
		
		//  String Ŭ������  equals()�� �ּҿ� ������� ���� ���ٸ� ������ true �����Ѵ�.
		// equals ����   == �ּҺ� 
		
		result = str1.equals(str2);
		System.out.println(result);
		
		result = str1.equals(str3);
		System.out.println(result); 
	}

}
