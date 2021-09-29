package test;

public class Test2 {
	// 1~100 정수 중 3의 배수의 총합을 구하라..
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
				sum += i;
			} else {
				continue;
			}
		}
		
		System.out.printf("3의 배수 총합: %d", sum);
	}

}
