package example09;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {
		 
		Console console = System.console();
		
		//Console Ŭ������ ����� ��Ŭ������ �ֺܼ信�� �ϰ� �Ǹ�
		// null �� �����Ѵ�.
		// NullPointerException �� �߻��Ѵ�.
		// �ݵ�� ��� ������Ʈ���� �����ؾ� �Ѵ�.
		System.out.print("���̵�  : ");
		
		String id= console.readLine();
		// �ܼ�Ŭ���� ������ �⺻Ÿ���� ������ �ִ� �޼��� ��ü�� ����.
		
		System.out.print("�н����� : ");
		// �ݼ�â�� �Է��� ���ڰ� �������, �� ������ �ʴ´�(����)
		char[] password = console.readPassword();
		
		String pStr = new String(password);
		System.out.println("-----------------------");
		System.out.println("id  : "+id);
		System.out.println("pwd : "+pStr);
		
		
		
		
		
	}

}
