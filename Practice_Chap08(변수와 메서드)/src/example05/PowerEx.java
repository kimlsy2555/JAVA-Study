package example05;

import java.util.Scanner;

public class PowerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int n= 0;
		long result = 0L;
		System.out.println("���� ������ ����  ����Ѵ�");
		System.out.println("Ex) 2�� 3�� : 2�� 1�� + 2��2�ǽ� +2�� 3���� 14 �Դϴ�");
		
		System.out.print("���� �ϰ� ���� �� :");
		x= sc.nextInt();
		System.out.print("����� ���ұ�� :");
		n= sc.nextInt();
		
		
		for(int i= 1;i<=n ; i++)	{
		result += power(x,i);	
		}
		System.out.printf("%d �� %d ���� ������ ���� %d �Դϴ�",x,n,result); 
		
		
		
		
		sc.close();
	}
	
	public static long power (int x,int n) {

		if(n==1){
			return x;
		}
		else {
			return x*power(x,n-1);
		}
	
	}

}
