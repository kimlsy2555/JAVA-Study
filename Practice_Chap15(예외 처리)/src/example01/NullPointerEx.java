package example01;

public class NullPointerEx {

	public static void main(String[] args) {
		
		
		String str = null;
		// �� ���ܴ� ��ü(�ν��Ͻ�) �� ���µ� ��X�� �ν��Ͻ��� �ִ� toString()ȣ��??
		
		try {
			System.out.println(str.toString());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	
		
		

	}

}
