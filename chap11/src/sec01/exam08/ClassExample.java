package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		// Class ��ü�� ��� ù��° ���
		Class clazz = Car.class;
		
		// Class ��ü�� ��� �ι�° ���
		//Class clazz = Class.forName("sec01.exam08.Car");

		// Class ��ü�� ��� ����° ���
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
