package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsEx {

	public static void main(String[] args) {


		Integer integer1 = new Integer(100);
		Integer integer2 = new Integer(100);
		Integer integer3 = new Integer(100);
		
		
		// ��� ���� Ŭ���� ������  ObjectŬ������ equals() �������̵� �Ǿ��ִ�.
		System.out.println(integer1.equals(integer2));
		
		// Object�� equals()�� ������ �Ǵ� ��ü, �񱳰� �Ǿ����� ��ü ���� �и��� �Ǿ��ִ� ����
		// Objects �� equals() ���ϴ� 2��� �Ű������� �ָ�ȴ�.-- �������� Ȥ�� ���߿� ����
		System.out.println(Objects.equals(integer1,integer2));
		
		Integer[] arr1 = {new Integer(10),new Integer(50)};
		Integer[] arr2 = {new Integer(10),new Integer(50)};
		
		
		// Objects.equals() �Ű������� ����Ÿ���� ������ �ּҺ�(���� ��) 
		System.out.println(Objects.equals(arr1,arr2));
		
		// Objects.deepEquals() �� �Ű������� �迭�� ������ ���� �� (�׸� ��)�� �Ѵ�.
		
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
	}

}
