package example07;

import java.util.Vector;

public class BoardEx {

	public static void main(String[] args) {
		
		Vector vector = new Vector();
		
		
		vector.add(new Board("����1","����1","�ۼ���1"));
		vector.add(new Board("����2","����1","�ۼ���1"));
		vector.add(new Board("����3","����1","�ۼ���1"));
		vector.add(new Board("����4","����1","�ۼ���1"));
		vector.add(new Board("����5","����1","�ۼ���1"));
		vector.add(new Board("����6","����1","�ۼ���1"));
		vector.add(new Board("����7","����1","�ۼ���1"));
		vector.add(new Board("����8","����1","�ۼ���1"));
		vector.add(new Board("����9","����1","�ۼ���1"));
		vector.add(new Board("����10","����1","�ۼ���1"));
		vector.add(new Board("����11","����1","�ۼ���1"));
		vector.add(new Board("����12","����1","�ۼ���1"));
		vector.add(new Board("����13","����1","�ۼ���1"));
		
		
		System.out.println("�뷮 : " + vector.capacity()); // ������ �� �ִ� ����
		System.out.println("����� ��ü �� : " + vector.size()); // ����� ��ü��
		System.out.println();
		
		vector.remove(2);
		vector.remove(5);
		vector.remove(8);
		
		System.out.println("�뷮 : " + vector.capacity()); // ������ �� �ִ� ����
		System.out.println("����� ��ü �� : " + vector.size()); // ����� ��ü��
		System.out.println();
		
		for(int i = 0; i<vector.size(); i++ ) {
			if(vector.get(i) instanceof Board) {
				Board board = (Board)vector.get(i);
				board.show();
				System.out.println();
			}
			
			
			
			
			
		}
		
	}

}
