package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; //byte Ÿ�� ������ int�� ��ȯ�Ǿ� �����. ���� ����� int ���ͷ��̹Ƿ� int ������ �����ؾ���.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'a';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; // char Ÿ�� ������ int�� ��ȯ�Ǿ� �����.
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ�= " + intValue2);
		System.out.println("��¹���= " + (char) intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = intValue5 / 4.0 //������ �Ǽ��� ������ ���, �Ǽ��� �������� �� ū ����Ÿ���̹Ƿ� �Ǽ��� �⺻ Ÿ���� double�� ��ȯ�Ǿ� ����ȴ�.
		double doubleValue  = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result1 = x / y; //���������� ���� ó���ǰ� �Ǽ� Ÿ������ �����. 
		double result2 = (double) x / y;
		double result3 = x / (double) y;
		double result4 = (double) (x / y); //���������� ���� ó���ǰ� �Ǽ�Ÿ������ ĳ���� �� ����.
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
 