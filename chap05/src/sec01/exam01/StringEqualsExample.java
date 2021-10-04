package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		//string 변수에 동일한 리터럴을 사용하여 초기화할 경우, 동일한 리터럴이 사용된 string 변수들은 동일한 객체를 참조하게 된다. 
		String strVar1 = "kmk";
		String strVar2 = "kmk";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음.");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음.");
		}
		
		//new를 통해 각각의 객체를 생성하고 
		String strVar3 = new String("kmk");
		String strVar4 = new String("kmk");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음.");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음.");
		}

	}

}
