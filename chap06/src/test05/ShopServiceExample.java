package test05;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1�� obj2�� ������ ��ü�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �ٸ� ��ü�� �����մϴ�.");
		}
	}

}
