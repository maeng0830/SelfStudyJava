package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); //byte는 int로 자동변환 가능하기 때문에, 컴파일 에러가 발생하지 않는다.
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
		

	}

}
