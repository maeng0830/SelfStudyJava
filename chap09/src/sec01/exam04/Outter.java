package sec01.exam04;

public class Outter {
	//자바는 컴파일 시 로컬 글래스에서 사용하는 매개변수나 로컬변수의 값을 로컬 클래스 내부에 복사해두고 사용한다.
	//그리고 매개변수나 로컬변수가 수정되어 값이 변경되면 로컬 클래스에 복사해둔 값과 달라지므로, 문제를 해결하기 위해 매개변수나 로컬변수를 final로 선언할 것을 요구한다.
	//자바 7 이전에는 final 키워드 없이 선언된 매개변수나 로컬변수를 로컬 클래스에서 사용하면 컴파일 에러가 발생했다.
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후에는 이러한 상황에서 자동적으로 final 키워드가 적용된다.
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}
