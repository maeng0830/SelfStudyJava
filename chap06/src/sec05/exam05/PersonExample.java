package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "kmk");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";  final 키워드가 선언된 필드이므로, 초기화 후에 필드 값 변경이 불가능하다.
		//p1.ssn = "654321-7654321";  마찬가지로 불가능하다.
		p1.name = "홍삼원"; //final 키워드가 적용되지 않은 필드이므로, 초기화 후에 필드 값 변경이 가능하다.
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}

}
