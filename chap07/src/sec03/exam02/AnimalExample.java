package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("_________________________");
		
		//변수의 자동타입변환
		//자식 클래스 객체(dog, cat)가 부모 클래스 타입으로 자동변환되어 저장된다. 이럴 경우, 자식 클래스에서 재정의된 메소드가 호출된다.
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("_________________________");
		
		//메소드의 다형성
		//자식 클래스 타입이 부모 클래스 타입으로 자동변환되어 매개변수로 활용된다. 
		animalSound(new Dog());
		animalSound(new Cat());

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
 