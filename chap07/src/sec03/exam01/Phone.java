package sec03.exam01;

public abstract class Phone {
	//�ʵ�
	public String owner;
	
	//������
	//�߻�Ŭ������ new �����ڸ� ���� �����ڸ� ���� ȣ���� �� ������, �ڽ� Ŭ�������� super()�� ���� �߻�Ŭ������ �����ڸ� ȣ���ϹǷ� �����ڰ� �ʿ��ϴ�.
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}

}
