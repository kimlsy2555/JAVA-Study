package example04;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

public class WriterEx01 {

	public static void main(String[] args) throws Exception{
		
		
		Writer writer = new FileWriter("C:/test.txt");
		
		// toCharArray()�� ���ڿ��� char[]�� �������ش�.
		char[] str = "ȫ�浿".toCharArray();
	
		
		for(int i =0;i<str.length;i++) {
			//�� ���ھ� ����������
			writer.write(str[i]);
			System.out.println("���μ� : "+i);
		}
		System.out.println("���� ��� �Ϸ�");
		
		// ������ ���۸� ����ش�
		writer.flush();
		
		writer.close();
	}

}
