package CardDeck;

public class DeckEx {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		//Deck �� �����ڸ� ȣ���ϸ� �׻� ,���Ե� Ŭ�������� ������ ������(�߿�)
		Card c = d.pick(51);
		System.out.printf("ī�� �������� ���� �� �ִ� ī�� : "); 
		System.out.println(c.toString()); 
		
		d.shuffle();
		c= d.pick(51);
		System.out.printf("ī�� ������ �� ���� �� �ִ� ī�� : "); 
		System.out.println(c.toString()); 
		
		
		c= d.pick();
		System.out.printf(" ī�� ������ �� ���Ƿ� ���� ī�� : "); 
		System.out.println(c.toString());
	}

}
