package example04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListEx {

	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		System.out.println("=== ���������� ������ �߰� �ϱ� ===");
		System.out.println("ArrayList : "+add1(arrayList));
		System.out.println("LinkedList : "+add1(linkedList));
		System.out.println();
		
		System.out.println("=== ����������� ������ �߰� �ϱ� ===");
		System.out.println("ArrayList(�迭����) : "+add2(arrayList));
		System.out.println("LinkedList(��尪 ����) : "+add2(linkedList));
		System.out.println();
		
		System.out.println("=== ����������� ������ ���� �ϱ� ===");
		System.out.println("ArrayList(�迭����) : "+remove2(arrayList));
		System.out.println("LinkedList(��尪 ����) : "+remove2(linkedList));
		System.out.println();
		
		System.out.println("=== ���������� ������ ���� �ϱ� ===");
		System.out.println("ArrayList : "+remove1(arrayList));
		System.out.println("LinkedList : "+remove1(linkedList));
		
		
		
	}
	// ������ ������ �߰�
	public static long add1(List<String> list) {
		long start= System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return  end - start;
	}
	// ������� ������ �߰�
	public static long add2(List<String>list ) {
		long start= System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			list.add(500,"X");
		}
		long end = System.currentTimeMillis();
		return  end - start;
	}
	// ������ ������ ����
	public static long remove1(List<String> list) {
		long start= System.currentTimeMillis();
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return  end - start;
	}

	// ������� ������ ����
		public static long remove2(List<String> list) {
			long start= System.currentTimeMillis();
			for(int i=0;i<50000;i++) {
				list.remove(i);
			}
			long end = System.currentTimeMillis();
			return  end - start;
		}
}
