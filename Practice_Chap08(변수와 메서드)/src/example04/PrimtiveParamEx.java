package example04;

class A{
	int data;
	int test;
}

public class PrimtiveParamEx {

	public static void main(String[] args) {
	
		A a = new A();
		a.data = 77;
		System.out.println("�޼��� ȣ���� main()�� �� "+a.data);
		// �Ϲ������� ���� ȣ�� EX ���� �����?? ����� ���¶� ���� ���� �� �ִ�.
		// call by Value (���� ���� ����)
		PrimtiveParamEx.dataChange(a.data);
		System.out.println("�޼��� ȣ���� main()�� �� "+a.data);
	}
	
	public static void dataChange(int data) {
		// �������� data ��� ���� �����簡 �̷������ ������
		// ȣ���� ������ �ƹ��� ������ ���� �ʴ���.
		data =44;
		System.out.println("dataChange()�� : "+data);
		return;
	}

}
