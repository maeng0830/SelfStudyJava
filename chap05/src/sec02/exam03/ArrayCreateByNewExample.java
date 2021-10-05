package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3]; //new를 통해 빈 배열을 생성하여 배열 변수를 초기화할 때, int 배열은 0이 초기값으로 사용된다. 
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
		}
		
		
		double[] arr2 = new double[3]; //new를 통해 빈 배열을 생성하여 배열 변수를 초기화할 때, double 배열은 0.0이 초기값으로 사용된다.
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr2[%d]: %f\n", i, arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr2[%d]: %f\n", i, arr2[i]);
		}
		
		
		String[] arr3 = new String[3]; //new를 통해 빈 배열을 생성하여 배열 변수를 초기화할 때, String 배열은 null이 초기값으로 사용된다.
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr3[%d]: %s\n", i, arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr3[%d]: %s\n", i, arr3[i]);
		}
	}

}
