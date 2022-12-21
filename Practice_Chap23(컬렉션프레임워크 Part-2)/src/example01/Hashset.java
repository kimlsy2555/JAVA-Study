package example01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
	
		Set <String> set = new HashSet<String>();
		
		System.out.println("������ : "+ set.size());
		
		// Set �迭�� �ߺ� ������ �ȵȴ�. �ƿ﷯ ���� ������ ������ �ʴ´�.
		// 
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("iBATIS");
		System.out.println("======================");
		// Set �迭���� null ���� ���尡�������� ,���� �Ѱ��� �����ϴ�.
		// set.add(null);
		
		System.out.println("������ : "+ set.size());
		
		// �ݺ��ڸ� set�� ���ؼ� ��´�
		Iterator<String> iterator = set.iterator();
		// �����ò� �ֳ�? ���� true, ������false����
		while(iterator.hasNext()) {
			String elemnet = iterator.next();// ��ü�� ����������
			System.out.println(elemnet);
			// �ݺ��ڸ� ���ؼ� �������� Set ���� ��ü���� ���� ���� �ʴ´�.
			System.out.println("������ : "+ set.size());
			
		}
		System.out.println("======================");
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("������ : "+ set.size());
		System.out.println("======================");
	
	
		for(String str : set ) {
			System.out.println(str);
		}
		System.out.println("======================");
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("��ü ����");
		}
		else {
			System.out.println("��ü ����");
		}
		
		
		
		
		
	}

}
