package example03;

public class CallStackEx {

	public static void main(String[] args) {
		// �ݽ����� ���� �����̴�.(LIFO)
		// Ex.������ �ױ� <-> ť(Quere,FIFO) ������ ����ȣ��
		System.out.println("main()�����");
		//static�� static�� ȣ�� ������
		
		CallStackEx.first();
		System.out.println("main()�����");
	}
	 
	public static void first() {
		System.out.println("first()�����");
		CallStackEx.second();
		System.out.println("first()�����");
		
	}
	
	public static void second() {
		System.out.println("second()�����");
		CallStackEx.third();
		System.out.println("second()�����");
			
	}
	public static void third() {
		System.out.println("third()�����");
		
		System.out.println("third()�����");
		
	}
}
