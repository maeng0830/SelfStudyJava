package test;

public class Test3 {
	// �ֻ����� �ι� ���� ��, �� �ֻ����� ���� 5�� �ɶ����� ������ �����..
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
