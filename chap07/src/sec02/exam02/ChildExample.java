package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		//�ڵ� Ÿ�� ��ȯ
		Parent parent = child;
		
		//�θ�Ŭ���� �޼ҵ� ȣ��
		parent.method1();
		//�ڽ�Ŭ�������� �����ǵ� �޼ҵ� ȣ��
		parent.method2();
		//�ڽ�Ŭ�������� �����ϴ� �޼ҵ� ȣ�� �Ұ�!
		//parent.method3();
		
		
	}

}
