package example07;

public class Defult_StaticEx {

	public static void main(String[] args) {
		
		MyInterface mInterface = new Person();
		mInterface.dmethod();
		mInterface.method();

		//�������̽��� �����޼��嵵 ȣ���ϴ� ����� �������̽���.�����޼��� �� ȣ��
		//���� Ÿ���� Ŭ����Ÿ���̾ƴ� �������̽� Ÿ���̴�.
		MyInterface.smethod();
	}

}
