package sec03.exam02;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	
	//추상메소드는 반드시 재정의 되어야한다. 그렇지 않으면 컴파일 에러가 발생한다.
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	

}
