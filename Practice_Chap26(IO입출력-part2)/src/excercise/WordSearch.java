package excercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {

	public static void main(String[] args) {

		// �ܾ� ã�� ���α׷� ����
		
		// �ܾ ������ ���� �����.
		
		Vector<String> vector = new Vector<String>();
		
		File file = new File("C:\\JAVA �۾�\\Practice_Chap26(IO�����-part2)\\src\\excercise\\words.txt");

		System.out.println("���� ũ�� : "+file.length()/1024+"kb");
		
		try {
			Scanner fScanner = new Scanner(file);
			while(fScanner.hasNext()) {
				vector.add(fScanner.next());
			}
			fScanner.close();
		} catch (FileNotFoundException e) {}
		
		System.out.println("Vector�� ����� �ܾ�� ����ϱ�");
		
		for(int i = 0; i<vector.size();i++) {
			System.out.println(vector.get(i));
		}
		
		// �ܾ� �˻��ϱ�
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			boolean found = false; // flag ����
			
			System.out.print("ã�� �ܾ� �Է�(����� exit) >>");
			String search =  scanner.next();
			
			if(search.equals("exit")) {
				System.out.println("���α׷� ����");
				break;
			}
			
			for(int i = 0; i<vector.size();i++) {
				String vs = vector.get(i); // ���ͳ��� ���ڿ��� �������°� 
				System.out.println(vs);
				if(search.equals(vs)) {
					System.out.println("ã�� ���� : "+vs);
					found = true;
				}
				
			
			}
			if(!found) {
				System.out.println("ã�� �ܾ �����ϴ�.");
			}
		}
		scanner.close();
		
	}

}
