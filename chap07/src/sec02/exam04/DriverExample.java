package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//�ڽİ�ü bus, taxi�� �θ� ��ü vehicle�� �ڵ���ȯ�ǰ�, �� �ڽ� Ŭ�������� �����ǵ� �޼ҵ带 ȣ���Ѵ�. 
		driver.drive(bus);
		driver.drive(taxi);

	}

}
