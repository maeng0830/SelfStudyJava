package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi; //정적 필드는 클래스.필드명 으로 불러올 수 있다.
		
		//정적 메소드는 클래스.메소드명 으로 호출 할 수 있다.
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);

	}

}
