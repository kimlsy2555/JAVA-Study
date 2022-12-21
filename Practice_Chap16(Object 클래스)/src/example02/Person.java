package example02;

import java.util.Objects;

public class Person {

	private String name;
	private int age;
	public Person(String name,int age) {
	
		this.name= name;
		this.age = age;
		
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	// hash �ø������ ���� ��ü�� �Ǵ��ϱ� ���ؼ� 1�������� hashcade() ȣ��
	
	@Override
	public int hashCode() {
		System.out.println("hashcode()");
		//return this.name.hashCode() + this.age; // ����ȣȯ
		return Objects.hash(this.name,this.age);  // �ű� ���� 
	}
	// ��ó������ ���� �� ���� equals() ȣ��
	@Override
	public boolean equals(Object obj) {
	
		System.out.println("equals()");
		
		
		if(obj instanceof Person) {
			Person person = (Person)obj;
			if((this.name.equals(person.name)) && (this.age == person.age) ){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return "�̸� : "+this.getName() + "\n" + "���� : "+this.getAge();
	}
	
}
