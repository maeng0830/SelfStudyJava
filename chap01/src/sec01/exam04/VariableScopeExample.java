package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15; // v1�� main �޼ҵ� ���ο��� ��밡��
		
		if (v1 > 10) {
			int v2; // v2�� �ݺ��� ���ο��� ��밡��.
			v2 = v1 - 10;
		}
		
		//int v3 = v1 + v2 + 5; // v2�� scope�� �ƴϱ� ������ ������ ���� �߻�.

	}

}
