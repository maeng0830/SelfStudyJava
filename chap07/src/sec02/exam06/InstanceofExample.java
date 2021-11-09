package sec02.exam06;

public class InstanceofExample {

	public static void method1(Parent parent) {
		//Child Ÿ������ ��ȯ �������� Ȯ��.
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
	
	public static void method2(Parent parent) {
		//ClassCastException�� �߻��� ���ɼ� ����.
		Child child = (Child) parent;
		System.out.println("method2 - Child�Τ� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		//Child ��ü�� �Ű������� ����.
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		//Parent ��ü�� �Ű������� ����. 
		method1(parentB);
		method2(parentB); //���� �߻�!

	}

}
