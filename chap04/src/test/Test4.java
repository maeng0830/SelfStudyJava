package test;

public class Test4 {
	// 4x + 5y = 60을 만족하는 해를 모두 구하라..
	public static void main(String[] args) {
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if((4 * x) + (5 * y) == 60) {
					System.out.printf("(%d, %d)", x, y);
				}
			}
		}

	}

}
