package example01;

import java.util.Arrays;

public class ArrayIdexOutOfBoundsEx {

	public static void main(String[] args) {
	
		int [] arr = new int [5];
		
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<6;i++)
		{
			arr[i]=10; // i�� 5�϶� ���� �߻� �ɲ���� ����.
			System.out.println(i+" "+arr[i]);
		}
		
		
	}

}
