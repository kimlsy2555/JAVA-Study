package example02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class File_CoptEx {
	
	public static void main(String[] args) throws Exception{
		
		InputStream inputStream = new FileInputStream("C:/write.txt");
		OutputStream outputStream = new FileOutputStream("C:/write_���纻.txt");
		
		byte[] data = new byte[1000];
		int count = 0;
		
		while((count = inputStream.read(data))!=-1) {
			
			outputStream.write(data);
			System.out.println("���� ����Ʈ�� : "+count);
		}
		
		System.out.println("������ ���� �Ϸ�");
		outputStream.flush();
		
		inputStream.close();
		outputStream.close();

	}

}

