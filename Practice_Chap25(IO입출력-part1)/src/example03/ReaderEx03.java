package example03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx03 {

	public static void main(String[] args) throws Exception{

		
		Reader reader = new FileReader("C:/test.txt");
		
		// cArr �迭�� 1��° �ε��� ���� test.txt���Ͽ� �ִ� 3�ڸ� �о �������ּ�
		
		char[] cArr = new char[4];
		
		int readData =  reader.read(cArr,1,3);
		System.out.println("���� ���� �� :"+readData);
		// ��°���� 0 �ε������� ������ ��µǸ� ,1,2,3, �ε����� �ִ°͸�
		// �о �����
		for(int i = 0;i<cArr.length;i++) {
			System.out.println(i+"��° ���� : "+cArr[i]);
		}
		
	}

}
