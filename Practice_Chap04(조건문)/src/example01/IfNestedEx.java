package example01;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���� �ӷ� : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			if (score >= 95) {
				System.out.println("����� A+ ���");
			}
			else {
				System.out.println("A0");
			}
		}
		else if (score >= 80) {
			if(score >=85)
			System.out.println("����� B+ ���");
			else {
				System.out.println("B0");
			}
		}
		
		
		sc.close();
	}

}
