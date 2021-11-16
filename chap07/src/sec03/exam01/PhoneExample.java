package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//추상클래스는 new 연산자를 통해 직접 객체를 생성할 수 없다.
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("kmk");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
