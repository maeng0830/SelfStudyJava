package sec01.exam02;

public class ifElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) { //조건식 값이 false이므로 해당 중괄호는 실행 X.
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else { //조건식 값이 false이므로 해당 중괄호가 실행.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

	}

}
