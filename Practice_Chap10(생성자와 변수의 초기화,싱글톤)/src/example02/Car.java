package example02;

public class Car {
	
	
	String color;
	String gearType;
	int door;
	
	
	public Car(){
		this("���","����",4);
	}
	 
	public Car(String color) {
		this.color=color;
	}
	
	public Car(int door) {
		this.door=door;
	}
	
	public Car(String color,String gearType) {
		this.color= color;
		this.gearType= gearType;
	}
	
	public Car(String color,int door) {
		this.color= color;
		this.door = door;
	}

	public Car(String color,String gerType,int door) {
	//	color= color; // ������ ��ȣ���� �Ͼ�� �ʱ�ȭ�� ���̷����
		
	// this : ���������� ���� ����, �Ű������� ��������� �������µ� ���
	// �ݵ��  this �� �Ἥ ��Ȯ�ϰ� ���α׷��� �ǵ����Ѵ�.
		
		
		this.color= color;
		this.gearType= gerType;
		this.door= door;
	}
	
	public Car(Car c) {
		
		this.color = c.color ;
	   	this.gearType= c.gearType;
		this.door= c.door;
		
	}
	
	@Override
	public String toString() {
		
		return this.color +" "+this.gearType+" "+this.door;
	}
	

}
