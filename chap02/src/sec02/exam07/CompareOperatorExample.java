package sec02.exam07;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); //true
		boolean result2 = (num1 != num2); //false
		boolean result3 = (num1 <= num2); //true
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		System.out.println("result3= " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); //char 타입은 유니코드 리터럴로 변환되어 비교가 수행된다. 65 < 66. true.
		System.out.println("result4= " + result4);
	}

}
