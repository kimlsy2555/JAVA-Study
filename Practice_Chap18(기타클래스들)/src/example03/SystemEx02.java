package example03;

public class SystemEx02 {

	public static void main(String[] args) {
	
		// ���α׷� ������ �׽�Ʈ �� �� ����� �� ������ �޼���
		
		long sum = 0;
		long start = System.currentTimeMillis();//10�� 3�º��� 1��
		//long start = System.nanoTime();//10�� 9�º��� 1��
		for(long i=1; i<1000000000;i++) {
			sum+=i;
		}
		long end = System.currentTimeMillis();
		//long end = System.nanoTime();
		System.out.println(sum);
		System.out.println("�ҿ�� �ð� (�и���): " + (end- start) + "ms");
		System.out.println("�ҿ�� �ð� (��): " + ((end- start)/1000.0) + "ms");
	}

}
