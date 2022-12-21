package objectsExample;


import java.util.Comparator;
import java.util.Objects;

public class CompareEx {

	// ��øŬ����(�������Ŭ����)
	static class Student{
		int sno;
		String name;
		public Student(	int sno,String name) {	
			this.sno  = sno;
			this.name = name;
			
		}
	}
	
	static class StudentComparator implements Comparator<Student>{
		// name �� ������ ��
		@Override
		public int compare(Student o1, Student o2) {
		
			if(o1.name.compareTo(o2.name)< 0 )
				return -1;
			else if (o1.name.compareTo(o2.name) == 0 )
				return 0;
			else
				return 1;
		
		}
	
	}
	
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student(1,"ȫ�浿");
		Student student2 = new Student(1,"ȫ����");
		Student student3 = new Student(3,"�迬��");
		
		// ���� (Comparator<T>�������̽��� �͸��� ��ü�� ����)
//		int result = Objects.compare(student1, student3, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//			if(o1.sno<o2.sno) 
//				return -1;
//				
//			else if (o1.sno == o2.sno) 
//				return 0;
//				
//			else 
//				return 1;
//				
//				return o1.sno - o2.sno;
//			}
//		});
	
		
	
		int result =  Objects.compare(student1 ,student2, new StudentComparator());
		
		if(result > 0) {
			System.out.println("o1.sno�� Ů�ϴ�.");
		}
		else if(result == 0) {
			System.out.println("o1.son ��  o2.sno�� �����ϴ�");
		}
		else {System.out.println("o2.son�� Ů�ϴ�.");}
		
	}

}

