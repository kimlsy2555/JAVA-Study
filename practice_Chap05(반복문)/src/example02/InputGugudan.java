package example02;

import java.util.Scanner;

public class InputGugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���");
		System.out.print("����� �� : ");
		 int start = sc.nextInt();
		 System.out.print("�� �� : ");
		 int end = sc.nextInt();
		
		
		 for(;start<=end;start++) {
			 System.out.println("****"+start+"��****");
			 for(int j=1;j<10;j++) {
				 
				 System.out.println(start+"*"+j+" = "+start*j);
			 }
		 }
		
		
		
		
		sc.close();

	}

}
