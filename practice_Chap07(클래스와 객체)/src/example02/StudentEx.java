package example02;

public class StudentEx {

	public static void main(String[] args) {
		
		
		
		// �Ʒ��� ���� ������ ��������� ������ �ν��Ͻ��� ���� �Ҵ��� �ȴ�
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.age = 42;
		s1.name = "ȫ�浿";
		 // s1 �� �ּҸ� s2 ���ٰ� ���� 
		 // �ν��Ͻ��� �����Ѵ�  
		s2 = s1;  // ���� s2 �� ����Ű�� �ִ� �ν��Ͻ��� ������ ��ü�� �ȴ�.
				  // gc(garbage collector) �� ������ ��ü�� �����Ͽ� �Ҹ� ��Ų��.
		s2.age = 11;
		 // s1 �ǰ��� 11�� �ȴ�
		
		System.out.println(s1);
		System.out.println(s2);
		
		 
	}

}
