package sec02.example08;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateIsEqualsEx {

	public static void main(String[] args) {
		
		Predicate<String> predicate = null;
		
		boolean result = false;
		
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// ������
		System.out.println(Objects.equals(obj1, obj2));
		
		// Predicate.isEqual(null) �� ���� �޼���ν� ,�ΰ��� ��ü�� ���� ���� ���Ѵ�.
		// �Ѵ�, null �̸� true �� �����°� �� �����ϴ�.
		
		predicate = Predicate.isEqual(null);
		result = predicate.test(null);
		System.out.println("�� ��ü�� �� (null) : "+result);
		
		predicate = Predicate.isEqual(null);
		result =predicate.test("������");
		System.out.println("�� ��ü�� �� (������ null) : "+result);
		
		
		// �Ʒ��� �ڵ� �ΰ��� ��ü�� ���񱳰� �̷������.
		// Objects.equals("������", "������")
		
		predicate = Predicate.isEqual("������");
		result =predicate.test("������");
		System.out.println("�� ��ü�� �� (������ ������) : "+result);
		
		// ���� �ڵ���� ���� �����͸� ���߿� �����ϰ� �����ϰ� null���� �ɷ�����
		// �Լ��� �������̽��� �����ϰ� ����ϸ� �������� �ڵ��� ���Ἲ�� ��������.
		
		
		
	}

}
