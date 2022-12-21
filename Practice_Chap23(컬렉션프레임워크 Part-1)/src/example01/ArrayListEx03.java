package example01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		
		// Arrays.asList()�� �÷����� �ƴ϶� ,�迭�������� �� �÷����� �����Ѵ�
		List<String> list = Arrays.asList("��Ը�","��ä��","������");
		
		// �Ʒ��� ���� ��ü �߰�, ������ �ϸ� UnsupportedOperationException �߻�
		// ������ asList() �迭������ �÷����� �����ϱ� �����̴�.
		//list.add("ddd");
		//list.remove(0);
		System.out.println(list.toString());
		
		List<Integer> list2= Arrays.asList(100,200,300);
		
		// List �÷����� ������ �迭�� ���� ����� �ִ�.
		Integer[] arr = (Integer[])list2.toArray();
		
		int [] arr1 = new int[3];
		
		for(int i=0;i<arr.length;i++) {
		
				arr1[i]= arr[i];
			}
			
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr1[0]==100) {
				arr[0] = null;
			}
			System.out.println(arr[i]);

		}

	}
}
