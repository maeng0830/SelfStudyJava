package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y; //int보다 허용범위가 작은  byte, short, char 타입의 변수들은 연산될 시에 int로 자동변환되어 연산된다. 그 결과값도 int 리터럴이므로 int변수에 저장해야한다.
		System.out.println(result2);

	}

}
