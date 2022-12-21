package example04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListEx_Access {
	// ��� ���� ���� ���캻 �������� ���� 
	// ���� ���������� �߰� ���� ������ ArrayList �� ������ ���
	// �ݸ� �߰��� ����, ������ LinkedList�� Ȯ���ϰ� �����ٴ� ���� �˼��ִ� (�ѻ纮)
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		LinkedList<String> linkedList = new LinkedList<String>();

		add(arrayList);
		add(linkedList);
		
		System.out.println("= ���� �ð� �׽�Ʈ =");
		System.out.println("ArrayList : "+access(arrayList));
		System.out.println("ArrayList : "+access(linkedList));
		
		
		
		
		
		
	}
	public static void add(List <String> list ) {
		for(int i=0;i<100000;i++) {
			list.add(i+"");
		}
	}
	public static long access(List<String> list) {
		long start = System.currentTimeMillis();
		
		for(int i =0;i<10000;i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		return end- start;
		
	}
	

}
