package example02;

public class TrimEx {

	public static void main(String[] args) {

		
		
		// trim() �¿� ���鸸 ������ ,�߰��� �ִ� ������ 
		// ���� ���α׷��Ӱ� ���� �����ϴ�  �ڵ带 �ۼ��ؾߵ�

		String tel1 = "            010";
		String tel2 = "-4644       ";
		
		String tel3 = "   -9538";

		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
		
		
	}

}
