package example03;

public class ProductEx {

	public static void main(String[] args) {
	
		Product<Tv, String> p1 = new Product<Tv, String>();
		p1.setT(new Tv(2020, 07));
		p1.setM("LG OLED ����Ʈ TV");
		
		System.out.println("���� TV �� : "+p1.getT().getYear()+"��"+
						   p1.getT().getMonth()+"�� ���̸� , "+p1.getM()+"�̴�");
		
		System.out.println("-------------------------------------------"); 
		
		Product<Car,String> p2 = new Product<Car, String>();
		
		p2.setT(new Car("����",2015,8));
		p2.setM("�׷���  HG300");
		
		Car car = p2.getT();
		String str = p2.getM();
		
		System.out.println("���� �ָ��� "+ car.getYear()+"�� "+ car.getMonth()
							+"�� ��õ� "+car.getBreandl()+" "+str+" �̴�");
		
	}

}
