package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//자식객체 bus, taxi가 부모 객체 vehicle로 자동변환되고, 각 자식 클래스에서 재정의된 메소드를 호출한다. 
		driver.drive(bus);
		driver.drive(taxi);

	}

}
