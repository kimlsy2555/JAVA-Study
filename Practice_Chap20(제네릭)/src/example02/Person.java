package example02;

// Person �̶�� Ŭ������ ���ʸ� Ÿ������ ������
public class Person<T> {
	
	// T��� Ÿ���� ���� �������� �ʾҴ�.
	// T�� �����ڵ忡�� ��������.
	// �Ͽ� , static�� �ü��� ����.(�ν��Ͻ��� ��������� ��� �����ϱ⶧��)

		private T t;

		
		
		public T getT() {
			return t;
		}

		public void setT(T t) {
			this.t = t;
		}
		
	
}
