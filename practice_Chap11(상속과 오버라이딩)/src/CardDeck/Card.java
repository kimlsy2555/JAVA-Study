package CardDeck;



public class Card {
	// Ŭ���� ���� ������. Ŭ���� ������ Ŭ���� �ε��ʰ� ���ÿ� �ö�, ���� �����ͷ� Ȱ��
	static final int KIND_MAX = 4; // ī�� ���� ���� ���̽� Ŭ���� ��Ʈ  ���̾�
	static final int NUM_MAX = 13; // ���̺� ī���
	
	// ���� �� ����� ����
	
	static final int SPADE = 4;
	static final int DINMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	public Card(int kind, int number) {
		super(); // object�� �⺻ ������ ȣ��
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		// ���� ������ �ݵ�� �ʱ�ȭ
		String kind = "";
		String number = "";
		
		// ���� ����
		
		switch(this.kind){
		
			case 4 : 
				kind = "�����̵�";
				break;
				
			case 3 : 
				kind = "���̾Ƹ��";
				break;
				
			case 2 : 
				kind = "��Ʈ";
				break;
			
			case 1 : 
				kind = "Ŭ�ι�";
				break;
			
		}
		// ���� ����
		switch(this.number) {
		
		case 13 :
			number = "K";
			break;

		case 12 :
			number = "Q";
			break;
			
		case 11 :
			number = "J";
			break;
		
			default : 
				number =this.number+"";
			break;
		}
		
		return "���� : " + kind + "," + " ���� : " + number;
	}
}
