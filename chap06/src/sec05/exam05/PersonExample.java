package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "kmk");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";  final Ű���尡 ����� �ʵ��̹Ƿ�, �ʱ�ȭ �Ŀ� �ʵ� �� ������ �Ұ����ϴ�.
		//p1.ssn = "654321-7654321";  ���������� �Ұ����ϴ�.
		p1.name = "ȫ���"; //final Ű���尡 ������� ���� �ʵ��̹Ƿ�, �ʱ�ȭ �Ŀ� �ʵ� �� ������ �����ϴ�.
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}

}
