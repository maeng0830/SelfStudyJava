package sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// float Ÿ���� 0.1�� ��Ȯ�ϰ� ǥ���� �� ����. ��ó�� float Ÿ���� ���ڸ� ��Ȯ�� ǥ���� �� ���� ������, ī��Ʈ �����δ� ������� ���ƾ��Ѵ�.
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
		// float Ÿ�� 0.1f�� 0.1���� �ణ ū ���� ǥ���Ѵ�. ���� 10���� �ƴ� 9���� ����Ʈ�ȴ�. 
	}

}
