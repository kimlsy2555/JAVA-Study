package example04;

public class PersonEx {

	public static void main(String[] args) {
		
	Person<Integer> p1 = Util.<Integer>changing(new Integer(100));
		

		int value = p1.getT();
		System.out.println("Person ��ü�� ������ �ִ� �� : "+value);
		
		Person<String> p2 = Util.changing("ȫ�浿");
		
		String str = p2.getT();
		System.out.println("Person ��ü�� ������ �ִ� �� : "+str);
	}

}
