package sec03.exam02;

public class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}
	
	//�߻�޼ҵ�� �ݵ�� ������ �Ǿ���Ѵ�. �׷��� ������ ������ ������ �߻��Ѵ�.
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
	

}
