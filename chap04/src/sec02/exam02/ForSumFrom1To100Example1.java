package sec02.exam02;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0; //for문 밖에서 sum 변수를 사용하기 위해 이곳에 선언.
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.printf("1~100의 합: %d", sum);

	}

}
