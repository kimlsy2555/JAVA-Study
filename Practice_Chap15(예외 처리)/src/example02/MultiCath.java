package example02;

import java.util.Arrays;

public class MultiCath {

	public static void main(String[] args) {
		
		try {
			int [] arr = new int [3];
			
			System.out.println(Arrays.toString(arr));
			
			//arr [3] = 100;    // ���ܹ߻�
			
			int result = 10/0;// ���ܹ߻�
			System.out.println(result);
			// Catch�������� �׻� Exception Ŭ������ �� �������� �;��Ѵ�.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� �ʰ��Ͽ����ϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0 ���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("���� �߻� ");
		} finally {
			System.out.println("���α׷� ����");
		}

	}

}
