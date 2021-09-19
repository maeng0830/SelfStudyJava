package sec02.exam08;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //산술연산과 마찬가지로 double 타입으로 변환되어 비교 실시.
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // 0.1f는 0.1의 근사값을 의미한다. 또한 double로 변환되지 않기 때문에 false
		System.out.println((float) v4 == v5); //true
		System.out.println(v4 == (double) v5); // 0.1f를 double로 변환해도 0.1의 근사값이기 때문에 false

	}

}
