package example01;

//�ϳ��� �ڹ� ���Ͽ��� public �� ���ϼ��ִ� Ŭ������ ���Ѱ�~
// AŬ������ �⺻�����ڸ� �������ʰ� �ڵ����� �������ش�.
class A{
	int vale;
}
class B{
	int vale;
	public B() {
	}
	public B (int vale){
		this.vale = vale;
	}
}

public class ConstructorEx {

	A a = new A();
	// ������ ���ܸ� ��� ��� 
	// 1. BŬ������ �⺻�����ڸ� �߰�
	// 2. BŬ���� ������ ȣ��� �Ű����� ������ int ���� ���� ���ش�.
	B b = new B(4);
	
	
	public static void main(String[] args) {
		

	}

}
