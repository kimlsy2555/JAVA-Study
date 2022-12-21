package example04;

import java.util.Arrays;

// Ŭ������ ������ �����ϰ� �Ϸ��� java.lang.Cloneable �������̽��� �����ؾ��Ѵ�
// ��Ŭ������ ������ ���� �˷�������
public class Product implements Cloneable{

	 private String id;
	 private String name;
	 private int price;
	 private int [] arr;
	 private Apple apple;
	 
	 
	 
	public Product(String id, String name, int price, int[] arr,Apple apple) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr =arr;
		this.apple = apple;
	}



	public String getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getPrice() {
		return price;
	}
	
	public int[] getArr() {
		return this.arr;
	}
	
	public Apple getApple() {
		return this.apple;
	}
	
	@Override
	public String toString() {
		
		return "��ǰ id : " + this.getId() + "\n"+
			   "��ǰ �̸�: " + this.getName()+ "\n"+
			   "��ǰ ����: " +this.getPrice()+"\n"+
			   "�迭 �� : "+ Arrays.toString(this.arr)+"\n"+
			   "Apple �� : "+ this.apple.price;
				
			
	}
	

	 
	public Product getProduct() {
		
		Product cloned = null;
		
		try {
			//���� ������ ���⼭ �Ͼ��.(���������� ������ ��������)
			cloned = (Product)this.clone(); // objcet Ŭ����
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cloned;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���� ������ ȣ��(�⺻�� Ÿ�� ��������)
		Product cloned =(Product)super.clone(); // Objcet Ŭ������ �� clone;
		// ����Ÿ�Ե��� �����ϴ� �ڵ�
		cloned.arr = Arrays.copyOf(this.arr,this.arr.length); // �迭 ����
		cloned.apple = new Apple(this.apple.price); // Ŭ���� ����
		
		return cloned;
	}

}
