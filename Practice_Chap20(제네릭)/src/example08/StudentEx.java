package example08;

public class StudentEx {

	public static void main(String[] args) {
		
		// �ʵ��� ������
		Person<String, String> person = new Student<String, String, Integer>();
		
		person.setKind("Ȳ��");
		person.setMode("���� �¼�");
		
		System.out.println(person.getKind());
		System.out.println(person.getMode());
		
		System.out.println();
		
		Student<String, String,Integer> personStudent = new Student<>();
		
		personStudent.setKind("����");
		personStudent.setMode("��� �¼�");
		personStudent.setC(100);

		System.out.println(personStudent.getKind());
		System.out.println(personStudent.getMode());
		System.out.println(personStudent.getC());
		
	}

}
