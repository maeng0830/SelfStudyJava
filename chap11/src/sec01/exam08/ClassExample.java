package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		// Class 객체를 얻는 첫번째 방법
		Class clazz = Car.class;
		
		// Class 객체를 얻는 두번째 방법
		//Class clazz = Class.forName("sec01.exam08.Car");

		// Class 객체를 얻는 세번째 방법
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
