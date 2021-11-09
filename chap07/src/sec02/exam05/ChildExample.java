package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		//자동타입변환
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/* 부모타입으로 자동 타입 변환될 경우, 부모타입에 선언된 필드 및 메소드만 사용 가능하다.
		parent.field2 = "data2";
		parent.method3();
		 */
		
		//강제타입변환
		Child child = (Child) parent;
		//강제타입변환은 자식타입을 부모타입으로 변환한 후, 다시 부모타입을 자식타입으로 변환할 때만 가능하다. 이럴 경우, 자식타입에서 선언된 필드 밋 메소드를 사용할 수 있다.
		child.field2 = "yyy";
		child.method3();
		
		

	}

}
