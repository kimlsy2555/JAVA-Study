package calendarExample;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		
		// �⺻������ ���� ��¥�� �ð����� �����ȴ�. (�̱��� ����)
		Calendar today = Calendar.getInstance();

		
		//System.out.println(today);
		
		System.out.println("������ �⵵    : "+ today.get(Calendar.YEAR));
		System.out.println("��(0~11)  : "+ (today.get(Calendar.MONTH)+1));
		System.out.println("������ ��°�� : "+ today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�̴��� ��°�� : "+ today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�̴��� ����    : "+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("������ �� : "+ today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("���� (1~7) : " + today.get(Calendar.DAY_OF_WEEK) );
		System.out.println("�ð� (0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("�̴��� ������ ��  : " + today.getMaximum(Calendar.DATE) );
	}

}
