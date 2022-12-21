package example01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>(); // �⺻������ 10���� �������
		
		
		
		System.out.println("�� ũ�� : "+list.size()); // ����� ��ü�� �ϳ��� ���� ������ 0�� ������
		// ��ü �߰��ϱ�
		
		list.add("111"); // boolean add(Object o)-> ������ �߰�
		list.add("222");
		list.add("333");
		list.add("222");
		
		
		
		list.add(333);
		
		System.out.println("�� ũ�� : "+list.size()); 
		System.out.println("ArrayList�� �ּ� : "+list.hashCode());
		System.out.println("ArrayList�� �ִ� �� : "+list.toString());
		
		// 0 ��° �ε�����  "333"�߰�
		list.add(0,"333");
		
		System.out.println("ArrayList�� �ִ� �� : "+list.toString());
		
		// �տ��� ���� �˻��Ͽ�  ����� "333"�� �����Ѵ�.(����� �� �� ���� ����)
		//��ü �����ϱ�
		list.remove("333");
		System.out.println("ArrayList�� �ִ� �� : "+list.toString());
		System.out.println(list.remove("333"));
		System.out.println("ArrayList�� �ִ� �� : "+list.toString());
		
		// ����� ��ü�� �ε����� ã�ƿ��� (������ -1 ����)
		System.out.println("index = "+ +list.indexOf("333"));
		System.out.println("index = "+ +list.indexOf(333));
		
		// ��ü ���� ���� �ϱ�
		//list.clear();
		
		//�Ʒ��� ���� �����ϸ� ��ü�� ���´�.
		// �ε��� 0�� ������ �� i�� 0�̴ϱ� �翬�� 0�ε����� �ִ� ��ü�� ���� ������
		// ���� i���� �����Ǹ鼭 ����� ������ ���� �ʴ� ���̴�.
		// ���� ��ü�� �����ǰ� �ް�ü�� �������鼭
		// ������ i���� ������ ��ü�� ã�����Ͽ��� ������ ��ü������ �̷�������ʴ´�
		// �Ͽ� ������ ��ų���� �׻� �ؿ��� ���� ������ ���ִ°��̴�.
//		for(int i=0; i<list.size();i++) {
//			list.remove(i);
//	
//		}
		
		
		// size ���� 4�ε� �ε��� 0~3���� �ֱ� �����̴�.
//		for(int i=list.size();i>=0;i--) {
//			list.remove(i);
//		}

		
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		System.out.println("ArrayList�� �ִ� �� : "+list.toString());
		
	}

}
