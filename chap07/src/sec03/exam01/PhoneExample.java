package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//�߻�Ŭ������ new �����ڸ� ���� ���� ��ü�� ������ �� ����.
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("kmk");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
