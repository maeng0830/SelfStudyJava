package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A'; //문자로 직접 저장
		char c2 = 65; //10진수로 저장
		char c3 = 0x0041; //16진수로 저장
		char c4 = '\u0041'; //16진수 유니코드로 저장
		
		char c5 = '가';
		char c6 = 44032;
		char c7 = 0xac00;
		char c8 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		

	}

}
