package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		//자동 타입 변환
		Parent parent = child;
		
		//부모클래스 메소드 호출
		parent.method1();
		//자식클래스에서 재정의된 메소드 호출
		parent.method2();
		//자식클래스에만 존재하는 메소드 호출 불가!
		//parent.method3();
		
		
	}

}
