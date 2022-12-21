package example07;

public class Course<T> {

	private String name;
	private  T[] students;
	
	public Course() {
		
	}

	@SuppressWarnings("unchecked")
	public Course(String name, int size) {
		
		this.name = name;
		// ���� TŸ���� ������ ���� �ʾұ� ������ �迭�� ������ �� ���� ����.
		// �׷��⿡ ��� Ŭ������ �����ϴ� Object Ŭ������ �̿��Ͽ� �迭�� �������.
		// ���Ŭ������ ������ Object �̰� ���� TŸ������ �ٿ�ĳ������ �ϸ� �ȴ�.
		this.students = (T[]) new Object[size];
	}
	
	public void add(T t) {
		for(int i = 0; i<this.students.length;i++) {
			if(students[i]==null) {
				students[i] = t;
				break;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getStudents() {
		return students;
	}

	public void setStudents(T[] students) {
		this.students = students;
	}
	
	
}
