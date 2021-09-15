package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15; // v1은 main 메소드 내부에서 사용가능
		
		if (v1 > 10) {
			int v2; // v2는 반복문 내부에서 사용가능.
			v2 = v1 - 10;
		}
		
		//int v3 = v1 + v2 + 5; // v2의 scope가 아니기 때문에 컴파일 에러 발생.

	}

}
