package example01;

import java.util.Scanner;

public class IfElseIfElseEx {

	public static void main(String[] args) {
		//Resource �̱⋚���� �ݾ�����Ѵ�. 	sc.close();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���� �ӷ� : ");
		int score = sc.nextInt();
		
		sc.close();
		
		
		
		//score ������ ���� ���� �Ʒ��� ���ǹ����� �бⰡ �Ͼ�� �ִ� ����
		// �� ������ �ٽ� 
		if(score >=90){
			System.out.println("90~100");
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("80~89");
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("70~79");
			System.out.println("C");
		}
		else {
			System.out.println("70�̸�");
			System.out.println("D");
			
		}

	}

}
