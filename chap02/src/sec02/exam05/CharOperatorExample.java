package sec02.exam05;

public class CharOperatorExample {

	public static void main(String[] args) {
		char c1 = 'a' + 1; // 정수 리터럴 간의 연산 후에 char 타입 변수에 저장되는 것이므로 에러가 발생하지 않는다.
		char c2 = 'a';
		// char c3 = c2 + 1; //연산에 char 타입 변수가 포함되어 있을 경우, 정수 타입 연산의 기본 원칙에 따라 int 타입으로 변환 후 연산된다. 
		
		System.out.println("c1: " + c1); //B
		System.out.println("c2: " + c2); //A
		//System.out.println("c3: " + c3);
		}

}
