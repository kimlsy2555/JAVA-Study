package example02;

import java.util.HashSet;

public class PersonEx {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		
		// ����� ���� Ŭ���������� hash �ø������ �ݵ�� hashcode()�� equals() �������̵��� �ؾ�
		// �ߺ������� �ȵȴ�.
		HashSet hashSet = new HashSet();
		

	
		Person person1 =new Person("ȫ�浿",50);
		Person person2 =new Person("ȫ�浿",50);

		
		hashSet.add(person1);
		hashSet.add(person2);
		
		System.out.println("����� ��ü�� "+hashSet.size());
		
		
		
		System.out.println(person1.hashCode()); 
		System.out.println(person2.hashCode()); 
		
		
		System.out.println(person1); 
		System.out.println(person2); 
		
		
	}

}
