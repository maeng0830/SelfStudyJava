package sec03.exam02;

import java.util.Calendar;

import sec03.exam01.Week;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
			
		case 2:
			today = Week.TUESDAY; break;
			
		case 3:
			today = Week.WEDNESDAY; break;
			
		case 4:
			today = Week.THURSDAY; break;
			
		case 5:
			today = Week.FRIDAY; break;
			
		case 6:
			today = Week.SATURDAY; break;
			
		case 7:
			today = Week.SUNDAY; break;
		}
		
		System.out.println("���� ����: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� ������ �մϴ�.");
		} else {
			System.out.println("������ �ڹ� ���θ� �մϴ�.");
		}

	}

}
