package example02;

public class Circle extends Shape {

	
	Point center;
	int radius;
	
	public Circle() {
		this(new Point(0,0),100);
	}
	
	
	public void draw() {
		System.out.println("����: " +this.Color);  
		System.out.print("���� : "+ this.center.x+" "+this.center.y);
		System.out.println(" ������ :"+this.radius);
		
		
	}
	
	
	public Circle(Point center,int radius) {
		
		System.out.println("CircleŬ������ �Ű������� �ִ� ������ ȣ��"); 
		this.center = center;
		this.radius = radius;
		
	}
		
	

	

}

