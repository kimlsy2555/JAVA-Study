package example02;

public class ReplaceEx {

	public static void main(String[] args) {
		
		//replace() ���ڿ��� ��ü�ϴ� �޼��� �̴�.
		
		String oldstr = "�ڹٴ� ��ü�������Դϴ�.";
		
		// ���ο� ��ü�� ������
		String newstr = oldstr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldstr.hashCode());
		
		System.out.println(newstr.hashCode());
		
	
	}

}
