package example06;

// ����Ŭ����
public class Product {

	private int proudctID;
	private String description;
	private String maker;
	private int	price;
	public Product(int proudctID, String description, String maker, int price) {
		super();
		this.proudctID = proudctID;
		this.description = description;
		this.maker = maker;
		this.price = price;
	}
	
	
	public int getProudctID() {
		return proudctID;
	}
	public String getDescription() {
		return description;
	}
	public String getMaker() {
		return maker;
	}
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("��ǰ ID >> " + (this.getProudctID() + 1));
		System.out.println("��ǰ ���� >> " + (this.getDescription()));
		System.out.println("������ >> " + (this.getMaker()));
		System.out.println("���� >> " + (this.getPrice()));
	}
	
	
}
