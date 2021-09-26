package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}

		if(score < 90) { // 조건식 값이 false 이므로 중괄호 블록 안의 명령문이 실행되지 않음.
			System.out.println("점수가 90보다 작습니다."); 
			System.out.println("등급은 B입니다."); 
		}
	}

}
