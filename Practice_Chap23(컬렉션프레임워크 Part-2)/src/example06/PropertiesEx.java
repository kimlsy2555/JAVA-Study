package example06;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws Exception {
		
		// Properties ��ü�� key�� value ���� String�� ������ Map �÷���
		
		Properties properties = new Properties();
		//PropertiesEx�� ������ ����  properties ������ �����ϹǷ� �Ʒ��� ���� �н��� �˾ƿ��� ���̴�.
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		
		// ���� ��� ���
		//System.out.println(path);
		// �ѱ۷� ���� ��ΰ� ��� �ǵ��� ���ڵ��ϱ�
		path = URLDecoder.decode(path,"UTF-8"); // �ѱ��� 3����Ʈ
		//path = URLDecoder.decode(path,"EC-KR"); // �ѱ��� 2����Ʈ �׷��� ����
		System.out.println(path);
		System.out.println("============================");
		// database.properties �� �о�帰��.
		properties.load(new FileReader(path));
		
		// key�� �ְ� value �� �о��
		String driver = properties.getProperty("driver");
		System.out.println("driver : "+driver);
		
		String url = properties.getProperty("url");
		System.out.println("url : "+url);
		
		String username = properties.getProperty("username");
		System.out.println("username : "+username);
		
		String password = properties.getProperty("password");
		System.out.println("password : "+password);
		
		
	}

}
