package sec05.exam03;

public class Car {
	//�ν��Ͻ� �ʵ�
	int speed;

	//�ν��Ͻ� �޼ҵ�
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		//���� �޼ҵ� ���ο����� �ν��Ͻ� �ʵ�, �ν��Ͻ� �޼ҵ带 ����� �� ����. 
		//���� ��ü�� �����ϴ� this�� ����� �� ����.
		//���� �޼ҵ� �ȿ��� �ν��Ͻ� �ʵ� �� �޼ҵ带 ����ϱ� ���ؼ��� ��ü�� ���� �����ϰ� ���������� ���� ����ؾ��Ѵ�.
		//main�� ���� �޼ҵ� �� �ϳ��̴�.
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();

	}

}
