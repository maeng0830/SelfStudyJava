package sec02.exam07;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while (i<=100) {
			sum += i;
			i++;
		}

		System.out.printf("1~100ÀÇ ÇÕ: %d", sum);
	}

}
