package example03;

import java.util.Scanner;

public class TreeOperEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		
		String grade = (score >=90) ? "A":"B";
		System.out.println("��� : "+grade);
		
		
		grade = (score >=90) ? "A":((score >= 80)? "B":"C");
		System.out.println("��� : "+grade);
		sc.close();
		

	}

}
