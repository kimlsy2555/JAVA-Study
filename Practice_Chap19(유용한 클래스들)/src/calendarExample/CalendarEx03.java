package calendarExample;

import java.util.Calendar;

public class CalendarEx03 {

	public static void main(String[] args) {
		
		// �⺻������ ���� ��¥�� �ð����� �����ȴ�. (�̱��� ����)
		Calendar today1 = Calendar.getInstance();
		Calendar today2 = Calendar.getInstance();
		
		// ���Ƿ� ��¥ ���� ����
		today1.set(2015,7,15);
		
		long diff =  (today2.getTimeInMillis() - today1.getTimeInMillis())/1000;
		//1 �� = 24*60*60
		long diffDay = diff/(24*60*60);
		System.out.println("20150712~20200725 ���� ������ "  +diff);
		System.out.println("20150712~20200725 ���� ���� �ϼ� "  +diffDay);
	}

}
