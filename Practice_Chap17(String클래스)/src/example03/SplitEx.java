package example03;

public class SplitEx {

	public static void main(String[] args) {
	
		String str1 = "�����,�ʸ�,����ġŲ/���ġŲ&����ġŲ";
		
		
		// ���� ǥ���� : /,& 
		// split(����ǥ����) : �Ű������� ���� ǥ�����̿´�. ����Ÿ���� ����ǥ��������
		// ���еǾ��� String[]�� �����Ѵ�.
		
		// or | �����ڷ� ��������
		String[] strArr = str1.split(",|&|/");
		
		for(String str : strArr) {
			System.out.println(str);
		}
		

	}

}
