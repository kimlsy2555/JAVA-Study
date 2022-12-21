package example06;

public class Compare {
	
	// �Ű����� TŸ���� Number(�߻�Ŭ����)Ÿ���̰ų� Number  Ŭ������ ��ӹ޴�
	// �ڼ� Ŭ������ TŸ������ ���ü� �ִ�.(���� Ÿ���� ����)
	
	public static <T extends Number> int compare(T t1, T t2) {
		
		// NumberŬ������ doubleValue()�� ���� �߻� �޼�������,
		// �ڼ�Ŭ����(Integer,Double ��)�� �ü��� �ִµ� �׷��� �ڼ�Ŭ������
		// �߻�޼��� ������ ���� �������̵��� �߱⿡ ������ ���� �ʴ´�.
		double value1 = t1.doubleValue();
		double value2 = t2.doubleValue();
		
		return  Double.compare(value1, value2);
	}
}
