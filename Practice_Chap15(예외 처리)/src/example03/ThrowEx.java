package example03;

public class ThrowEx {

	public static void main(String[] args)  {
		
		try {
			// ���� ���� �߻� Ű���� throw
			throw new Exception("���� ���� �߻�");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("���� ����");
	
		
		
	}

}
