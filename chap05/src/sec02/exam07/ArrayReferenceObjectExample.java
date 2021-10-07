package sec02.exam07;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		//string 변수와 마찬가지로 string 배열도 객체의 번지를 참조한다. 
		//new 연산자를 통해 문자열 생성할 경우, 무조건 새로운 객체가 생성되기 때문에 문자열이 같더라도 다른 객체 번지를 갖게된다. 
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]); //true
		System.out.println(strArray[0] == strArray[2]); //false
		System.out.println(strArray[0].equals(strArray[2])); //true
		

	}

}
