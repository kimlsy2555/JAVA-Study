package example04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy_ReaderWriter {

	public static void main(String[] args) throws Exception{
		
		Reader reader = new FileReader("C:/write.txt");
		
		Writer writer = new FileWriter("C:/write_���纻.txt");
		
		
		String str = "";
		int readBytes;
		char[] cArr = new char[1000];

		while((readBytes = reader.read(cArr))!=-1) {
		
			String str1 = new String(cArr);
			str += str1;
		
		}
		writer.write(str);
		
		writer.flush();
		
		System.out.println("���� ���� �Ϸ� ");
		
		writer.close();
		reader.close();
	}

}
