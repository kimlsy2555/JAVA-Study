package example01;

public class ObjectEqualsEx {

	public static void main(String[] args) {
		
		// Object Ŭ������ equals()
		
		// �Ʒ��ڵ�� ���� �ּҰ� �ٸ���
		Object object1 = new Object();
		Object object2 = new Object();
		
		 // Objcet Ŭ������ equals()�� ���������� �޸𸮹��� ��
		System.out.println(object1);
		System.out.println(object2);
		
		boolean result1 =  object1.equals(object2);
		boolean result2 =  (object1 == object2);
		
		System.out.println("equals() : "+result1);
		System.out.println("== ������ : "+ result2);

	}

}
