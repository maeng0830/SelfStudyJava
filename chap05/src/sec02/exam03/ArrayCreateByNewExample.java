package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3]; //new�� ���� �� �迭�� �����Ͽ� �迭 ������ �ʱ�ȭ�� ��, int �迭�� 0�� �ʱⰪ���� ���ȴ�. 
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
		}
		
		
		double[] arr2 = new double[3]; //new�� ���� �� �迭�� �����Ͽ� �迭 ������ �ʱ�ȭ�� ��, double �迭�� 0.0�� �ʱⰪ���� ���ȴ�.
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr2[%d]: %f\n", i, arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr2[%d]: %f\n", i, arr2[i]);
		}
		
		
		String[] arr3 = new String[3]; //new�� ���� �� �迭�� �����Ͽ� �迭 ������ �ʱ�ȭ�� ��, String �迭�� null�� �ʱⰪ���� ���ȴ�.
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr3[%d]: %s\n", i, arr3[i]);
		}
		
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr3[%d]: %s\n", i, arr3[i]);
		}
	}

}
