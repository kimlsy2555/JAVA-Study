package example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx03 {

	public static void main(String[] args) throws Exception {

		
		Writer writer = new FileWriter("C:/test.txt");
		
		// ���ڿ� -> ���� �迭�� ����
		char[] str= "�������̴�".toCharArray();
		
		writer.write(str,1,4);
		
		writer.flush();
		System.out.println("���� �����Ϸ�");
		writer.close();
	}

}
