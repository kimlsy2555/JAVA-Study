package example01;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListEx02 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1= new ArrayList<Integer>();
		
		list1.add(5); // �ڵ� �ڽ�
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		// subList() �� ������ �ε����� �������� �ʰ� ListŸ������ �����Ѵ�.
		ArrayList list2= new ArrayList(list1.subList(1,4));
		
	print(list1, list2);
	// �����ϱ�
	System.out.println("���� ��");
	
	Collections.sort(list1);
	Collections.sort(list2);
	
	print(list1, list2);
	// ���԰���
		System.out.print("list1�÷��ǿ�list2�÷����� ��� ��Ұ� ����ִ°�?-->" );
		System.out.println(list1.containsAll(list2));
	
		System.out.println();
		// �����ϱ�
		list2.add("B"); // �迭 ���簡 ���Ͼ 
		list2.add("C"); // �迭 ���簡 ���Ͼ 
		print(list1, list2);
		list2.add(3,"A"); // �迭 ���簡 �Ͼ 
		print(list1, list2);
		
		// ��ü�ϱ�
		list2.set(3,"AA");
		print(list1, list2);
		
		// list2���� list1�� ���Ե� ��ü���� �����ϱ�
		System.out.println("���Ե� ��ü �����ϱ�");
		for(int i = list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
			print(list1, list2);
		}

		
	}
	
	
	public static void print(ArrayList<Integer> list1, ArrayList list2) {
		System.out.println("list1 : "+ list1.toString());
		System.out.println("list2 : "+ list2.toString());
		System.out.println();
		
	}
	
	
}
