package example03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx01 {

	public static void main(String[] args) throws Exception {
		
		// ReaderŬ������ ����Ưȣ ��Ŭ������ �� 
		// ���� Ŭ������ FileReader �� �����ؼ� ���� ������
		Reader reader = new FileReader("C:/test.txt");
		
		int readData;
		
		// readData�� int ������ �� 2����Ʈ(���� 2����Ʈ �̴ϱ�)�� ����ȴ�
		
		while((readData = reader.read())!=-1) {
			// �������(����Ʈ ������ ������ ĳ����)
			System.out.println("���� ���� : "+(char)readData);
			// ������ �ƽ�Ű�ڵ�
			// �ѱ��� �����ڵ� ���
			System.out.println("���� ���� : "+readData);	
		}

		//		while(true){
		//			readData = reader.read();
		//			if(readData==-1) {
		//				break;
		//			}
		//			
		//			System.out.println("���� ���� : "+(char)readData);
		//		}
		
		
		reader.close();
	}

	
	
}
