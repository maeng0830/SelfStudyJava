package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		
		byte b = 100;
		// byte result3 = -b; // ���� ������ �⺻ ��Ģ�� ����, int Ÿ�� ������ ���� Ÿ�� ������ ����� ��� int Ÿ������ ��ȯ�Ǿ� ����ȴ�. 
		int result3 = -b;
		System.out.println("result3= " + result3);
		
		float f = 3.15f;
		float result4 = -f;
		System.out.println("result4 =" + result4);
		
		double d = 3.15;
		double result5 = -d;
		System.out.println("result5 =" + result5);

	}

}
