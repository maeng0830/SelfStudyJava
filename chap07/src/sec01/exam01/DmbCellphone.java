package sec01.exam01;

public class DmbCellphone extends Cellphone {
	//필드
	int channel;
	
	//생성자
	DmbCellphone(String model, String color, int channel) {
		//model과 color는 CellPhone클래스로부터 상속받은 필드
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방속 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 변경합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}

}
