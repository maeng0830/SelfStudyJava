package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		//조건식이 true일 경우 무한 반복...
		while(true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			//num의 값이 6일 경우, 반복 종료.
			if(num == 6) {
				break;
			}
		}

	}

}
