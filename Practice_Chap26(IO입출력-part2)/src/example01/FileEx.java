package example01;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) throws Exception{
		
		
		// �Ʒ��� �ڵ带 ���� �Ѵٰ� �ؼ� Temp/directory ������ ������ �ʴ´�.
		
		File directory = new File("C:/Test/directory");
		//File directory = new File("C:/directory");
		File file1 = new File("C:/Test/file1.txt");
		File file2 = new File("C:/Test/file2.txt");
		File file3 = new File(new URI("file:///C:/Test/file3.txt"));
	
		// URI ��ü : ���ڿ� ���۰� ������ ���� ��������
		// URL ��ü : ��Ʈ��ũ ������ ���� �������� 
		// �������� : ��� �Ծ� (TCP/IP/UDP..)
		// URI �� �����ڿ� �ĺ��ڴ� ���ͳݿ� �ִ� �ڿ��� ��Ÿ���� ������ �ּҸ� �ǹ��Ѵ�.
		
		
		// URI ��� ��
//		String uriName = "http://www.gogle.co.kr";
//		URI uri = new URI(uriName);
//		System.out.println(uri);
		
		
		
		// directory������ �����ϴ���?
		if(directory.exists() == false) {
			// �θ� ���丮�� ������ �ڱ� �ڽ��� ������ �����
			// �θ� �ִٸ� �׾ȿ� �ڽ��� ������ �����.
			// �� �θ� ������ ���µ� ��θ� �θ� �־��ٸ� ������ ��������� �ʴ´�.
			//directory.mkdir();
			
			// ��λ� ���� ���丮�� �� �����Ѵ�(���� ���) 
			directory.mkdirs();
		}
		
		if(file1.exists() == false) {
			
			// ���࿡ C://Test������ ���ٸ� IOException�� �����.
			file1.createNewFile();
			System.out.println("file1.txt �� ���� �Ǿ����ϴ�.");
		}
		if(file2.exists() == false) {
			
			// ���࿡ C://Test������ ���ٸ� IOException�� �����.
			file2.createNewFile();
			System.out.println("file2.txt �� ���� �Ǿ����ϴ�.");
		}
		
		if(file3.exists() == false) {
			
			// ���࿡ C://Test������ ���ٸ� IOException�� �����.
			file3.createNewFile();
			System.out.println("file3.txt �� ���� �Ǿ����ϴ�.");
		}
		
		File tmp = new File("C:/Test");
		// tmp ���� ���丮 �� ������ ���� �迭�� ���� ����ϱ�
		
		File[] contents = tmp.listFiles();
		SimpleDateFormat sdf  = new SimpleDateFormat("yyy-MM-dd a HH:mm");
		System.out.println("��¥ \t�ð� \t\t  ���� \t ũ�� \t  �̸�");
		System.out.println(sdf.format(new Date()));
		System.out.println("===================================");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			// file �� ���丮��?
			if(file.isDirectory()) {
				// ���丮 �̸��� ����Ѵ�.
				System.out.println("\t <DIR>\t\t"+file.getName());
			}
			// file �̸�...
			else {
				// ������ ũ��� �̸��� ����Ѵ�.
				System.out.println("\t\t "+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
