package example02;

import java.util.Objects;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name,int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	// ���� ���� ��ü�� ���� 
	// 1. �ؽ��ڵ尡 ���ƾ� �Ѵ�. (hashcode() ������ �ʿ�)
	// 2. �� ���� ��ü�� ��� ������ ������ ���ƾ� �Ѵ�(equlse()�� ������ �ʿ�)
	
	
	@Override
	public int hashCode() {
		System.out.println("�ؽ� �ڵ� ȣ��");
		return Objects.hash(this.name,this.age);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// instanceof obj ��  Member �� �����̳�?
		if(obj instanceof Member) {
			Member member  = (Member) obj;
			return (member.name.equals(this.name))&&(member.age == this.age);
		}
		else {
			return false;
		}
	}
	
	// ���� ȣȯ�� ���� �ؽ��ڵ� ������ ���
//	@Override
//	public int hashCode() {
//		System.out.println("�ؽ� �ڵ� ȣ��");
//		return this.name.hashCode()+this.age;
//	}

}
