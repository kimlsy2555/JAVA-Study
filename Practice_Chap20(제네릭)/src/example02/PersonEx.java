package example02;

public class PersonEx {

	public static void main(String[] args) {
		
		Person<String> person1 = new  Person<String>();
		// Person ���׸�Ŭ������ T�� String �� �����Բ� ������ �������.
		
		person1.setT("ȫ�浿"); 
		// person.setT(100); // ���� �߻� :
		
		String  str = person1.getT(); 
	
		System.out.println(str);
		
		
		// �������� �������� ����ȭ, Ÿ�Ժ�ȯ ���� ,�����Ͻ� ���ܸ� �߻�
		Person<Integer> person2 = new  Person<Integer>();
		
		person2.setT(100); // �ڵ� �ڽ� // Integer �ڵ� �ڽ� �߻�
		
		
		int value = person2.getT(); // �ڵ� ��ڽ� �ڵ�
	
		System.out.println(value);
		
		
		
		Person<Apple> person3 = new  Person<Apple>();
		
		person3.setT(new Apple()); // �ڵ� �ڽ� // Integer �ڵ� �ڽ� �߻�
		
		
		Apple apple = person3.getT(); // �ڵ� ��ڽ� �ڵ�
	
		System.out.println(apple);
	
		
	
	}

}
