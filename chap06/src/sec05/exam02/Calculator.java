package sec05.exam02;

public class Calculator {
	static double pi = 3.14159; //인스턴스(객체)들이 동일한 값을 가지는 필드는 정적 필드로 선언하는 것이 합리적이다.
	
	//인스턴스 필드가 포함되지 않은 메소드는 정적 필드로 선언하는 것이 합리적이다.
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}

}
