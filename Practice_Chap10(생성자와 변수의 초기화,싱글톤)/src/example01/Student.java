package example01;

public class Student {

	// �ν��Ͻ� ��� ������ ������.
	private String name;
	private int age;
	
	// Ŭ������� �����ڸ��� �ݵ�� ���ƾ� �Ѵ�.
	// �����ڴ� ����Ÿ���� �������� �ʴ´�.(void ��� ���� ������ �ʴ´�)
	// �����ڰ� �ϳ��� ���� Ŭ������ �⺻������ �����Ͻÿ� �����Ϸ��� �˾Ƽ� 
	// �⺻ �����ڸ� �߰����ش�.
	// �׷��� ��� Ŭ������ �⺻�����ڰ� �ϳ� �־�ߵȴٴ� ���� �����ش�
	// �����ڰ� ������ �������� ����~ �پ��� ���� ���� ȿ�� ��
	
	public Student() {
		System.out.println("�⺻������ ȣ��");
		return;
	}

	public Student(String name, int age) {
		System.out.println("�Ű������� �ִ� ������ ȣ��");
		this.age= age;
		this.name= name;
		//System.out.println(name+" : "+age);
		return;
	}
	
	
	public Student (String name) {
		System.out.println("name �� �ִ� ������ ȣ��"); 
		this.name= name;
		return;
		
	}
	public Student (int age) {
		System.out.println("age �� �ִ� ������ ȣ��"); 
		this.age= age;
		return;
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}
	
	
	public String toString() {
		return this.getName() + " : " +this.getAge();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
