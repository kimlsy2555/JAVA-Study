package example04;

import java.util.Arrays;

public class ReferenceReturnEx {

	public static void main(String[] args) {
		
		int [] ori = new int[] {10,20,30,40,50};
		int [] cloned;
		
		System.out.println("copy()ȣ�� �� ");
		cloned = copy(ori,ori.length);
		System.out.println("ori[] : "+Arrays.toString(ori)); 
		System.out.println("copy()ȣ�� �� ");
		System.out.println("cloned[] : "+Arrays.toString(cloned)); 
		
	}
	// ���� Ÿ���� ���� Ÿ���ΰ�� 
	public static int [] copy(int[]arr,int size){
		
		int [] temp = new int [size];
		//System.arraycopy(arr, 0, temp, 0, arr.length);
		
		for (int i = 0;i<arr.length;i++){
			temp[i]=arr[i];
		}
		return temp;
		
	}
}
