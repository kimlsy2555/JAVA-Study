package example02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx03 {

	public static void main(String[] args) throws Exception{

		
		OutputStream oStream = new FileOutputStream("C:/write.txt");
		byte[] data ="ABC�̼����屺��".getBytes();
		
		System.out.println("data ����Ʈ ũ�� : "+data.length);
		
		oStream.write(data, 3, 12); // �����ε����� 3�� 12���� ���̸�ŭ ���Ϸ� ������
		
		oStream.flush();
		
		System.out.println("���� �����");
		
		
		oStream.close();
	}

}
