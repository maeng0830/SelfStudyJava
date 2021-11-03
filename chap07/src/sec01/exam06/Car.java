package sec01.exam06;

public class Car {
	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드는 자식 클래스에서 재정의할 수 없다.
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
