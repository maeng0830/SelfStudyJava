package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87}; //배열변수를 먼저 선언했을 경우, new 연산자를 통해 배열을 생성해야한다.
		int sum1 = 0;
		for(int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);

		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합: " + sum2);
	}

	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i]; 
		}

		return sum;
	}

}
