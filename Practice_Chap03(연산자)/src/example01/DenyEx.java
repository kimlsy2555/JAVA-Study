package example01;

public class DenyEx {

	public static void main(String[] args) {
		
		
		//! �� ���� ������ ����~
		
		boolean power = false; 
		
		System.out.println("power : "+power);
		power =!power;
		System.out.println("power : "+power);
		power =!power;
		System.out.println("power : "+power);
		
		if (power) {
			System.out.println("if �����");
		}
	}

}
