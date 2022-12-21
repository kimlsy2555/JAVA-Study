package exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneManger {
	
	// �޴� ��ȣ�� ���� ����� ���� �Ѵ�.
	final int INSERT = 1;  // ��ȭ ��ȣ ����
	final int DELETE = 2;  // ��ȭ��ȣ ����
	final int SEARCH = 3;  // ��ȭ��ȣ �˻�
	final int SHOWALL = 4; // ��ü ��ȭ��ȣ �����ֱ�
	final int EXIT = 5;    // ���α׷� ����
	
	private Scanner scanner;
	
	private HashMap<String, Phone> map = new HashMap<String, Phone>();
	public PhoneManger() {
		
		this.scanner = new Scanner(System.in);
	}
	
	// ��ȭ ��ȣ ���� �޼���
	
	public void run() {
		System.out.println("==============================");
		System.out.println("��ȭ ��ȣ ���� ���α׷��� �����մϴ�.");
		System.out.println("==============================");
		
		
		while(true) {
			System.out.print("1:����, 2:����, 3:ã��,4:��ü����,5:���� >> ");
			// nextInt() �� ����ڰ� �Է��� ���� ������ ���� ���� (����)�� ���� ���� �ʴ���
			// ���� ���� ���� ���ڸ� �Է� �޴´�.
			
			// �ذ���
			// Scanner.nextLine(); --> ���ۿ� �ִ� ������ �� �������.
			
			int meue = scanner.nextInt();
			scanner.nextLine(); // ���ۺ���
			switch (meue) {
			case INSERT:
				insert();
				break;
				
			case DELETE:
				delete();
				break;
				
			case SEARCH:
				search();
				break;
				
			case SHOWALL:
				showAll();
				break;
				
			case EXIT:
				System.out.println("���α׷��� ���� �մϴ�");
				return;
				
			default:
				System.out.println("�Է��� �߸� �Ǿ����ϴ� �ٽ� �Է� �ϼ���");
				continue;
			
			}
		}
	}
	
	// ��ȭ ��ȣ ���� �޼���
	
	public void insert() {
		System.out.print("�̸� >> ");
		String name = scanner.nextLine();
		
		
		// �̸����� �ߺ� Ȯ��
		if(map.get(name)!= null) {
			System.out.println(name+"���� �̹� ��� �Ǿ����ϴ�.");
		}
		
		
		System.out.print("�ּ� >> ");
		String address = scanner.nextLine();
		
		System.out.print("��ȭ��ȣ >> ");
		String telNum = scanner.nextLine();
		
		
		// HashMap�� �����ϱ�
		map.put(name,new Phone(name, address, telNum));
		System.out.println(name +"���� ����Ǿ����ϴ�.");
	}
	
	// ��ȭ ��ȣ ���� �޼���
	
	public void delete() {
		System.out.print("�̸� >> ");
	
		String name = scanner.nextLine();
		
		Phone phone = map.remove(name);
		// ��� ���ο� ���� �б�
		if(phone == null) {
			System.out.println(name+"���� ��ϵ��� ���� ����Դϴ�.");
		}
		else {
			System.out.println(name+"���� ������ ���� �Ǿ����ϴ�.");
		}
		
		
	}
	
	// ��ȭ ��ȣ ã�� �޼���
	
	public void search(){
		
		System.out.print("�̸� >> ");
		String name = scanner.nextLine();
		
		Phone phone = map.get(name);
		
		if(phone == null) {
			System.out.println(name+"���� ��ϵ��� ���� ����Դϴ�.");
		}
		else {
			System.out.println(phone.toString());
		}
	}
	
	// ��ü ��ȭ��ȣ ����
	
	public void showAll() {
		
		int count = 1 ;
		
		Set<String> keys = map.keySet();
		
		Iterator<String> iterator = keys.iterator();
		
		System.out.println("���� ���� �Ǿ��ִ� �� ���� ����Ʈ �Դϴ�.");
		
		while(iterator.hasNext()) {
			
			String name = iterator.next();
			
			Phone phone = map.get(name);
			
			System.out.println(count + ". "+phone.toString());
			
			count ++;
			System.out.println("==============================");

		}
		
		
	}

	
	
}
