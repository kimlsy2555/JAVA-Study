package example01;

public class ArrayEx02 {

	public static void main(String[] args) {
		// ���� ���ϱ� ��� ���ϱ�
		
		
		int sum= 0 ;
		double avg = 0.0;
		
		int[] score = new int[] {100,90,80,50,70};
		
		System.out.println("�迭�� ũ�� :"+score.length);
		
		for (int i = 0;i<score.length;i++)
		{
			sum+=score[i];
			System.out.println( (i+1) +"�� �л� ���� : "+score[i]);
		}
		avg= sum/score.length;
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}

}
