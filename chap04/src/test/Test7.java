package test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("--------------------------------");
			System.out.print("����> ");
			int choice = Integer.parseInt(scanner.nextLine());
			
			
			if(choice == 1) {
				System.out.print("���ݾ�>");
				balance += Integer.parseInt(scanner.nextLine());
			} else if(choice == 2) {
				System.out.print("��ݾ�>");
				balance -= Integer.parseInt(scanner.nextLine());
			} else if(choice == 3) {
				System.out.print("�ܰ�>");
				System.out.println(balance);
			} else if(choice == 4) {
				System.out.print("���α׷� ����");
				break;
			}
		}

	}

}
