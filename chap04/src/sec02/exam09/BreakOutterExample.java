package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		//for문에 Outter 라벨을 붙여줌. 
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.printf("%c-%c\n", upper, lower);
				if(lower == 'g') {
					break Outter; //Outter 라벨이 붙은 반복문을 종료함.
				}
			}
		}
		
		System.out.println("프로그램 종료!");
	}

}
