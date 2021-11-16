package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("_________________________");
		
		//������ �ڵ�Ÿ�Ժ�ȯ
		//�ڽ� Ŭ���� ��ü(dog, cat)�� �θ� Ŭ���� Ÿ������ �ڵ���ȯ�Ǿ� ����ȴ�. �̷� ���, �ڽ� Ŭ�������� �����ǵ� �޼ҵ尡 ȣ��ȴ�.
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("_________________________");
		
		//�޼ҵ��� ������
		//�ڽ� Ŭ���� Ÿ���� �θ� Ŭ���� Ÿ������ �ڵ���ȯ�Ǿ� �Ű������� Ȱ��ȴ�. 
		animalSound(new Dog());
		animalSound(new Cat());

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
 