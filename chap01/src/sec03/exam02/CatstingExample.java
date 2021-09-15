package sec03.exam02;

public class CatstingExample {

	public static void main(String[] args) {
		int intValue = 10; //만약 intValue 값이 byte 허용범위를 넘어가는 정수라면, 넘어가는 만큼 범위를 돌아서 값이 저장된다. 예) 128 => -128, -129 => 127 
		byte byteValue = (byte) intValue;
		System.out.println(byteValue);
		
		
		int intValue2 = 65;
		char charValue = (char) intValue2;
		System.out.println(charValue);
		
		
		double doubleValue = 3.65;
		int intValue3 = (int) doubleValue; // 실수 => 정수의 형변환 시에는, 소수점 이하 반올림이 아닌 버림으로 처리된다.
		System.out.println(intValue3);

	}

}
