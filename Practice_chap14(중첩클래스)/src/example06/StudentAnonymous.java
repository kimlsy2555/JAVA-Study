package example06;

public class StudentAnonymous {

	// �ʵ��� �ʱⰪ
	
	Student student1 = new Student("���ؼ�") {
		// �͸��ڼ� ��ü�� ��� �޼���
		public void goSchool() {
			System.out.println(this.name+"�� ��մϴ�.");
		}
		@Override
		public void wake() {
			
			System.out.println("================================");
			System.out.println("�ʵ��� �ʱⰪ ���·� ������� �͸� �ڼ� ��ü");
			System.out.println(this.name + "�� �Ͼ�ϴ�.");
			this.goSchool();
			System.out.println("================================");
		}
		
	};
	
	//���� ������ �ʱⰪ
	public void method1() {
		Student lStudent = new Student("���Ͽ�") {
			
			public void goRoom() {
				System.out.println(this.name+"�� �Ĺ��غ� �Ϸ� �����ǿ� ���ϴ�.");
			}
			
			@Override
			public void wake() {
				
				System.out.println("================================");
				System.out.println("���ú����� ���·� ������� �͸� �ڼ� ��ü");
				System.out.println(this.name + "�� �Ͼ�ϴ�.");
				this.goRoom();
				System.out.println("================================");
			}
			
		};
		lStudent.wake();
		
	}
	
	
	// �޼����� �Ű����� ��
	
	public void method2(Student student) {
		student.wake();
	}
}



