package example01;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		//40 ����Ʈ�� ���� ���� �Ǿ���
		int[] arr1 = new int[10];
		// 6 ����Ʈ�� ���� ���� �Ǿ���
		char[] ch =new char[] {'a','b','c'};
		// arr1�迭���� ������ 10�� ����
		for (int i =0;i<arr1.length;i++){
		// 1~10 ������ ���� ����
			arr1[i] = (int)(Math.random()*10)+1;
		}
		
		for (int i =0;i<arr1.length;i++){
			if(i == (arr1.length)-1 ) {
				System.out.print(arr1[i]);
			}
			
			else {
				System.out.print(arr1[i]+",");
			}
			
		}
		System.out.println();
		// ArraysŬ������ �迭�� �����ϱ� ���� ����� ���� ��ƿ��Ƽ Ŭ����
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(ch));
		
		//�ּ� �� ��� 
		// ��� ��Ʈ�����ٰ� ���� ������ ������
		// ���� ������.tostring()ȣ���̵ȴ�
		
		// char Ÿ�� �� �ּҸ� ����Ϸ��� �ݵ��� toString()ȣ��
		System.out.println(arr1);
		System.out.println(arr1.toString()); //Ÿ��@16����
		
		
		System.out.println(ch.toString());
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
