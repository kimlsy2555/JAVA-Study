package dateExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		// Date Ŭ������ TimeStamp ������� ���� ��� �ȴ�.
		// ����, ī�� ��� ���� ,�α� ����
		
		 Date today = new Date();
		 
		 // Date Ŭ������ toString() ȣ���ϸ� ����ǥ�� ������ (UTC) 
		 // ���·� ����� ��
		 System.out.println(today); 
		 
		 // ����� �������� �������ٷ��� SimpleDateFormat Ŭ���� ���
		 SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� a hh :mm:ss");
		 
		 System.out.println(sDateFormat.format(today));
		
	}

}
