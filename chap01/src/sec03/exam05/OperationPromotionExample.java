package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; //byte 타입 변수는 int로 변환되어 연산됨. 따라서 결과도 int 리터럴이므로 int 변수에 저장해야함.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'a';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; // char 타입 변수도 int로 변환되어 연산됨.
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드= " + intValue2);
		System.out.println("출력문자= " + (char) intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = intValue5 / 4.0 //정수와 실수를 연살할 경우, 실수가 허용범위가 더 큰 변수타입이므로 실수의 기본 타입인 double로 변환되어 연산된다.
		double doubleValue  = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result1 = x / y; //정수연산이 먼저 처리되고 실수 타입으로 저장됨. 
		double result2 = (double) x / y;
		double result3 = x / (double) y;
		double result4 = (double) (x / y); //정수연산이 먼저 처리되고 실수타입으로 캐스팅 후 저장.
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
 