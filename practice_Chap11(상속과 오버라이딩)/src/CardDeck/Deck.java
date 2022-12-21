package CardDeck;

public class Deck {

	
		final int CARD_NUM = 52; // ī���� ����
		// ��ü�迭(2���� �迭 Ÿ��)
		Card[] c = new Card[CARD_NUM];		
		
		int i = 0;
		// �ν��Ͻ� �ʱ�ȭ ��
		{
			// 52�� ���鼭 ī�带 �ʱ�ȭ
			for(int  k = Card.KIND_MAX;k > 0;k--) {
				for(int n = 1;n<Card.NUM_MAX+1;n++) {
					c[i++] = new Card(k,n);
					
				}
				
			}
			// ����� �ʱ�ȭ�� �̷�� ������ Ȯ�� ������ ���� ����غ�
			for(int j = 0;j<c.length;j++) {
				System.out.printf("C[%d] �� ���� : %d, C[%d]�� ���� : %d",j,c[j].kind,
						j,c[j].number); 
				System.out.println();
			}
		}
		
		public Deck() {
			super();
			System.out.println("Deck �⺻������ ȣ��");
		}
		
		
		// ������ ��ġ(intdex)�� �ִ� ī�� �ϳ��� ����
		public Card pick(int index) {
			if(0 <= index && index <CARD_NUM) {
				return c[index];
			}
			else {
				return pick();
			}
		}
		// Deck ���� ī�� �ϳ��� ���Ƿ� ����
		
		public Card pick() {
			int index = (int)(Math.random()*CARD_NUM);
			System.out.println();
			System.out.printf("%d\n",index);
			return pick(index);
		}
		// �ܼ��� ���� �޼���
		public void shuffle() {
			for(int n = 0; n<1000;n++) {
				// ī�带 �������� ���´�.
				int i = (int)(Math.random()*CARD_NUM);
				Card temp = c[0];
				c[0]= c[i];
				c[i] = temp;
			}
			System.out.println();
			System.out.println("ī�� ������ ���");
			for(int j = 0;j<c.length;j++) {
				System.out.printf("C[%d] �� ���� : %d, C[%d]�� ���� : %d",j,c[j].kind,
						j,c[j].number); 
				System.out.println();
				
			}
		}
		
}
