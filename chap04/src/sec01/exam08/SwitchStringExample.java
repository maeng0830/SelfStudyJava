package sec01.exam08;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
			
		case "과장":
			System.out.println("500만원");
			break;
			
		default:
			System.out.println("300만원");
			break;
				
		}

	}

}


/*
 1. if, switch
 
 2. 
 o
 o
 o
 x
 
 3.
 등급은 B입니다.
 
 4.
 어떤 혜택을 원하세요?
 우수 회원 혜택을 받으실 수 있습니다.
 일반 회원 혜택을 받으실 수 있습니다.
 감사합니다.
 
*/