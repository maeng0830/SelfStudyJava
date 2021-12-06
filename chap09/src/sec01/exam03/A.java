package sec01.exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	
	//인스턴스 멤버 클래스 내부에서는 외부 클래스의 인스턴스, 정적 필드 및 메소드에 접근 가능하다.
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}

	//정적 멤버 클래스 내부에서는 외부 클래스의 인스턴스 필드 및 메소드에만 접근 가능하다.
	static class C {
		void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
