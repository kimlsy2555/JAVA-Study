package example02;

public class BitOperatorEx {

	public static void main(String[] args) {
		
		// & | ^ ��Ʈ ������ 
		
		int x = -8 ;
		int y = -5;
		
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
	}

}
