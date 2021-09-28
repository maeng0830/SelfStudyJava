package sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// float 타입은 0.1을 정확하게 표현할 수 없다. 이처럼 float 타입은 숫자를 정확히 표현할 수 없기 때문에, 카운트 변수로는 사용하지 말아야한다.
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
		// float 타입 0.1f는 0.1보다 약간 큰 값을 표현한다. 따라서 10번이 아닌 9번이 프린트된다. 
	}

}
