package sec05.exam03;

public class Car {
	//인스턴스 필드
	int speed;

	//인스턴스 메소드
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		//정적 메소드 내부에서는 인스턴스 필드, 인스턴스 메소드를 사용할 수 없다. 
		//또한 객체를 참조하는 this도 사용할 수 없다.
		//정적 메소드 안에서 인스턴스 필드 및 메소드를 사용하기 위해서는 객체를 먼저 생성하고 참조변수를 통해 사용해야한다.
		//main도 정적 메소드 중 하나이다.
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();

	}

}
