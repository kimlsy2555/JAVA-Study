package example04;

public class Util {
// <T>�� ���׸� Ÿ�� �޼��带 Ī�ϴ� ���̸�, ����Ÿ�԰� �Ű����� Ÿ����
// �����ϰ� <T>Ÿ������ �������� �Ѵ�.
// �ܺηκ��� TŸ���� �޾Ƽ� Person<T> ��� ���׸� Ŭ������ �ν��Ͻ��� 
// �����Ͽ� ������ ���ִ� ������ �Ѵ�.
	public static<T> Person<T> changing(T t){
		
		Person<T> person = new Person<T>();
		
		person.setT(t);
		
		return person;
		
	}
}
