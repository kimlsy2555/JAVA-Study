package example04;



import java.util.Calendar;

import javax.xml.crypto.Data;

public class UserEx {

	public static void main(String[] args) {
	
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime());
		
		
		
		
		System.out.println(user1);
		System.out.println(user2);
		
		//Object Ŭ������ equals()�ּ� �� 
		// ��ü�� == ������ �ּ� �� �񱳿��� user1==user
		
		if(user1.equals(user2)) {
			
			System.out.println("���� ��ü ��"); 
		}
		else {
			System.out.println("�ٸ� ��ü��"); 
		}
	
		
		//�̱��� ������ ����ϴ� ����
		// ��, �ϳ��� �ν��Ͻ��� �����ؼ� ���� �����ϰ��� ���ϰ��� �Ҷ� ���
		// ex) ����� ȯ�� ���� , Ŀ�ټ�Ǯ, ������Ǯ OS�� �ð� �̳� ��¥ ��
	}
	

}
