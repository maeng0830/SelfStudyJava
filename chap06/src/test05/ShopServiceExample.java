package test05;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1과 obj2는 동일한 객체를 참조합니다.");
		} else {
			System.out.println("obj1과 obj2는 다른 객체를 참조합니다.");
		}
	}

}
