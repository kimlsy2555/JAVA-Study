package example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx04 {

	public static void main(String[] args) throws Exception{

		Writer writer = new FileWriter("C:/test.txt");
		
		String str = "�ȳ��ϼ���.���� �ڹٸ� ����ġ�� �־��.";
		
		// �Ű������� String Ÿ���̴� .�Ͽ� String�� ���Ͽ� �״�� �����ϰ� �ȴ�
		//writer.write(str);
		
		writer.write(str,2,10); // ���ڿ� 2��° �ε��� ���� 10 ���� ���ڸ� ���Ϸ� ����
		writer.flush();
		System.out.println("���� ���� �Ϸ�");
		writer.close();
	}

}
