package example02;

import java.util.Iterator;
import java.util.Vector;

public class VectiorEx {

	public static void main(String[] args) {
		
		Vector<Board> vector = new Vector<Board>(5);
		//�뷮�� 5�� ���͸� �����Ѵ�. �������� �Ű����� ���ָ� 
		// �⺻������ 10���� �뷮�� ���� Vector�� �����ȴ�.
		
		System.out.println("�뷮 : "+vector.capacity());
		System.out.println("ũ�� : "+vector.size());
		System.out.println("=============================");
		//��ü�߰�
		vector.add(new Board("����1","����1","�۾���1"));
		vector.add(new Board("����2","����2","�۾���2"));
		vector.add(new Board("����3","����3","�۾���3"));
		vector.add(new Board("����4","����4","�۾���4"));
		vector.add(new Board("����5","����5","�۾���5"));

		
		System.out.println("�뷮 : "+vector.capacity());
		System.out.println("ũ�� : "+vector.size());

		// ��ü ����
		vector.remove(2);
		vector.remove(3);
		
		System.out.println("=============================");
		System.out.println("�뷮 : "+vector.capacity());
		System.out.println("ũ�� : "+vector.size());
		
		// �뷮 Ȯ��
		vector.ensureCapacity(20);
		System.out.println("=============================");
		System.out.println("dd�뷮 : "+vector.capacity());
		System.out.println("ũ�� : "+vector.size());
		
		
		// null �� ���� �Ͽ� size�� ����
		vector.setSize(7); //�迭����
		System.out.println("=============================");
		System.out.println("�뷮 : "+vector.capacity());
		System.out.println("ũ�� : "+vector.size());
		
		// size�� ������ ���� null���� ������ ���ش�.
		vector.trimToSize(); //�迭����
		System.out.println("=============================");
		System.out.println("�뷮 : "+vector.capacity());
		System.out.println("ũ�� : "+vector.size());
		
		vector.setSize(3);  //�迭����
		System.out.println("=============================");
		System.out.println("�뷮 : "+vector.capacity());
		System.out.println("ũ�� : "+vector.size());
		// ���� for���� ����ص���
		for(Board board : vector) {
			System.out.println(board.subject+board.content+board.writer);
		}
		System.out.println("=============================");
		// �ݺ��ڷ� ����ϱ�
		Iterator<Board> iterator = vector.iterator();
		
		while(iterator.hasNext()) {// ������ �����Ͱ� ������ true ������false
			Board board = 	iterator.next();// ������ �����Ͷ�
			System.out.println(board.subject+board.content+board.writer);
			
		}
		
		
	}

}
