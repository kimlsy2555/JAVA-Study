package example05;

public class Product {

	int price; // ��ǰ ����
	int bounsPoint; // ��ǰ ���Ž� ������
	public Product(int price) {
		
		this.price= price;
		//�������� ��ǰ ������ 10%����
		this.bounsPoint = (int)(price/10.0);
	}
	
}
