package example04;

public class ClassEx {

	public static void main(String[] args) {
	
		
		// ��ü�κ��� Ŭ���� ������ ��� ��� (getClass()- ObjectŬ����)
		Person person = new Person();
		
		Class class1 = person.getClass();
		// ��Ű������ ������ Ŭ���� ���� ������
		System.out.println(class1.getName());
		// Ŭ������ ������
		System.out.println(class1.getSimpleName());

		System.out.println();
		
		// ���ڿ��� ���� ��ü�� ������ ��� ���(Class.forName())
		
	
		try {
			Class class2 = Class.forName("example04.Person");
			System.out.println(class2.getName());
			System.out.println(class2.getSimpleName());
		} catch (ClassNotFoundException e) {e.printStackTrace();}
		
		
	}

}
