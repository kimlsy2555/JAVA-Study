package example03;

public class ProductEx {

	public static void main(String[] args) {
		
		Product original =new Product("1225", "Tv", 300, new int[] {10,20});
		
		Product cloned =  original.getProduct(); // ��� ������ �� ��ü�� ����
		
		
		int[] arr1 = cloned.getArr();
		int[] arr2 = original.getArr();
		System.out.println("�迭 �ּ�(������ü) " +arr1);
		System.out.println("�迭 �ּ�(������ü) " +arr2);
		arr1[0] = 777;
		System.out.println(original);	
		System.out.println();
		
		System.out.println(cloned);
	}

}
