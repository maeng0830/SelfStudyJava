package sec03.exam01;

public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	//추상클래스는 new 연산자를 통해 생성자를 직접 호출할 수 없지만, 자식 클래스에서 super()를 통해 추상클래스의 생성자를 호출하므로 생성자가 필요하다.
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}
