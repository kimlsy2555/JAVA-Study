package example02;

public class CharAtex {

	public static void main(String[] args) {
	
		String ssn = "980203-2234567";
		//                   o
		// Ư�����ڸ� �ް��� �� �� charAt() �޼��� ���
		
		char sex = ssn.charAt(7);
		
		if(sex == '1' || sex == '3') {
			System.out.println("���� �Դϴ�."); 
		}
		else if(sex == '2' || sex == '4'){
			System.out.println("���� �Դϴ�."); 
		}
		else {
			System.out.println("����� �ƴ�");
		}

	}

}
