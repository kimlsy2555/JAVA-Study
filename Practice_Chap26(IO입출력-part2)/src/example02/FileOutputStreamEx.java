package example02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args)throws Exception {

		// ���� ���縦 �ϱ����� ��θ� ����
		String oriFileName = "C:\\JAVA �۾�\\Practice_Chap26(IO�����-part2)\\src\\example02\\���ι̽�����.jpeg";
		
		String tarFileName = "C:/Test/���ι̽�����-���Ͽ�.jpg";
		
		File file = new File(oriFileName);
		//���Ϸκ��� �����͸� ���� 
		FileInputStream  fis = new FileInputStream(file); 
		// ������ ���� ���
		FileOutputStream fos = new FileOutputStream(tarFileName);
		
		int readByteCount;
		
		int i = 0;
		
		// ����Ʈ �迭�� ũ�� �������� ����ð��� ���� ���ٴ� ����� �˼� �ִ�.
		byte[] bArr = new byte[100];
		
		// ���� ���� ����
		long stratTime = System.currentTimeMillis(); 
		
		while((readByteCount = fis.read(bArr))!= -1) {
			
			// ���� ����Ʈ ����ŭ ��� ��Ʈ������ ������ ���̴�.
			fos.write(bArr, 0, readByteCount);
			i++;
		}
		fos.flush();
		// ���� ���� ����
		long endTime = System.currentTimeMillis();
		System.out.println("�� ���μ� : "+i);
		System.out.println("���� �ð� : "+ (endTime - stratTime)+"ms");
		System.out.println("������ ������ ũ�� : "+(file.length()/1024)+"Kbyte");
		
		
		fos.close();
		fis.close();
		System.out.println(file.getName()+"������ ���� �Ϸ�");
	}

}
