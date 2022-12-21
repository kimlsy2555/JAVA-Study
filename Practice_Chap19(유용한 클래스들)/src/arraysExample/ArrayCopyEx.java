package arraysExample;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		
		int[] arr1 = new int [] {10,20,30,40};
		
		// 1. �迭 ���� ��� (copyOf)
		
		int[] cloned = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr1   : "+Arrays.toString(arr1));
		System.out.println("cloned : "+Arrays.toString(cloned));
		System.out.println("==========================");
		
		// 2. �迭 ���� ��� (copyOfRange)
		// �迭�� 1�ε��� ���� 3��° �ε��� ���� ���� ������ ���ε����z �������� ���� 1,2 �ε��� ����
		
		cloned = Arrays.copyOfRange(arr1, 1,3 ); 
		System.out.println("arr1   : "+Arrays.toString(arr1));
		System.out.println("cloned : "+Arrays.toString(cloned));
		System.out.println("==========================");
		
		// 3. �迭 ���� ���(System.arraycopy)
		// arr1[] �� 0��° �ε������� cloned[] 2�� ���̸�ŭ ���� 
		// �� 2���� �����ǳ�~  System.arraycopy �� �̹� ������ �迭���� �Ҵ� �ǹǷ�
		// ���� cloned �迭�� ũ��� 2�̱� ������ arraycopy���� 2���� �ε����� ����ǰ�
		// �׻��� ArrayIndexOutOfBoundsException ������ �߻��ȴ� (�迭 ������� ��������)
		
		System.arraycopy(arr1, 0, cloned, 0,2);
		System.out.println("arr1   : "+Arrays.toString(arr1));
		System.out.println("cloned : "+Arrays.toString(cloned));
		
	}

}
