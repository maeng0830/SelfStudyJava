package sec01.exam11;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception {
		//키보드로 읽은 아비트를 저장하기 위한 배열 생성
		byte[] bytes = new byte[100];
		
		System.out.println("입력: ");
		//배열에 ㅇ릭은 바이트를 저장하고, 읽은 바이트 수를 리턴
		int readByteNo = System.in.read(bytes);
		
		//배열을 문자열로 변환
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);

	}

}
