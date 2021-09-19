package sec02.exam04;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 =" + result1); //7
		
		int result2 = v1 - v2;
		System.out.println("result2 =" + result2); //3
		
		int result3 = v1 * v2;
		System.out.println("result3 =" + result3); //10
		
		int result4 = v1 / v2;
		System.out.println("result4 =" + result4); // int 타입으로 연산되기 때문에, 나머지 값은 버려진다. 2
		
		int result5 = v1 % v2;
		System.out.println("result5 =" + result5); // 1
		
		double result6 = (double) v1 / v2;
		System.out.println("result6= " + result6); // double 타입 변수가 피연산자로 포함되었기 때문에, double 타입으로 변환되어 연산이 수행된다. 2.5
	

	}

}
