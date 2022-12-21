package arraysExample;

import java.util.Arrays;
import java.util.Objects;

class  Car{
	String model;
	public Car(String model) {
		this.model = model;
	}
	
	
	@Override
	public String toString() {
		return this.model;
	}
}

public class ArrayEqualsDeepEqualsEx {

	public static void main(String[] args) {
	
		int [] ori = new int [] {1,2};
		int[] cloned = Arrays.copyOf(ori,ori.length);
		
		//���� �� (1���� �迭�� ������ ��)
		System.out.println(Arrays.equals(ori,cloned));
		// �ּҺ� 
		System.out.println(Objects.equals(ori,cloned));
		System.out.println(ori);
		System.out.println(cloned);
		
		System.out.println("==================================");
		
		
		
		
		Car[] c1 = new Car[2];
		c1[0] = new Car("�׷���");
		c1[1] = new Car("Ʈ��");
		
		Car[] c2 = Arrays.copyOf(c1,c1.length);
		System.out.println(Arrays.equals(c1,c2));
		// �ּҺ� 
		System.out.println(Objects.equals(c1,c2));
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("==================================");
		
		// 2���� �迭 ���� 
		
		int[][] original = new int [][] {
										{1,2},
										{3,4}
										};
		// �A������
		System.out.println(original.length); 
		int[][] cloned1 = Arrays.copyOf(original,original.length );
		// Arrays.copyOf �ϸ� ���� ���� �߻� �迭�� �ּҰ��� ������
		// original[0]�� �ּҸ� cloned1[0] �� �ּ� ������ ��
		// �׷��� ������ ��ü�� �ƴ϶� ���� ������ �ְ� �ޱ� ������ 
		// �߸��� �迭 ���簡 �̷����
		
		System.out.println(Arrays.equals(original[0],cloned1[0]));
		//System.out.println(Objects.equals(original,cloned1));
		System.out.println(Arrays.deepEquals(original,cloned1));
		System.out.println("original[0] : " + original[0]);
		System.out.println("cloned1[0]  : " + cloned1[0]);
		System.out.println(original);
		System.out.println(cloned1);
		
		System.out.println("==================================");
		cloned1[0][0] = 10;
		System.out.println(Arrays.equals(original,cloned1));
		System.out.println(Arrays.deepEquals(original,cloned1));
		
		System.out.println(original[0][0]); 
		System.out.println(cloned1[0][0]); 
		
		
		
		
		System.out.println("==================================");
		// ���� ����
		int[][] cloned2 = Arrays.copyOf(original,original.length );
		System.out.println("original[0] : " + original[0]);
		System.out.println("cloned2[0]  : " + cloned2[0]);
		
		cloned2[0] = Arrays.copyOf(original[0],original[0].length );
		cloned2[1] = Arrays.copyOf(original[1],original[1].length );
		
		System.out.println(Arrays.equals(original,cloned2));
		System.out.println(Arrays.deepEquals(original,cloned2));
		
		System.out.println("original[0] : " + original[0]);
		System.out.println("cloned2[0]  : " + cloned2[0]);
		
		System.out.println(original);
		System.out.println(cloned2);
		System.out.println("==================================");
		
		cloned2[0][0] = 50;
		System.out.println(Arrays.equals(original,cloned2));
		System.out.println(Arrays.deepEquals(original,cloned2));
		
		System.out.println(original[0][0]); 
		System.out.println(cloned2[0][0]); 
		
		System.out.println("original[0][0]: "+original[0][0]); 
		System.out.println("cloned2[0][0] : "+cloned2[0][0]); 
		System.out.println("==================================");
		
	}

}
