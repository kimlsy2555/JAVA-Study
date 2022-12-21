package bankApplication;

import java.util.Scanner;

public class BankApplication {

	
	// ��� 100 �� ���� ����� �Ǿ��ְ�, �迭�̹Ƿ� �Ѱ谡 �ִ�.(�޸� ���� ,����)
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		//atm ���� ��� ���� ������ ���ѷ����� ���鿹��
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("|1.���»���|2.���¸��|3.�����ϱ�|4.����ϱ�|5.�����ϱ�|");
			System.out.println("----------------------------------------------");
			System.out.print("����->");
		
		int choice =sc.nextInt();
			if(choice == 1) {
				createAccount();
				
				
			}
			else if(choice == 2) {
				accountlist();
				
			}
			
			else if (choice == 3) {
				deposit();
				
			}
			
			
			else if (choice == 4) {
				withdraw();
				
			}
			
			else if (choice == 5) {
				System.out.println("���� ���� ���α׷��� �����մϴ�.");
				run= false;
			}
			else {
				System.out.println("�߸� �Է� �ϼ˽��ϴ�.!!");
			}
			
		}
		
	}
	public static void  createAccount() {
		System.out.println("---------------"); 
		System.out.println("���¸� �����մϴ�.");
		System.out.println("---------------"); 
		
		System.out.print("���¹�ȣ : "); 
		//next () : �� �ܾ �Է¹��� �� ������ �޼��� (������ �߰��ϸ� �� �ձ����� String ����)
		//nextLine() : �� �����̳� �� ���� �Է¹��� �� ������ �޼���() 
		String ano = sc.next();
		System.out.print("������ : "); 
		String owner = sc.next();
		
		System.out.print("�ʱ� �Աݾ� : "); 
		int balance = sc.nextInt();
		
		Account newAccount = new Account( ano, owner,balance);
		
		for(int i = 0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				//����ġ �۾���
				accountArray[i] = newAccount;
				System.out.println("��� : ���� ���� �Ϸ�");
//				System.out.println(accountArray[i].getAno()+","
//						+accountArray[i].getOwner()+","
//						+accountArray[i].getBalance());
				break;
			}
		}
	}
	
	public static void accountlist() {
		System.out.println("---------------"); 
		System.out.println("���¸���� ����մϴ�.");
		System.out.println("---------------"); 
		
		for(int i = 0;i<accountArray.length;i++) {
			Account account =accountArray[i];
			if(account != null) {
				System.out.print(account.getAno()); 
				System.out.print("\t"); 
				System.out.print(account.getOwner()); 
				System.out.print("\t"); 
				System.out.print(account.getBalance()); 
				System.out.println(); 
				
			}
		}
	}
	
	public static void deposit() {
		System.out.println("---------------"); 
		System.out.println("������ �մϴ�.");
		System.out.println("---------------"); 	
		
		System.out.print("���¹�ȣ �Է� : ");
		String ano = sc.next(); 
		System.out.print("���ݾ� �Է� : ");
		int money = sc.nextInt(); 
		
		Account account = findAccount(ano);
		
		if(account == null){
			System.out.println("��� : ���°� �����ϴ�. Ȯ�� �ٶ��ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("�ְ� : ���� �Ϸ�  ���� �ܾ� : "+account.getBalance());
		
	}
	
	public static void withdraw() {
		System.out.println("---------------"); 
		System.out.println("����� �մϴ�.");
		System.out.println("---------------"); 	
		
		System.out.print("���¹�ȣ �Է� : ");
		String ano = sc.next(); 
		System.out.print("��ݾ� �Է� : ");
		int money = sc.nextInt(); 
		
Account account = findAccount(ano);
		
	if(account == null){
		System.out.println("��� : ���°� �����ϴ�. Ȯ�� �ٶ��ϴ�.");
		return;
	}
	account.setBalance(account.getBalance() - money);
	System.out.println("�ְ� : ��� �Ϸ�  ���� �ܾ� : "+account.getBalance());
	}
	
	
	
	
	
	
	
	
	
	
	public static Account findAccount(String ano) {
		
		Account account = null;
		for(int i = 0;i<accountArray.length;i++) {
			if(accountArray[i] !=null) {
				if(accountArray[i].getAno().equals(ano)){
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	
	
	
}
