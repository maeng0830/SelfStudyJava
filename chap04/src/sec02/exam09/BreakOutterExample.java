package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		//for���� Outter ���� �ٿ���. 
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.printf("%c-%c\n", upper, lower);
				if(lower == 'g') {
					break Outter; //Outter ���� ���� �ݺ����� ������.
				}
			}
		}
		
		System.out.println("���α׷� ����!");
	}

}
