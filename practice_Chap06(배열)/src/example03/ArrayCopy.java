package example03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		
		int [] ori = new int[] {10,77,33,50};
		
		int [] target= new int[10];
		int count = 0 ;
		System.out.println("������");
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
		
		//���� ���� ���� for�� ���
//		for(int i : ori )
//		{
//			target[count++] = i;
//		}
		// �������� c for�� ��Ÿ��
//		for(int i = 0 ; i<ori.length;i++)
//		{
//			target[i]= ori[i];
//		}
		
		// systen Ŭ���� �� �̿��� ���� 
		//System.arraycopy(ori,0,target,5,ori.length);  //++ ���� �ӵ��� ���� ������.
		// ������ �Ȱ��� ���� Arrays.copyOf ���̱��� �� 
		target = Arrays.copyOf(ori,ori.length);
		System.out.println(target.length);
		
		System.out.println("������");
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
	}

}
