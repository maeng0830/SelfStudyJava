package sec02.exam03;

public class ForSumFrom1to100Example2 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0; //���� i�� for�� ���� ������ ���, for�� ���ο� �ܺο��� ��� ��� �����ϴ�.
		for(i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.printf("1~%d�� ��: %d", i - 1, sum);

	}

}
