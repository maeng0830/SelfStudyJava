package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton(); �̱����� ��ü�� �ϳ��� ���� �� ������, Ŭ���� �ܺο��� ������ �� ����.
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance(); //getIntance() �޼ҵ带 ���� Ŭ���� �ܺο��� ��ü�� ������ �� �ִ�.
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�."); // getInstance() �޼ҵ�� �ϳ��� ��ü�� �����ϱ� ������, obj1�� obj2�� ������ ��ü�� �����Ѵ�.
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}

	}

}
