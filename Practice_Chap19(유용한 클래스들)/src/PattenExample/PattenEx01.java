package PattenExample;

import java.util.regex.Pattern;

public class PattenEx01 {

	public static void main(String[] args) {
	// 010,02 �����ϴ� �޴��� ��ȣ�� ���� ���� ��ȭ ��ȣ�� �������� ����
		
		String pattern = "(010|02)-\\d{3,4}-\\d{4}";
		String phoneNum = "010-5544-1234";
		String seoulNum = "02-766-1234";
		//boolean result =  Pattern.matches(pattern, phoneNum);
		
		boolean result =  Pattern.matches(pattern, seoulNum);
		if(result) {
			System.out.println("��ȭ��ȣ ����� �½��ϴ�.");
		}
		else {
			System.out.println("��ȭ��ȣ ����� ���� �ʽ��ϴ�. �ٽ��Է����ּ���");
		}
		
		// �̸��� �����  �����ϴ� ���
		String email = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String emailData1 = "7@naver.com";
		String emailData2 = "abcd7@lg.co.kr";
		
		boolean emailResult = Pattern.matches(email, emailData2);
		
		if(emailResult) {
			System.out.println("�̸��� ����� �½��ϴ�.");
		}
		else {
			System.out.println("�̸���  ����� ���� �ʽ��ϴ�. �ٽ��Է����ּ���");
		}
		
		
	}
	




}
