package example02;

public class SwitchEx {

	public static void main(String[] args) {
		
		
		int score = 83;
		// int ������ ������, String ��
		switch(score/10) {
			case 10 :
				System.out.println("A++");
				break;
			case 9 :
				System.out.println("A");
				break;
			case 8 :
				System.out.println("B");
				break;
			case 7 :
				System.out.println("C");
				break;
			default :
				System.out.println("F");
		}

	}

}
