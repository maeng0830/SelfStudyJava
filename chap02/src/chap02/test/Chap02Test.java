package chap02.test;

import java.util.Scanner;

public class Chap02Test {

	public static void main(String[] args) {
//		//1. ���� �ڵ忡�� ������ ������ �߻��ϴ� ��ġ��?
//		byte b = 5;
//		//b = -b; // int ������ ���� Ÿ�� ������ ����� ���, int�� ��ȯ�Ǿ� ����ȴ�. �� ����� int Ÿ�Կ� ����� �� �ִ�.
//		int result = 10 / b;
//		System.out.println(result);
//		
//		
//		//2. ���� �ڵ带 �������� �� ��� �����?
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		System.out.println(z); //31
//		
//		//3. 
//		
//		
//		//4. 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ����� �� �� 1�δ� �� ���� ���� �� �ְ�, �� ���� �������� ���ϴ� �ڵ��̴�.
//		int pencils = 534;
//		int students = 30;
//		
//		int pencilsPerStudent = pencils / students;
//		System.out.println(pencilsPerStudent);
//		
//		int pencilsLeft = pencils % students;
//		System.out.println(pencilsLeft);
//		
//		
//		//5. ���� �ڵ带 �����ϸ� ��� ����� 5�� ����ߴµ� 4�� ��µǾ���. �߸��� ����?
//		int var1 = 5;
//		int var2 = 2;
//		//double var3 = var1 / var2; // var1�� var2�� �Ǽ� Ÿ������ ����� �� �ֵ��� ������ �ʿ��ϴ�.
//		double var3 = (double) var1 / var2;
//		int var4 = (int) (var3 * var2);
//		System.out.println(var4);
//		
//		
//		//6. ���� �ڸ� ���ϸ� ������ �ڵ��Դϴ�. ��������ڸ� ����Ͽ� �ۼ��Ͻÿ�.
//		int value = 356;
//		System.out.println(value / 100 * 100);
//		
//	
//	    //7. ���� �ڵ��� ��� ������ "10%�Դϴ�."�� ����ߴµ� "10%�� �ƴմϴ�."�� ��µǾ���. ��� �߸��Ǿ�����?
//		//float var1 = 10f; 
//		//float var2 = var1 / 100;
//		//double var1 = 10f; 
//		//double var2 = var1 / 100;
//		if(var2 == 0.1) {
//			System.out.println("10%�Դϴ�.");
//		} else {
//			System.out.println("10%�� �ƴմϴ�.");
//		}
//		
//		
//		//8. ��ٸ��� ���̸� ���ϴ� �ڵ��̴�. �Ҽ��ڸ��� ���� �� �ֵ��� �ڵ带 �ۼ��϶�.
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		double area = ( (double) lengthTop + lengthBottom) * height / 2;
//		System.out.println(area);
//		
		
		//9. Ű����� �� �Ǽ��� �Է� �޴´�. �Էµ� ù ��° ���� �� ��° ���� ���� ����� "���:��"���� ����Ѵ�. �� ��° ���� 0 �Ǵ� 0.0�� �ԷµǾ��� ��� "���:���Ѵ�"�� �����ǵ��� �ڵ带 �ۼ��϶�.
//		Scanner kb = new Scanner(System.in);
//		System.out.print("ù ��° ��: ");
//		double num1 = kb.nextDouble();
//		System.out.print("�� ��° ��: ");
//		double num2 = kb.nextDouble();
//		
//		if (num2 != 0) {
//			double result = num1 / num2;
//			System.out.println("���: " + result);
//		} else {
//			System.out.println("���: ���Ѵ�");
//		}
//				

//		//10. �������� 10�� ���� ���̸� ���ϴµ� ������ ���� var2, ".", var3�� + �����ؼ� ������ ���̸� ���� �� ����Ϸ��� �Ѵ�. �ùٸ��� �����϶�
//		int var1 = 10;
//		int var2 = 3;
//		int var3 = 14;
//		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
//		System.out.println("���� ����: " + var4);
		
		
//		//test		
//		int x = 36;
//		int y = 7;
//		int z = 14;
//		//double result = (double) x / y * z; // 72.0 
//		//double result =  x / (double) y * z; // 72.0
//		//double result =  x / y * (double) z; // 70.0
//		double result =  (double) (x / y * z); // 70.0
//		System.out.println(result);
		
		//11. Ű����� ���̵�� �н����带 �Է� �޴´�. �Է� �������� �̸��� ���ڿ��̰� �н������ �����̴�. ���̵� "java", �н����尡 12345fkaus "�α��� ���� ���". �׷��� ���� ��� ��Ȳ�� ���� ���� �ٸ� �α��� ���� �޼����� ����Ѵ�.
//		Scanner kb = new Scanner(System.in);
//		
//		System.out.print("���̵�: ");
//		String id = kb.nextLine();
//		
//		System.out.print("��й�ȣ: ");
//		int password = Integer.parseInt(kb.nextLine());
//		
//		if(id.equals("java")) {
//			if(password == 12345) {
//				System.out.println("�α��� ����");
//			} else {
//				System.out.println("�α��� ����: ��й�ȣ�� Ʋ���ϴ�.");
//			}
//		} else {
//			System.out.println("�α��� ����: ���̵� Ʋ���ϴ�.");
//		}
	
		
//		//12. ���� ������� �����?
//		int x = 10;
//		int y = 5;
//		System.out.println( (x>7) && (y<=5) ); //true
//		System.out.println( (x%3 == 2) || (y%2 != 1) ); // false
//		
//		//13.
//		
//		//14. ���� �ڵ带 �������� �� ��� �����?
//		int score = 85;
//		String result = (!(score>90)) ? "��" : "��"; //��
//		System.out.println(result);
				
	}

}
