package example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx02 {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("C:/test.txt");
		char[] str = "������".toCharArray();
		
		// writer() �� �ް����� Ÿ���� ���� �迭�̴�
		// write(int b) ���� �ξ� ȿ�����̴�
		writer.write(str);
		
		
		writer.flush();
		System.out.println("���� ���� �Ϸ�");
		writer.close();
	
	}

}
