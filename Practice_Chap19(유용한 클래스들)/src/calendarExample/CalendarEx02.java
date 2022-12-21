package calendarExample;

import java.util.Calendar;

public class CalendarEx02 {

	public static void main(String[] args) {
		
		// �⺻������ ���� ��¥�� �ð����� �����ȴ�. (�̱��� ����)
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DAY_OF_MONTH);
		int week = today.get(Calendar.DAY_OF_WEEK);
		
		
		String strWeek = null;
		switch (week) {
		
		case Calendar.MONDAY:
			strWeek = "������";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ����";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "������";
			break;
		case Calendar.THURSDAY:
			strWeek = "�����";
			break;
		case Calendar.FRIDAY:
			strWeek = "�ݿ���";
			break;
		case Calendar.SATURDAY:
			strWeek = "�����";
			break;
		case Calendar.SUNDAY:
			strWeek = "�Ͽ���";
			break;
		
		}
		
		System.out.println("������"+year+"�� "+ month+"��"+ day +"�� "
			+strWeek);
		
	}

}
