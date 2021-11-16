package sec03.exam02;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	//추상메소드는 재정의를 반드시 해야한다. 그렇지 않으면 컴파일 에러가 발생한다.
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
