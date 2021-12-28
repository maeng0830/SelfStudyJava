package sec01.exam18;

public class StringSubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		//0번 인덱스부터 6개 문자열 추출
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		

	}

}
