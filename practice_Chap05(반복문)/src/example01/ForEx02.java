package example01;

public class ForEx02 {

	public static void main(String[] args) {
	
		int sum = 0;
		int temp = 0;
		// ����� : debug â���� �ǵ�ġ �ʰ� �Ѿ�ٸ� ,
		// ���α׷��� ���� �߻�
		// ������ ��� ������ ������ ������̶�� �Ѵ�
		// breakPoint �ߴ��� ������ ���� ��Ű�� �ߴ��� �տ��� �����
		// f8 �����鼭 �Ѵܰ�� ������ѳ����鼭 ���� ���쳪���� ������ ���� ������ �ִ�.
		//
		
		//  �����հ谡 2000 �̻� i�� ���� ���
		for (int i=1;i<=100;i++){
			sum+=i;
			
			if(sum>=2000){	
				
				temp= i;
				break;		
			}
		}
		
		System.out.println(temp);
		System.out.println(sum);
	}
		
}
