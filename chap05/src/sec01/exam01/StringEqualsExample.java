package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		//string ������ ������ ���ͷ��� ����Ͽ� �ʱ�ȭ�� ���, ������ ���ͷ��� ���� string �������� ������ ��ü�� �����ϰ� �ȴ�. 
		String strVar1 = "kmk";
		String strVar2 = "kmk";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����.");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����.");
		}
		
		//new�� ���� ������ ��ü�� �����ϰ� 
		String strVar3 = new String("kmk");
		String strVar4 = new String("kmk");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����.");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����.");
		}

	}

}
