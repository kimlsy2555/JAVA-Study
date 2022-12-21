package formatExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SlmpleDataFormatEx {

	public static void main(String[] args) {
	
		// ����Ǵ� �Ѽ����� �ð� 
		Date date = new Date();
		
		System.out.println(date.toString());
		// 20-07-22
		
		SimpleDateFormat sFormat = new SimpleDateFormat("yy-MM-dd E ���� a hh:mm:ss");
		System.out.println(sFormat.format(date));
		
		sFormat = new SimpleDateFormat("������ E����");
		System.out.println(sFormat.format(date));
		
		//�⵵���� 365
		sFormat = new SimpleDateFormat("������ ������ D° ��");
		System.out.println(sFormat.format(date));
		// ������ 24
		sFormat = new SimpleDateFormat("������ d��° ��");
		System.out.println(sFormat.format(date));
		
		// Ÿ���� 
		sFormat = new SimpleDateFormat("z");
		System.out.println(sFormat.format(date));
		
	}

}
