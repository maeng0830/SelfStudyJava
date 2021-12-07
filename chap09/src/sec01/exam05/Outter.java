package sec01.exam05;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(field);
			method();
			//중첩 클래스 내부에서 this는 중첩 클래스를 참조한다.
			System.out.println(this.field);
			this.method();
			//중첩클래스 내부에서 외부 클래스를 참조하기 위해서는 외부클래스.this 로 참조한다.
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}

}
