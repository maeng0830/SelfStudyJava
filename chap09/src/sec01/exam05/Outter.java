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
			//��ø Ŭ���� ���ο��� this�� ��ø Ŭ������ �����Ѵ�.
			System.out.println(this.field);
			this.method();
			//��øŬ���� ���ο��� �ܺ� Ŭ������ �����ϱ� ���ؼ��� �ܺ�Ŭ����.this �� �����Ѵ�.
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}

}
