package example02;

public class Student {
    // �ɹ� ���� (�ʵ� )
	String name;
	int age;
	
	
	// Object Ŭ������ toString() �������̵�(������)
	@Override
	public String toString() {

		String str =  "�̸� : " +this.name + ", "+"���� : "+this.age; 
		// super ������Ʈ ���� Ŭ����
		// this : Ŭ���� ��  �ּ�(new ������ �ν��Ͻ��� �����ϸ� ��μ� Ȱ��ȭ )
		// this �� static �ż����� Ŭ���� �ȿ��� ����Ҽ� ���� �����
		return str;
	}
}
