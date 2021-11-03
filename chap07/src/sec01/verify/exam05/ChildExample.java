package sec01.verify.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		//child() 생성자를 호출하면 우선 부모 클래스의 기본 생성자인 Parent()를 호출한다.
		//Parent()를 호출하면 this("대한민국")으로 인해 Parent(String nation) 생성자가 실행된다.
		//Parent(String nation) 생성자 실행으로 인해 "Parent(String nation) call"이 먼저 출력되고
		//Parent() 생성자의 마지막줄 코드인 "Parent() call"이 출력된다.
		//그리고 Child() 생성자의 첫번째 줄 this("홍길동")이 실행되면서 Child(String name) 생성자가 실행된다.
		//Child(String name) 생성자 실행으로 인해 "Child(String name) call"이 먼저 출력되고
		//Child() 생성자의 마지막줄 코드인 "Child() call"이 출력된다. 

	}

}
