package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println("상위 인터페이스 중 InterfaceA의 메소드만 호출 가능");
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println("상위 인터페이스 중 InterfaceB의 메소드만 호출 가능");
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println("InterfaceC는 InterfaceA와 InterfaceB를 상속하는 하위 인터페이스이므로 세가지 인터페이스의 메소드를 모두 호출 가능");

	}

}
