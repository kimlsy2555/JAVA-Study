package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���ڸ� �з� : ");
		int num1 = sc. nextInt();
		System.out.println("�Է¹����� " + num1);
	
	
		System.out.print("�Ǽ� ���ڸ� �з� : ");
		double num2 = sc. nextDouble();
		System.out.println("�Է¹����� " + num2);
		
		System.out.print("�Է�");
		
		int result = 100;
		
		String num = sc.nextLine();
		
		int temp = Integer.parseInt(num);
		
		int total = result+temp;
	
		System.out.println("��� " + total);
	}

}
