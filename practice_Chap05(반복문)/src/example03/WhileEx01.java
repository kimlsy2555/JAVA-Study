package example03;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int sum=0;
		int i= 0;
		//while ���� �ʱ�ȭ�ϴ� �κ��� ���� ���������ʴ´�.
		
		// while �� ������ ���ǽĸ� ���� ������  for���� ���ؼ�
		// �Ϲ��� ���ο����� �������� ��������.
		
		// c��� ������ ���� boolean Ÿ���� ���� .�Ͽ� 0 ����
		// 0�� ������ ��� ������ ������ �ν��Ѵ�.
		while(true) {
			sum+=i;
			if (i>=100)
			{
				break;
			}
			i++;	
		}
		System.out.println("1~100 sum = "+ sum);

		
		
		
	}

}
