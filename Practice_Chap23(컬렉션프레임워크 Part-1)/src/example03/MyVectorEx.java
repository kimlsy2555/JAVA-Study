package example03;

public class MyVectorEx {

	public static void main(String[] args) {
	
		MyVector myVector = new MyVector();
		System.out.println("�뷮�� : "+myVector.capacity());
		
		myVector.add("2000");
		myVector.add("20");
		myVector.add("-15");
		myVector.add("ȫ�浿");
		myVector.add("7.5");
		
		System.out.println("1�� �ε��� �� : "+myVector.get(1));
		System.out.println("������ "+myVector.toString());
		System.out.println("��ü��  : "+myVector.size());
		System.out.println("============================");
		
		myVector.remove(1);
		//myVector.remove(1);
		System.out.println("������ "+myVector.toString());
		System.out.println("��ü��  : "+myVector.size());
		System.out.println("============================");
		
		myVector.clear();
		System.out.println("������ "+myVector.toString());
		System.out.println("��ü��  : "+myVector.size());
		System.out.println("============================");
		
	}

}
