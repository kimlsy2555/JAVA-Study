package example03;

import java.util.Scanner;

public class MethodEx {
	
	// �ż����� �����  ����
	// 1. ���� Ÿ�� (��ȯ��) : int 
	// 2. �ż����  // �Լ� �� �ż����� �θ���.
	// 3. ()�� �Ű�����, ���ڰ�  Arguments
	// �ż��� �����, �ż��� ������ (���Ǻ�)
	// �ż��� ����� �߿䵵 (99%)
	
	public static int add(int x, int y, int z1)//�ż��� �����
	{
		//�ż��� ������
//		int temp =0;
//		temp =x+y+z1;
		System.out.println("add �ż��� ȣ��");
		return x+y+z1;
		//�ż��� ������
	}
	public static int minus(int x1,int y1) {
		
		
		System.out.println("minus �ż��� ȣ��");
		return x1-y1;
		
		
	}
	
	
	public static int multiply(int x1,int y1) {
		System.out.println("multiply ȣ��");
		return x1*y1;
	}
	
	public static int divide(int x1,int y1) {
		System.out.println("divide ȣ��");
		return x1/y1;
	}
	public static void main(String[] args) {
		
		int num1 = 6;
		int num2 = 2;
		
		// ���� ���� ���� call by value
		int reslut =add(num1 ,num2, 10);
		
		System.out.println(reslut);
		
		reslut = minus(num1,num2);
		System.out.println(reslut);
		
		reslut = multiply(num1,num2);
		System.out.println(reslut);
		
		reslut = divide(num1,num2);
		System.out.println(reslut);
		
		
	}

}
