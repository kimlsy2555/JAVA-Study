package example09;

import java.io.OutputStream;

public class SystemOutEx {

	public static void main(String[] args)throws Exception {
		
		// PrintStream(System.out)�� OutpouStreamw �ڼ� Ŭ���� �̹Ƿ�
		// �󸶵��� ������ �����ϴ�. (������)
		
		
		OutputStream oStream = System.out;
		// �ƽ�Ű �ڵ�ǥ ���
		
		for(byte b = 48;b<58;b++){
			System.out.print("�ƽ�Ű �ڵ� write()�� ��µ� ���ڰ� :");
			System.out.print(b+"\t");
			oStream.write(b);
			System.out.println();
			
		}
		oStream.write(13); // ��½�Ʈ�� �̿� �ٹٲ�
		
		for(byte b = 97;b<127;b++){
			System.out.print("�ƽ�Ű �ڵ� write()�� ��µ� ���ڰ� :");
			System.out.print(b+"\t");
			oStream.write(b);
			System.out.println();
			
		}
		
	
		oStream.write(13); // ��½�Ʈ�� �̿� �ٹٲ�
		
		String str = "���� �ڹٰ��θ� ������ �ϴ� ����Դϴ�.";
		
		byte[] bArr = str.getBytes();
		
		
		System.out.println(bArr);
		oStream.write(bArr); // �ѹ��� ���ڿ� ���
		
		
		oStream.flush();
		oStream.close();
		
		
		
	}

}
