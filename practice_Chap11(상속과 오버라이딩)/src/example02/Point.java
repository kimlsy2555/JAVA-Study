package example02;

public class Point {

	int x=0;
	int y=0;
	
	// �⺻������
	public Point() {
		this(0,0); //�� �ٸ� ������ ȣ��
	}
	// �ŰԺ����� �ִ� ������
	public Point(int x,int y) {
		System.out.println("Point Ŭ������ �ŰԺ����� �ִ� ������ ȣ��"); 
		this.x = x;
		this.y=y;
	
	}
}
