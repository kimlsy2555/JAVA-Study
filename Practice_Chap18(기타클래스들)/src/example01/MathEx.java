package example01;

public class MathEx {

	public static void main(String[] args) {
	
		
		// ���밪
		int v1 =Math.abs(-5);
		double v2 = Math.abs(-7.88);
		System.out.println(v1);
		System.out.println(v2);
		
		// �ø���
		double v3= Math.ceil(5.1);
		System.out.println(v3);
		
		// ������
		double v4 = Math.floor(5.9);
		System.out.println(v4);
		
		// ���� �ִ밪
		int v5 = Math.max(10, 5);
		System.out.println(v5);
		
		// ���� �ּ� �� 
		int v6 = Math.min(10,5);
		System.out.println(v6);
		
		// ����
		double v7 = Math.random();
	
		System.out.println(v7);
		
		// ����� ������ �Ǽ���()
		double v8 = Math.rint(5.4);
		System.out.println(v8); 
		
		// �ݿø� (�Ҽ��� ù��¥�� �ݿø�)
		long v9 = Math.round(5.39);
		System.out.println(v9);
		
		//�Ҽ� ��°�ڸ� �ݿø� -> �޽�Ŭ���� ������ ���� ó�����ִ� �κ��̾�� ���ŷӴ�
		double value = 12.3456;
		double temp1 = value*100;
		
		System.out.println(temp1);
		long temp2 = Math.round(temp1);
		
		double v10 = temp2/100.0;
		
		System.out.println(v10);
	}

}
