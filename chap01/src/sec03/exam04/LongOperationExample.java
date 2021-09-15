package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000l;
		long result = value1 + value2 + value3; //모든 정수연산이 int로 변환되어 실시되는 것이 아니다. 기본적으로 정수연산은 피연산자들 중 가장 허용범위가 큰 타입으로 변환되어 실행된다.
		System.out.println(result);

	}

}
