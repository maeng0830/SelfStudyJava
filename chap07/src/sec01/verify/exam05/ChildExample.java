package sec01.verify.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		//child() �����ڸ� ȣ���ϸ� �켱 �θ� Ŭ������ �⺻ �������� Parent()�� ȣ���Ѵ�.
		//Parent()�� ȣ���ϸ� this("���ѹα�")���� ���� Parent(String nation) �����ڰ� ����ȴ�.
		//Parent(String nation) ������ �������� ���� "Parent(String nation) call"�� ���� ��µǰ�
		//Parent() �������� �������� �ڵ��� "Parent() call"�� ��µȴ�.
		//�׸��� Child() �������� ù��° �� this("ȫ�浿")�� ����Ǹ鼭 Child(String name) �����ڰ� ����ȴ�.
		//Child(String name) ������ �������� ���� "Child(String name) call"�� ���� ��µǰ�
		//Child() �������� �������� �ڵ��� "Child() call"�� ��µȴ�. 

	}

}
