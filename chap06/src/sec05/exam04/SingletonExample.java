package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton(); 싱글톤은 객체를 하나만 만들 수 있으며, 클래스 외부에서 생성할 수 없다.
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance(); //getIntance() 메소드를 통해 클래스 외부에서 객체를 생성할 수 있다.
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다."); // getInstance() 메소드는 하나의 객체만 리턴하기 때문에, obj1과 obj2는 동일한 객체를 공유한다.
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}

}
