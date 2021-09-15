package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20l;
		//long var3 = 10000000000; //int 타입 변수의 허용범위를 초과함. 이럴 경우, 아래와 같이 접미사 l을 통해 long 타입임을 알려줘야함.
		long var4 = 10000000000l;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}

}
