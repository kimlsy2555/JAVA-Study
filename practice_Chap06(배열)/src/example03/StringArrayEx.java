package example03;

import java.util.Arrays;

public class StringArrayEx {

	public static void main(String[] args) {
		
		
		//��ü (Ŭ����) �迭 �Ѥ� 2���� �迭
		String[] str = new String[] {
				"�ȳ�","ȫ�浿","�迬��"
									};

		for(int i = 0 ; i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		str[0] = "����";
		System.out.println(Arrays.toString(str));
	
		//Object Ŭ������ ��� Ŭ������ �ְ� ����
		//String Ŭ������ Object Ŭ������ toString()�������̵�(������)
		System.out.println(str[0]);
		
		
		//���� for��
		for(String str1 :str ) {System.out.println(str1);}
	}

}
