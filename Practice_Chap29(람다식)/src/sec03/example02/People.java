package sec03.example02;

public class People {
	
	private String name;
	private int age;
	
	public People() {
		
		 System.out.println("�⺻ ������ ȣ��");
	}

	

	public People(String name) {
	 
		this.name = name;
		 System.out.println("People (String name) ������ ȣ��");
	}
	
	public People(String name, int age) {
		 
		this.name = name;
		this.age = age;
		 System.out.println("People(String name, int age) ������ ȣ��");
	}
	@Override
	public String toString() {
		 
		return this.name + " , " + this.age;
	}
	
}
