package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		
		byte b = 100;
		// byte result3 = -b; // 정수 연산의 기본 원칙에 따라, int 타입 이하의 정수 타입 변수가 연산될 경우 int 타입으로 변환되어 연산된다. 
		int result3 = -b;
		System.out.println("result3= " + result3);
		
		float f = 3.15f;
		float result4 = -f;
		System.out.println("result4 =" + result4);
		
		double d = 3.15;
		double result5 = -d;
		System.out.println("result5 =" + result5);

	}

}
