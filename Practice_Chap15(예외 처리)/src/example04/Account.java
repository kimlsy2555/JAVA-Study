package example04;

public class Account {
	
	private long balnce;
	
	public Account() {
	
	}
	// ������ �ܾ��� ��������
	public long getBalnce() {
		
		return this.balnce;
	}
	// �Ա��ϱ�
	public void deposit(int money){
		this.balnce += money;
	}
	// ����ϱ�
	public void withdraw(int money) throws BalanceException{
		if(this.balnce < money) {
			// ���� ���� �߻�
			throw new BalanceException("�ܾ� ����");
		}
		this.balnce -= money;
	}
}
