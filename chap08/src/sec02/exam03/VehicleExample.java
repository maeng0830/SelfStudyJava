package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); //Vehicle �������̽����� �ش� �޼ҵ尡 ����.
		
		Bus bus = (Bus) vehicle; //���� Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare(); //���� Ÿ�� ��ȯ�� ���� ���� Ŭ������ ����� �޼ҵ带 ����� �� ����.

	}

}
