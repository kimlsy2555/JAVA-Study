package example03;

public class ThrowAndThrowsEx {

	public static void main(String[] args) {
		
		//boolean result = false;
		
		
		try {
			 findClass();
			 System.out.println("Ŭ������ �ֽ��ϴ�");
//			if (result) {
//				System.out.println("Ŭ������ �ֽ��ϴ�");
//			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�˼����� ���� �߻�");
			// �����ڿ�, �����ÿ��� ���ų� �ּ�ó��
		e.printStackTrace();
		} finally {
			System.out.println("���� ����");
		}
		

	}
	
	public static void findClass() throws Exception{
		
		
		Class class1 = Class.forName("java.lang.String");
		throw new Exception("���� ���� �߻�");
//		if(class1 != null)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
	}

}
