package example02;

public class SubStringEx {

	public static void main(String[] args) {
		
		String phoneNum = "01046449538";
		
		// subString() ���ڿ��� �߶󳻾� String���� ��ȯ
		
		String str1 = phoneNum.substring(3);
		System.out.println(str1);
		
		
		// ������ �ε����� ������
		String str2 = phoneNum.substring(0,3);
		System.out.println(str2);
	}

}
