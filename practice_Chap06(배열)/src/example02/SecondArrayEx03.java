package example02;

import java.util.Scanner;

public class SecondArrayEx03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[][] student;
		
		int count = 0,num = 0,sum = 0,total = 0;
		//�ݼ� �ο� �հ� ��
		
		double avg = 0.0;
		double avgTotal = 0.0;
		
		System.out.print("�ݼ� �Է� : " );
		count = sc.nextInt();
		student = new int [count][]; // ���� ������ 1�����迭�� �Ҵ�
//		System.out.println("2���� �迭 �ּ� "+ student);
//		System.out.println("1���� �迭 ũ�� "+ student.length);
		for(int i  = 0 ; i<student.length;i++) {
			
			System.out.printf("%d���� �ο� : ",i+1);
			num = sc.nextInt();
			student[i] = new int[num];
			
			for(int j=0;j<student[i].length;j++) {
				
			System.out.printf("%d ���� %d���� ���� : ",(i+1),(j+1));
				student[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		
//		for(int i =0; i<student.length;i++) {
//			
//			for(int j=0;j<student[i].length;j++) {
//				System.out.println(student[i][j]);
//			}
//		}
		
		
		
		
		System.out.println("�� \t�հ�\t���\t");
		System.out.println("------------------------------------");
		
		for(int i = 0 ; i<student.length;i++)
		{ sum = 0;
			for(int j= 0; j <student[i].length;j++) {
				
				sum += student[i][j];
			}
			
			total +=sum;
			
			avg = (double)sum/student[i].length;
			avgTotal +=avg;
			System.out.printf("%d��\t%d\t%.1f\n",i+1,sum,avg);
		}
		avgTotal /=student.length;
		System.out.printf("��\t%d\t%.1f",total,avgTotal);
		
		
		
		sc.close();
		
		

	}

}
