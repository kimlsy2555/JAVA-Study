package example01;

public class ForEx01 {

	public static void main(String[] args) {
		//1~100 ���� ���� ���ϴ� �ݺ���
		// �̱۷����ϋ�
		// int i =1 -> �ʱ�ȭ �ڵ� (�ּ� 1���� ����)
		// i<=100 -> ���ǽ�(���϶��� , ����� ����)
		// i++ -> ������
		int sum = 0;
		for (int i=1;i<=100;i++){
			
			sum+=i;
			
		}
		System.out.println(sum);
		

	}

}
