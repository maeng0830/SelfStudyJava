package sec01.exam04;

public class Outter {
	//�ڹٴ� ������ �� ���� �۷������� ����ϴ� �Ű������� ���ú����� ���� ���� Ŭ���� ���ο� �����صΰ� ����Ѵ�.
	//�׸��� �Ű������� ���ú����� �����Ǿ� ���� ����Ǹ� ���� Ŭ������ �����ص� ���� �޶����Ƿ�, ������ �ذ��ϱ� ���� �Ű������� ���ú����� final�� ������ ���� �䱸�Ѵ�.
	//�ڹ� 7 �������� final Ű���� ���� ����� �Ű������� ���ú����� ���� Ŭ�������� ����ϸ� ������ ������ �߻��ߴ�.
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//�ڹ� 8 ���Ŀ��� �̷��� ��Ȳ���� �ڵ������� final Ű���尡 ����ȴ�.
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}
