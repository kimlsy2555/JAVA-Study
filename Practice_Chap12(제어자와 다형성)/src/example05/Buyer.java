package example05;
//���� Ŭ����
public class Buyer {

	int money = 1000;	//�����ݾ�
	int bonusPoint = 0; // ������
	
	
	//���⼭ �Ű����� Producet Ÿ���� �Դٴ°��� ������ �ǹ��ϴ°�?
	// Product �� ��Ӱ��迡 �ִ� �ڼյ��� ��� �� �� �ְԵȴ�. (�Ű������� ������)
	public void buy(Product p) {
		if(this.money<p.price) {
			System.out.println("�ܾ��� �����մϴ�."); 
			return;
		}
		this.money -= p.price;
		this.bonusPoint +=p.bounsPoint;
		System.out.println(p + "�� �����ϼ̽��ϴ�.");   
	}

	
	
	
	// �Ʒ��� ���� ���α׷��� �ϴٺ��� �ڵ��� ���̴� ���Ѵ밡�Ǹ� ���� ��ȿ������ �ݺ��̴�.
//	public void buy(TV tv) {
//		if(this.money<tv.price) {
//			System.out.println("�ܾ��� �����մϴ�."); 
//			return;
//		}
//		this.money -= tv.price;
//		this.bonusPoint +=tv.bounsPoint;
//		System.out.println(tv + "�� �����ϼ̽��ϴ�.");   
//	}
}
