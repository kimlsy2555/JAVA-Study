package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSaechEx {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		TreeSet<String> treeSet2 = new TreeSet<String>();
		// ���ĺ��� �����ڵ忡 ���� ����Ʈ���� ���� �������� ������ �ȴ�.
		treeSet.add("apple");
		treeSet.add("f");
		treeSet.add("fo     rever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println(treeSet);
		treeSet2.add("����");
		treeSet2.add("����");
		treeSet2.add("�ٽô�");
		treeSet2.add("��");
		treeSet2.add("���");
		treeSet2.add("��");
		treeSet2.add("��");
		treeSet2.add("��");
		
		// ���⼭ �򰥸� ���� �ִµ� c~f ���̶�°��� c ���� �ؼ� ����
		// f �κ��� f �ѱ��ڸ� �˻��� �������� , f���� 2�� �̻��� �˻��� ���� �ʴ´�.
		// ��� ����� �� ���ִ�.
		// �� ,f ���ڴ� ��������� f���� 2�� �̻��� �����Ѵ�.
		
		System.out.println("[c ~ f] ������ �ܾ� �˻�");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		System.out.println(rangeSet);
		
		System.out.println("======================================");
		System.out.println(treeSet2);
		System.out.println("[�� ~ ��] ������ �ܾ� �˻�");
		NavigableSet<String> rangeSet1 = treeSet2.subSet("��", true, "��", true);
		System.out.println(rangeSet1);
		
		
	}

}
