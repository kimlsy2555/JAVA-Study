package example02;

public class CarEx {

	public static void main(String[] args) {
		
		
		Car c1 = new Car();
		
		Car c2 = new Car("����","�ڵ�",2);
		
		Car c3 = new Car("�Ķ�","����");
		
		System.out.println(c1);  
		
		
		System.out.println(c2);
		
		
		System.out.println(c3); 
		
	
		
		for(int i = 0; i<10; i++) {
			Car c = new Car(c2);
		System.out.println(i+" ���� �� : "+c); 
		
		}
			
	}

}
