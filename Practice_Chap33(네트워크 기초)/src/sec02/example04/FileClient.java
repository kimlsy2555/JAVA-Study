package sec02.example04;

 
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
 

public class FileClient {

	public static void main(String[] args) {
		
		Socket socket =null;
		try {
			socket = new Socket("localhost",7777);
			OutputStream outputStream = socket.getOutputStream();
			
			String filePath ="C:/JAVA �۾�/Practice_Chap33(��Ʈ��ũ ����)/src/sec02/example04/files/���Ͽ�.gif";
			//String filePath ="C:/JAVA �۾�/Practice_Chap33(��Ʈ��ũ ����)/src/sec02/example04/files/Freak-����ĥ.mp3";
			// ���� ��ü ���
			File file = new File(filePath);
			
			// ���� �̸� ���
			
			String fileName = file.getName();
			byte[] fileNameBytes = fileName.getBytes("UTF-8");
			
			fileNameBytes =	Arrays.copyOf(fileNameBytes, 100);
			// ���� �̸� ������ �κ�
			outputStream.write(fileNameBytes);
			
			System.out.println("[���� ������ ����] : " + fileName);
			
			byte[] fileArr =  new byte[1000];
			FileInputStream fileInputStream = new FileInputStream(file);
			
			int readCount = -1;
			
			while((readCount =fileInputStream.read(fileArr)) !=-1 ) {
				outputStream.write(fileArr,0,readCount);
				
			}
			outputStream.flush();
			System.out.println("[���� ������ �Ϸ�]");
			
			fileInputStream.close();
			outputStream.close();
			socket.close();	
			
		} catch (Exception e) {
			System.out.println("���� ������ ���� �߻�");
			e.printStackTrace();
		}
		
	}

}
