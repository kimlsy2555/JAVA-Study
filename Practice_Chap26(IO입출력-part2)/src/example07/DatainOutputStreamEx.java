package example07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DatainOutputStreamEx {

	public static void main(String[] args) throws Exception {
		// ���� ��ü ����
		File file  = new File("C:/Test/PrimitiveData.dat");
		// �� ��Ʈ�� ����
		FileOutputStream fOutputStream = new FileOutputStream(file);
		
		System.out.println("���� ũ�� : "+ file.length());
		
		// ���� ��Ʈ�� ����
		// �⺻Ÿ�� (int,double,float,String.. �� )����� �ϱ� ���� ��Ʈ�̹ٷ�
		// DataOutputStream�̴�.
		
		DataOutputStream dOutputStream = new DataOutputStream(fOutputStream);
		
		
		// String�� ���Ͽ� �����ϱ� ���ؼ��� writeUTF()�� ����ϴµ�, 
		// �ѱ��� 3����Ʈ,�����ڴ� 1����Ʈ �ν��Ѵ�.
		// ������, String���� ������ ��� 2����Ʈ�� ���Եȴ�. ��� 9+2 = 11
		
		dOutputStream.writeUTF("������");// 11 ����Ʈ �߰� 
		System.out.println("������ ���� �� - ���� ũ�� : "+ file.length()+"byte");
		
		dOutputStream.writeDouble(100.15); // 8����Ʈ �߰�
		System.out.println("100.15 ���� �� - ���� ũ�� : "+ file.length()+"byte");
		
		dOutputStream.writeInt(777); // 4����Ʈ �߰�
		System.out.println("777 ���� �� - ���� ũ�� : "+ file.length()+"byte");
		
		dOutputStream.writeUTF("�迬��"); //11����Ʈ �߰�
		System.out.println("Kim ���� �� - ���� ũ�� : "+ file.length()+"byte");
		
		dOutputStream.writeDouble(717.15); // 8����Ʈ �߰�
		System.out.println("717.15 ���� �� - ���� ũ�� : "+ file.length()+"byte");
		
		dOutputStream.writeInt(555); // 4����Ʈ �߰�
		System.out.println("555 ���� �� - ���� ũ�� : "+ file.length()+"byte");
		

		fOutputStream.flush();
		dOutputStream.flush();
		
		fOutputStream.close();
		dOutputStream.close();
		
		System.out.println();
		
		System.out.println("�̿��� ������ ���");
		System.out.println();
		// �ֽ�Ʈ�� ����
		FileInputStream fInputStream = new FileInputStream(file);
		// ���� ��Ʈ�� ����
		DataInputStream dInputStream = new DataInputStream(fInputStream);
		
		// ���α׷����� �о���� ������ �����Ҷ���
		// ������ �ݵ�� �����ϰ� �о� �;� ���ܰ� �߻������ʴ���(�ſ� �߿�)
		
		
		for(int i = 0; i<2;i++){
			System.out.println((i+1)+"��° ���� ���ڿ� : "+dInputStream.readUTF());
			System.out.println((i+1)+"��° ���� double�� : "+dInputStream.readDouble());
			System.out.println((i+1)+"��° ���� int�� : "+dInputStream.readInt());
			System.out.println();
		}		
		System.out.println("����ũ�� (byte)"+file.length()+"�о����ϴ�.");
		
		dInputStream.close();
		fInputStream.close();

	}

}
