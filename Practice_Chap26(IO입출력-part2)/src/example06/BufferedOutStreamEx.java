package example06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutStreamEx {

	public static void main(String[] args)throws Exception {

		File file = new File("C:\\JAVA �۾�\\Practice_Chap26(IO�����-part2)\\src\\example06\\���� �ϰ� �߾�.mp3");
		
		
		System.out.println(file.length()/1024 +"Kbyte");
		
		// �� ��Ʈ�� 
		FileInputStream fInputStream = null;
		FileOutputStream fOutputStream = null;
		// ���� ��Ʈ��
		BufferedInputStream bInputStream = null;
		BufferedOutputStream bOutputStream = null;
		
		int dataCount = 0;
		long start = 0;
		long end = 0;
		byte[] bArr = new byte[10000];
		
		
		// �� ��Ʈ���� ������Ʈ�� ����(�Է�)
		fInputStream = new FileInputStream(file);
		bInputStream = new BufferedInputStream(fInputStream);
		
		// �� ��Ʈ���� ������Ʈ�� ����(���)
		fOutputStream = new FileOutputStream("C:/Test/���� �ϰ� �߾�.mp3");
		bOutputStream = new BufferedOutputStream(fOutputStream);
		
		// �а� �����ϱ� �� �ð� ����
		start = System.currentTimeMillis();
		
		//1����Ʈ�� �а� 1����Ʈ�� ���� ���� �����ɸ�
//		while((dataCount = bInputStream.read(bArr))!=-1) {
//			
//			fOutputStream.write(bArr,0,dataCount);
//		}
		
		fOutputStream.flush();
		end = System.currentTimeMillis();
		
		System.out.println("���� �Ⱦ��� �ҿ� �ð� : " + (end - start)+"ms");
		
		System.out.println();
		// �а� �����ϱ� �� �ð� ����
		start = System.currentTimeMillis();
				
		// BufferedOutputStream ����
		while((dataCount = bInputStream.read(bArr))!=-1) {
					
			bOutputStream.write(bArr,0,dataCount);
		}
				
		bOutputStream.flush();
		end = System.currentTimeMillis();
				
		System.out.println("���� ���� �ҿ� �ð� : " + (end - start)+"ms");	
		
		
		
		
		// �ڿ� ����
		bOutputStream.close();
		bInputStream.close();
		fOutputStream.close();
		fInputStream.close();
		
		// ��� : �迭�� ����ؼ� �����ϰ� ��������� �ְ� BufferedInputStream
		// BufferedOutputStream�� ���� ��Ʈ������ �����Ͽ� ����ϸ�
		// ������ �ſ� ���ȴ�.
	}

}
