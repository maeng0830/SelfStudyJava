package sec02.test01_02;

import java.text.*;
import java.util.*;


public class Test01_02 {

	public static void main(String[] args) {
		//Date, SimpleDateFormat 이용
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분");
		String str1 = sdf.format(now);
		System.out.println(str1);
		
		Calendar now2 = Calendar.getInstance();
		int year = now2.get(Calendar.YEAR);
		int month = now2.get(Calendar.MONTH) + 1;
		int day = now2.get(Calendar.DAY_OF_MONTH);
		int hour = now2.get(Calendar.HOUR);
		int minute = now2.get(Calendar.MINUTE);
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분");
		
		

	}

}
