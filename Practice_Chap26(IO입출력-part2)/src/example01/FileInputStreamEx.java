package example01;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) throws Exception {
		
		
		// '\' -> �̽������� �����̱� ������ �Ʒ��� ���� '\\' �ϰų� 
		// '/' �ϳ��� ǥ���� �ص� �����ϴ�
		File file = new File("C:\\JAVA �۾�\\Practice_Chap26(IO�����-part2)\\src\\example01\\FileInputStreamEx.java");
		
		System.out.println("������ ��� : "+file.getPath());// ���� ��� ���
		System.out.println("�θ� ���丮 : "+file.getParent());
		System.out.println("���� �����Ѱ� : "+file.canExecute());
		System.out.println("�б� �����Ѱ� : "+file.canRead());
		System.out.println("���� �����ΰ� : "+file.isHidden());
		System.out.println("���⳪ ������  �����Ѱ� : "+file.canWrite());
		System.out.println("���� �̸� : "+file.getName());
		System.out.println("���� ũ�� : "+file.length());
		System.out.println("URI ��� ���� : "+file.toURI());
		
		// toURL() �� ������ �Ǿ���.
		//System.out.println("URL ��� ���� : "+file.toURL());
		
		
		
		
		
		
		// �������� �Ű������� file ��ü�� �ް� �ִ�
		FileInputStream fis = new FileInputStream(file);
		//FileInputStream fis = new FileInputStream("C:\\JAVA �۾�\\Practice_Chap26(IO�����-part2)\\src\\example01\\FileInputStreamEx.java");
		
		
		int data;
		int i = 0;
		byte[] bArr = new byte[1000];
		
		// �� ����Ʈ �� �б�
		while((data = fis.read(bArr))!= -1) {
			
			// �Ʒ��� �����ϸ� �ѱ��� ���ش� 1����Ʈ�� �б� ����
			//System.out.print((char)data);
			
			// �ܼ� ���(���� System.out.println() ��� �ص� �����ϳ�,
			// 1����Ʈ�� �д� ���� �ѱ��� ������ ������  write()�ᵵ ������.
			// write() �� ��� ��Ʈ�� �̱� ������ ������ ���̴�.
			System.out.write(bArr);
			i++;
			
		}
		// ���ʿ��� �ݺ��� �ֱ� ������ ����Ʈ[] �� �޴°� ����
		System.out.println("���μ� : "+ i);
		 
		
		fis.close();
	}

}
