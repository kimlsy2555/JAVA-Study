package example04;

public class AccountEx {

	public static void main(String[] args) {
	
		Account account = new Account();
		
		account.deposit(50000);
		System.out.println("���� �ܾ� : "+account.getBalnce());
		
		
		try {
			// ����ó�� �ڵ尡 �ݵ�� ������
			// withdraw() ���ܸ� ������ �ֱ⶧��
			account.withdraw(10000);
			System.out.println("���� �ܾ� : "+account.getBalnce());
			System.out.println();
			account.withdraw(50000);
			System.out.println("���� �ܾ� : "+account.getBalnce());
		} catch (BalanceException e) {
			System.err.println("���� ���� : "+e.getMessage());
		//	 e.printStackTrace();
		} finally {
			System.out.println("���� ���� ��");
		}
		
	}

}
