package example02;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		// �÷��� ������ ��ũ�� ����ϱ����� �ڽ� ��ڽ��ڵ带 ����Ѵ�
		// ��ü�� ���� ������
		
		// �ڽ� �ڵ�(Boxing)--> ��üȭ ��Ŵ
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(100);
		
		// ���� �ڽ�
		// ������ �� new Integer(100) �� �ٲ��.
		Integer obj4 = 100;
		
		System.out.println("�ڽ���");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		System.out.println();
		
		// ��ڽ� �ڵ�(UnBoxing)--> �⺻������ �ٲ۴�.
		int value1 = obj1.intValue();
		int value2 = obj2;
		int value3 = obj3;
		int value4 = obj4;
		
		System.out.println("��ڽ���");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
	}

}
