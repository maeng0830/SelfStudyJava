package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.printf("현재시각 %d시 00분\n", time);
		
		switch(time) { //break가 없어서 변수 값과 일치하는 case 실행 후 그 뒤의 case까지 모두 실행된다.
		case 8:
			System.out.println("출근합니다.");
			
		case 9:
			System.out.println("회의를 합니다.");
			
		case 10:
			System.out.println("업무를 봅니다.");
			
		default:
			System.out.println("외근을 나갑니다.");
		}

	}

}
