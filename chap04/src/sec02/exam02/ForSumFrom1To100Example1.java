package sec02.exam02;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0; //for�� �ۿ��� sum ������ ����ϱ� ���� �̰��� ����.
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.printf("1~100�� ��: %d", sum);

	}

}