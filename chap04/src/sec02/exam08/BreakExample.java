package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		//���ǽ��� true�� ��� ���� �ݺ�...
		while(true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			//num�� ���� 6�� ���, �ݺ� ����.
			if(num == 6) {
				break;
			}
		}

	}

}
