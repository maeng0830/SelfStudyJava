package sec03.exam02;

public class CatstingExample {

	public static void main(String[] args) {
		int intValue = 10; //���� intValue ���� byte �������� �Ѿ�� �������, �Ѿ�� ��ŭ ������ ���Ƽ� ���� ����ȴ�. ��) 128 => -128, -129 => 127 
		byte byteValue = (byte) intValue;
		System.out.println(byteValue);
		
		
		int intValue2 = 65;
		char charValue = (char) intValue2;
		System.out.println(charValue);
		
		
		double doubleValue = 3.65;
		int intValue3 = (int) doubleValue; // �Ǽ� => ������ ����ȯ �ÿ���, �Ҽ��� ���� �ݿø��� �ƴ� �������� ó���ȴ�.
		System.out.println(intValue3);

	}

}
