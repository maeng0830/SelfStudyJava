package sec02.exam01;

public class ArrayCreateByValueList {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		System.out.printf("scores[0] : %d\n", scores[0]);
		System.out.printf("scores[1] : %d\n", scores[1]);
		System.out.printf("scores[2] : %d\n", scores[2]);
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
		System.out.printf("ÃÑÇÕ: %d\n", sum);
		double arg = (double) sum / 3;
		System.out.printf("Æò±Õ: %f\n", arg);
	}

}
