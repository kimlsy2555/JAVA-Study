package example05;

public class PolyAgumentEx {

	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
		
		// �ʵ��� ������
		Product p1 = new TV();
		Product p2 = new Audio();
		Product p3 = new Computer();
		
		Product[] pArray = new Product[10];
		
		buyer.buy(p1);
		buyer.buy(p2);
		buyer.buy(p3);
		
		buyer.buy(new TV());
		buyer.buy(new Audio());
		buyer.buy(new Computer());
		// buyer.buy(new Apple()); //������ ���ܰ� �߻��ϴ� ����
		// �������� ������ ����Ǳ� ���ؼ��� ��� ���谡 �Ǿ��ϱ� ������ 
		// ����Ϸ��� AplleŬ������  Product �� ��� ���ִ��� buy�ż��忡 �����ε��� �ؾ��Ѵ�.
		System.out.println("���� �ܾ� : " + buyer.money + "�� �Դϴ�");
		System.out.println(" ������ : " + buyer.bonusPoint + "�� �Դϴ�");
	}

}
