package chap02.test;

import java.util.Scanner;

public class Chap02Test {

	public static void main(String[] args) {
//		//1. 다음 코드에서 컴파일 에러가 발생하는 위치는?
//		byte b = 5;
//		//b = -b; // int 이하의 정수 타입 변수가 연산될 경우, int로 변환되어 연산된다. 그 결과는 int 타입에 저장될 수 있다.
//		int result = 10 / b;
//		System.out.println(result);
//		
//		
//		//2. 다음 코드를 실행했을 때 출력 결과는?
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		System.out.println(z); //31
//		
//		//3. 
//		
//		
//		//4. 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나우어 줄 때 1인당 몇 개를 가질 수 있고, 몇 개가 남는지를 구하는 코드이다.
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
//		//5. 다음 코드를 실행하면 출렬 결과로 5를 기대했는데 4가 출력되었다. 잘못된 곳은?
//		int var1 = 5;
//		int var2 = 2;
//		//double var3 = var1 / var2; // var1과 var2가 실수 타입으로 연산될 수 있도록 수정이 필요하다.
//		double var3 = (double) var1 / var2;
//		int var4 = (int) (var3 * var2);
//		System.out.println(var4);
//		
//		
//		//6. 십의 자리 이하를 버리는 코드입니다. 산술연산자만 사용하여 작성하시오.
//		int value = 356;
//		System.out.println(value / 100 * 100);
//		
//	
//	    //7. 다음 코드의 출력 값으로 "10%입니다."를 기대했는데 "10%가 아닙니다."가 출력되었다. 어디서 잘못되었을까?
//		//float var1 = 10f; 
//		//float var2 = var1 / 100;
//		//double var1 = 10f; 
//		//double var2 = var1 / 100;
//		if(var2 == 0.1) {
//			System.out.println("10%입니다.");
//		} else {
//			System.out.println("10%가 아닙니다.");
//		}
//		
//		
//		//8. 사다리꼴 넓이를 구하는 코드이다. 소수자리가 나올 수 있도록 코드를 작성하라.
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		double area = ( (double) lengthTop + lengthBottom) * height / 2;
//		System.out.println(area);
//		
		
		//9. 키보드로 두 실수를 입력 받는다. 입력된 첫 번째 수에 두 번째 수를 나눈 결과를 "결과:값"으로 출력한다. 두 번째 수에 0 또는 0.0이 입력되었을 경우 "결과:무한대"가 출졀되도록 코드를 작성하라.
//		Scanner kb = new Scanner(System.in);
//		System.out.print("첫 번째 수: ");
//		double num1 = kb.nextDouble();
//		System.out.print("두 번째 수: ");
//		double num2 = kb.nextDouble();
//		
//		if (num2 != 0) {
//			double result = num1 / num2;
//			System.out.println("결과: " + result);
//		} else {
//			System.out.println("결과: 무한대");
//		}
//				

//		//10. 반지름이 10인 원의 넓이를 구하는데 다음과 같이 var2, ".", var3를 + 연산해서 원주율 파이를 얻은 후 계산하려고 한다. 올바르게 수정하라
//		int var1 = 10;
//		int var2 = 3;
//		int var3 = 14;
//		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
//		System.out.println("원의 넓이: " + var4);
		
		
//		//test		
//		int x = 36;
//		int y = 7;
//		int z = 14;
//		//double result = (double) x / y * z; // 72.0 
//		//double result =  x / (double) y * z; // 72.0
//		//double result =  x / y * (double) z; // 70.0
//		double result =  (double) (x / y * z); // 70.0
//		System.out.println(result);
		
		//11. 키보드로 아이디와 패스워드를 입력 받는다. 입력 조건으로 이름은 문자열이고 패스워드는 정수이다. 아이디가 "java", 패스워드가 12345fkaus "로그인 성공 출력". 그렇지 않을 경우 상황에 따라 각기 다른 로그인 실패 메세지를 출력한다.
//		Scanner kb = new Scanner(System.in);
//		
//		System.out.print("아이디: ");
//		String id = kb.nextLine();
//		
//		System.out.print("비밀번호: ");
//		int password = Integer.parseInt(kb.nextLine());
//		
//		if(id.equals("java")) {
//			if(password == 12345) {
//				System.out.println("로그인 성공");
//			} else {
//				System.out.println("로그인 실패: 비밀번호가 틀립니다.");
//			}
//		} else {
//			System.out.println("로그인 실패: 아이디가 틀립니다.");
//		}
	
		
//		//12. 다음 연삭식의 결과는?
//		int x = 10;
//		int y = 5;
//		System.out.println( (x>7) && (y<=5) ); //true
//		System.out.println( (x%3 == 2) || (y%2 != 1) ); // false
//		
//		//13.
//		
//		//14. 다음 코드를 실행했을 때 출력 결과는?
//		int score = 85;
//		String result = (!(score>90)) ? "가" : "나"; //가
//		System.out.println(result);
				
	}

}
