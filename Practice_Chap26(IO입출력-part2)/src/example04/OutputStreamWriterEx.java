package example04;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterEx {

	public static void main(String[] args) throws Exception{
		// �� ��Ʈ�� ����
		FileOutputStream fStream = new FileOutputStream("C:/write.txt");
		
		// ������Ʈ�� ������
		Writer writer = new OutputStreamWriter(fStream);
		
		// ������ ������ 
		String data = "���ڵ����͸� ������½�Ʈ������ ������ ����Ʈ ������� ��ȯ�Ǿ� �����";
		
		
		// ���� ��Ʈ��  �� ,���ڱ�ݽ�Ʈ���� OutputStreamWriter�� data��
		// ������ ����Ʈ ������� ��ȯ �����ִ� ��Ȱ�� ��
		writer.write(data); 
		
		writer.flush();
		writer.close();
		
		System.out.println("������ ����Ǿ����ϴ�.");
		
	}

}
