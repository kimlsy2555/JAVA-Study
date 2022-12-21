package tokenExample;

import java.util.StringTokenizer;

public class SplitStringTokenizerEx {

	public static void main(String[] args) {
		
		String data = "baby cat     dog a b c d e f g h i ";
		// split()�� �����ڸ� �������� �ָ� �����Ͱ� ������ �ټ� �����ϰ� �ִٸ�
		// ���鵵 �ϳ��� ��ū �ܾ�� �ν��Ѵ�
		long start = System.nanoTime();
		String[] result = data.split(" ");
		for(String str : result) {
			System.out.println(str); 
		}
		long end = System.nanoTime();
		System.out.println("�ɸ��ð� : "+(end-start)+"ns"); 
	//	System.out.println("��ū ���� : "+result.length);
		System.out.println();
		
		// StringTokenizer()�� �����ڸ� �������� �ָ� �����Ͱ� ������ �ټ� �����ϰ� �ִٸ�
		// ������ ��ū���� �ν����� �ʴ´�.
		long start1 = System.nanoTime();
		StringTokenizer stringTokenizer = new StringTokenizer(data," ");
		
		while (stringTokenizer.hasMoreElements()) {
		//	System.out.println("���� ��ū "+stringTokenizer.countTokens());
			String str =  stringTokenizer.nextToken();
			System.out.println(str);
			
		}
		long end1 = System.nanoTime();
		System.out.println("�ɸ��ð� : "+(end1-start1)+"ns"); 
	}

}
