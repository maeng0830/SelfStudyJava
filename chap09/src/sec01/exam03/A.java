package sec01.exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	
	//�ν��Ͻ� ��� Ŭ���� ���ο����� �ܺ� Ŭ������ �ν��Ͻ�, ���� �ʵ� �� �޼ҵ忡 ���� �����ϴ�.
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}

	//���� ��� Ŭ���� ���ο����� �ܺ� Ŭ������ �ν��Ͻ� �ʵ� �� �޼ҵ忡�� ���� �����ϴ�.
	static class C {
		void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
