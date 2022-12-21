package example03;

import java.util.Properties;
import java.util.Set;

public class SystemEx03 {

	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		System.out.println("���� � ü�� : "+osName);
		
		String userName =	System.getProperty("user.name");
		System.out.println("����� �̸� : "+userName);
		
		//Properties Map�迭�� �÷����̴�. �׷��� String, String ���´�
		// key�� String ,value�� String �̴�
		
		Properties properties =  System.getProperties();
		
		// Map �÷��ǿ��� Ű ���� Set �迭�� �������� �޼��� keySet()
		Set set =	properties.keySet();
		
		System.out.println("Key                            value");
		System.out.println("---------------------------------------");
		
		for(Object objkey : set) {
			String key = (String)objkey;
			String value = System.getProperty(key);
			System.out.println(key + "                            "+ value);
		}
	
	}

}
