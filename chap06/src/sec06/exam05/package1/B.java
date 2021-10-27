package sec06.exam05.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; private 접근제한은 클래스 내부에서만 사용가능.
		
		a.method1();
		a.method2();
		//a.method3(); private 접근제한은 클래스 내부에서만 사용가능.
				
	}


}
