package sec01.exam18;

public class StringSubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		//0�� �ε������� 6�� ���ڿ� ����
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		

	}

}
