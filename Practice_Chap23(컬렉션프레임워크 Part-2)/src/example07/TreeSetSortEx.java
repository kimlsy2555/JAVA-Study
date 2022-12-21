package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSortEx {

	public static void main(String[] args) {
	
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(100);
		scores.add(-50);
		
		// �⺻�� ���� �������� ����
		System.out.println(scores); 
		System.out.println("��ü �� : "+scores.size());
		System.out.println();
		
		System.out.println("���� ���� ���");
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		System.out.println(descendingSet);
		System.out.println("��ü �� : "+descendingSet.size());
		System.out.println();
		
		System.out.println("�ٽ� �ø� ���� ���");
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		System.out.println(ascendingSet);
		System.out.println("��ü �� : "+descendingSet.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
