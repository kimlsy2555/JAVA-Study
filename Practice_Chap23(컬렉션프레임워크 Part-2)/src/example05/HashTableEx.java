package example05;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {

		//Hashtable : ������ ��ɵ���
		
		Map<String,String> map = new Hashtable<String,String>();
		// ��ü �߰�
		map.put("spring","12");
		map.put("summer","123");
		map.put("fall","1234");
		map.put("winter","12");
		
		System.out.println("�� Entry �� : "+map.size());
		
		int count = 0;// ��й�ȣ Ʋ�� Ƚ�� ����
		// ��ü �˻� 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID PASSWARD �Է� ");
			System.out.print("ID : ");
			String id = scanner.nextLine();
			System.out.print("PASSWARD : ");
			String passward = scanner.nextLine();
			System.out.println();
			
			// ����Ǿ� �ִ� ��ü�� �˻� �Ͽ� (������ DB ��� ��������) ���̵�� ��й�ȣ�� ��ġ�ϸ� �α��μ���
			// �ƴ϶�� ���ѷ����� ����������.
			
			if(map.containsKey(id)) {
				// id �� Ű�� �ְ� ����� ���� �翬�� passward �̴ϱ� 
				// ���ٸ� �α��� ����
				// �ƴϸ� ��й�ȣ�� ����ġ  count++ �ϱ� 
				if(map.get(id).equals(passward)) {
					System.out.println(id+"���� �α��� �Ǿ����ϴ�.");
					break;
				}
				else{
					count++;
					System.out.println("��й�ȣ �� "+count+"ȸ Ʋ�ǽ��ϴ�. ");
					if(count == 3) {
					System.out.println("��й�ȣ �� "+count+"ȸ Ʋ�ǽ��ϴ�."
							+ "���� ��� �Ͻʽÿ�");
						break;}}}
			else {System.out.println("���� ID �Դϴ�.");}
			
		}
		scanner.close();
	}

}
