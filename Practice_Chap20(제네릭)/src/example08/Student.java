package example08;
// ������ ���׸� Ÿ���̸� �ڼյ� ���׸� Ÿ���̾���Ѵ�.

public class Student<T,M,C> extends Person<T,M>{

	private C c;

	
	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}
	
}
