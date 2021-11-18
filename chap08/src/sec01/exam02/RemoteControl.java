package sec01.exam02;

public interface RemoteControl {
	//인터페이스는 상수필드와 추상메소드만을 가진다.
	
	//인터페이스 필드는 상수 필드이다.
	//인터페이스는 객체 사용 방법을 정의하는 것이므로, 데이터를 저장할 수 있는 인스턴스 또는 정적 필드를 선언할 수 없다.
	//인터페이스 필드는 선언과 동시에 반드시 초기화를 해줘야한다.
	//인터페이스 필드는 컴파일 과정에서 자동적으로 public static final의 속성을 가진다.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

}
