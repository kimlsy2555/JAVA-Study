package example07;

import java.util.Arrays;

public class WildCardEx {
	//? �� ��� ��ü�� �� �ްڴ�.
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+"������ : "
						+ Arrays.toString(course.getStudents()));
	}
	// Student �̰ų� Student �� ��ӹ޴� Ŭ����(���� Ÿ�� ����)
	public static void registerCourseStudnet(Course<? extends Student> course) {
		System.out.println(course.getName()+"������ : "
						+ Arrays.toString(course.getStudents()));
	}
	
	// Worker Ŭ���� �̰ų� ���� Ŭ�����鸸 ��� �ü� �ִ�.(�����ִ� ���� Ÿ�� ���� )
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+"������ : "
						+ Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
	

		
		// ���� Course ������ �ؼ� Ȯ���ϴ� ����
		
		Course<Person> perCourse = new Course<Person>("�Ϲ��� ����",3);
		
		perCourse.add(new Person("�Ϲ���1"));
		perCourse.add(new Person("ŷ����2"));
		perCourse.add(new Person("ŷ�޳�3"));
		
		registerCourse(perCourse);
		//registerCourseStudnet(perCourse); // ���� ���� Ŭ����
		registerCourseWorker(perCourse);
		System.out.println();
		
		Course<Worker> WCourse = new Course<Worker>("������ ����",3);
		WCourse.add(new Worker("��븮"));
		WCourse.add(new Worker("�̰���"));
		WCourse.add(new Worker("������"));
	
		registerCourse(WCourse);
		//registerCourseStudnet(WCourse); // ���谡 ���� Ŭ����
		registerCourseWorker(WCourse);
		System.out.println();
		
		Course<Student> sCourse = new Course<Student>("�л� ����",3);
		sCourse.add(new Student("��ä��"));
		sCourse.add(new Student("��Ը�"));
		sCourse.add(new Student("���Ͽ�"));
		
		registerCourse(sCourse);
		registerCourseStudnet(sCourse); 
		//registerCourseWorker(WCourse); // ������� Ŭ����
	
		
	}

}
