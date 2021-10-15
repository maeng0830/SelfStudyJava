package sec02.exam01;

public class VgaExample {

	public static void main(String[] args) {
		//객체 생성
		Vga myVga = new Vga();
		
		//필드값 읽기
		System.out.println("제작 회사: " + myVga.company);
		System.out.println("모델명: " + myVga.model);
		System.out.println("색상: " + myVga.color);
		System.out.println("최고클럭: " + myVga.maxClock);
		System.out.println("현재클럭: " + myVga.clock);
		
		//필드값 변경
		myVga.clock = 1300;
		System.out.println("변경된 클럭: " + myVga.clock);
		
	}

}
