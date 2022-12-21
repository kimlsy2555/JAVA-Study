package example02;

import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		
		// �ڵ� �ڽ�
		Integer obj1 = 100;
		Integer obj2 = 300;
	
		List list = new Vector();
		
		list.add(obj1);
		list.add(obj2);
		list.add(500); // list.add(new Integer(500))
		
		System.out.println(list);
		
		int valuew1 = (Integer)list.get(0);
		
		int valuew2 = obj2.intValue(); // �����ڽ�
		int valuew3 = obj2; // �ڵ���ڽ� ���
		
		System.out.println(valuew1);
		System.out.println(valuew2);
		System.out.println(valuew3);
		
		// ��ü + �⺻Ÿ���� ������������ ����Ŭ�����̱� ������
		// �����Ϸ��� �˾Ƽ� �ڵ� ��ڽ��� �Ʒ��� ���� �ڵ尡 �����ϴ�.
		
		int result = obj1 + 500;
		System.out.println(result);
		
		
		
		
		
	}

}
