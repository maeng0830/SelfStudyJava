package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		//�ڵ�Ÿ�Ժ�ȯ
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/* �θ�Ÿ������ �ڵ� Ÿ�� ��ȯ�� ���, �θ�Ÿ�Կ� ����� �ʵ� �� �޼ҵ常 ��� �����ϴ�.
		parent.field2 = "data2";
		parent.method3();
		 */
		
		//����Ÿ�Ժ�ȯ
		Child child = (Child) parent;
		//����Ÿ�Ժ�ȯ�� �ڽ�Ÿ���� �θ�Ÿ������ ��ȯ�� ��, �ٽ� �θ�Ÿ���� �ڽ�Ÿ������ ��ȯ�� ���� �����ϴ�. �̷� ���, �ڽ�Ÿ�Կ��� ����� �ʵ� �� �޼ҵ带 ����� �� �ִ�.
		child.field2 = "yyy";
		child.method3();
		
		

	}

}
