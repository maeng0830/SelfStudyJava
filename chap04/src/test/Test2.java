package test;

public class Test2 {
	// 1~100 ���� �� 3�� ����� ������ ���϶�..
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
				sum += i;
			} else {
				continue;
			}
		}
		
		System.out.printf("3�� ��� ����: %d", sum);
	}

}
