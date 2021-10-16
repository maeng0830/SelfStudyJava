package sec03.exam02;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	public Korean(String name, String ssn) {
		//this는 객체 자신을 참조한다는 의미이다. 
		//코드의 가독성을 위해 일반적으로 생성자 매개변수와 필드의 이름을 동일하게 해주는 것이 좋다.
		//그러나 생성자 매개변수와 필드의 이름이 동일할 경우, 생성자 내부 블록에서는 필드에 접근할 수가 없다.
		//접근 우선순위가 생성자 매개변수가 더 높으며, 모든 것을 생성자 매개변수로 인식하기 때문이다.
		//이럴 경우, 필드 앞에 this를 붙여주면 필드와 매개변수를 구분할 수 있다.
		//this는 객체 자신을 참조한다는 의미를 가진다.
		this.name = name;
		this.ssn = ssn;
	}

}
