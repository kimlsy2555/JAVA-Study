package example04;

public class ReferenceParamArrayEx {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10,20,30,40,50};
		System.out.println("change�ż��� ȣ�� ���� �� : "+arr[0]);
		System.out.println(arr);
		
		change(arr); // �迭���� �� �ּҴ� 2�����迭������ 1���� �迭�� �ּҴ�~
		//change(new int [] {10,20,30}); ������ ���� �ּҰ��� �Ѱܵ��ȴ�
		System.out.println("change�ż��� ȣ�� ���� �� : "+arr[0]);
	}
	
	public static void change(int[] arr) {
		arr[0]= 999;
		System.out.println(arr);
		System.out.println("change() �ż��� ���� �� : "+arr[0]); 
		
	}
	
}
