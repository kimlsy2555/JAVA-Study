package example03;

public class MemberPersoneEx {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.method();
		member.method1();
		System.out.println();
		System.out.println(A.max); // XX
		System.out.println(A.max); 	 	// ������ٽ� �������̽���. ����� O
		//����������� ������ �����̴�. �Ͽ� ������ ������ ����ȴ�.
		A a = new Member(); // �������̽� �ʵ��� ������
		a.method();
		System.out.println();
		// a.method1() // �ٺ��� ����� ���ϹǷ� MemberŬ������ ����޼���� ȣ�� �Ұ�
		
		Person person = new Person();
		person.method();
		person.method1();
		
		System.out.println();
		a = new Person();
		a.method();
		
	}

}
