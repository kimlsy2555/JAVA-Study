package example02;

public class MemberEx {

	 public static void study() {
		 System.out.println("Java");
	 }
	public static void main(String[] args) {
		
		
		// �Ʒ��� static ������̹Ƿ� �ν��Ͻ� �ּ����� , �󸶵��� Ŭ������ .������� ������
		// ������ �����ϴٶ�� ���� �����ְ� �ִ�.
		// static�� staic�� ȣ���� �����ϴ�
		Member.smethod();
		Member.cv = 500;
		Member.smethod();
		
		
				
		
		study();
		
		// �ν��Ͻ� ������� ����ϱ� ���ؼ��� �ݵ�� new ��� �����ڰ� �����ٰ�
		// �ν��Ͻ��� ������ ����� �����ϴ�.
		
		Member m = new Member();
		m.imethod();
		m.iv = 999;
		m.imethod();
		
		
		
	}

}
