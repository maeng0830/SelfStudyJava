package test02;

import java.util.Scanner;

public class item06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("______________________________________________");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("______________________________________________");
			System.out.print("����> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				continue;
			} else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[i]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				continue;
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
			} else if(selectNo == 4) {
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				System.out.println("�ְ� ����: " + sum);
				System.out.println("��� ����: " + (double) sum / scores.length);
				continue;
			} else if (selectNo == 5) {
				break;
			}
		}
		
		System.out.println("���α׷� ����");
	}

}
