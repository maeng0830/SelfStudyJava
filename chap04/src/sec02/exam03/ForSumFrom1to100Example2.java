package sec02.exam03;

public class ForSumFrom1to100Example2 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0; //변수 i를 for문 전에 선언할 경우, for문 내부와 외부에서 모두 사용 가능하다.
		for(i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.printf("1~%d의 합: %d", i - 1, sum);

	}

}
