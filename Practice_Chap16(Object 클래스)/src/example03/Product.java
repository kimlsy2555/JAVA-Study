package example03;

import java.util.Arrays;

// Ŭ������ ������ �����ϰ� �Ϸ��� java.lang.Cloneable �������̽��� �����ؾ��Ѵ�
// ��Ŭ������ ������ ���� �˷�������
public class Product implements Cloneable{

	 private String id;
	 private String name;
	 private int price;
	 private int [] arr;
	 
	 
	 
	public Product(String id, String name, int price, int[] arr) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr =arr;
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
	 
	
	@Override
	public String toString() {
		
		return "��ǰ id : " + this.getId() + "\n"+
			   "��ǰ �̸�: " + this.getName()+ "\n"+
			   "��ǰ ����: " +this.getPrice()+"\n"+
			   "�迭 �� : "+ Arrays.toString(this.arr);
			
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	 
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

}
