package example01;

public class PersonEx {

	public static void main(String[] args) {
		
		Person person = new  Person();
		
		// ��ĳ����(String -> Objet)
		person.setObject("ȫ�浿"); 
		
		// �ٿ� ĳ����(Object -> String)
		String  str = (String)person.getObject(); 
	
		System.out.println(str);
		
		
	
	}

}
