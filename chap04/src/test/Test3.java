package test;

public class Test3 {
	// 주사위를 두번 던진 후, 두 주사위의 합이 5가 될때까지 던지고 멈춰라..
	public static void main(String[] args) {
		while(true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			int sum = num1 + num2;
			
			System.out.printf("(%d, %d)", num1, num2);
			
			if(sum == 5) {
				break;
			}
			
		}

	}

}
