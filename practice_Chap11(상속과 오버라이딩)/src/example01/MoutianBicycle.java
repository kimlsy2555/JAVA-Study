package example01;

// ����� �ϴ� ����
// 1. ������ �ڵ�� ���󿡼� ����
// 2. �������� �κ��� �ڼտ��� ���� ����
// 3. �ڵ���  ���뼺

// ����� ������ ����


public class MoutianBicycle extends Bicycle {
	// ��� ���� 5��
	String frame;
	int gear;
	int price;
	String sector;
		
	
	public void print() {
		System.out.println(this.id);
		System.out.println(this.brand);
		System.out.println(this.frame);
		System.out.println(this.gear);
		System.out.println(this.price);
		System.out.println(this.owner);
	}
	
	public static void main (String[] args) {
			MoutianBicycle moutianBicycle = new MoutianBicycle();
			moutianBicycle.id = 1111;
			moutianBicycle.brand = "LESPO";	
			moutianBicycle.frame="�˷��̴�";
			moutianBicycle.gear= 33;
			moutianBicycle.price=300000;
			moutianBicycle.owner = "���ؼ�";
			
			
			moutianBicycle.print();
			
		
	}
}
