package sec03.exam02;

public class Dog extends Animal {
	public Dog() {
		this.kind = "������";
	}
	
	//�߻�޼ҵ�� �����Ǹ� �ݵ�� �ؾ��Ѵ�. �׷��� ������ ������ ������ �߻��Ѵ�.
	@Override
	public void sound() {
		System.out.println("�۸�");
	}

}
