package sec01.exam03;

public interface RemoteControl {
	//인터페이스 필드(상수)
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//인터페이스 메소드는 객체에서 실행되므로, 실행블록이 없는 추상메소드로 선언한다.
	//인터페이스에 선언된 추상메소드는 모두 public abstract가 컴파일 시에 자동으로 적용된다.
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);

}
