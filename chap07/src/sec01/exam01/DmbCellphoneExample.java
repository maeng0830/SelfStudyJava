package sec01.exam01;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		//DmbCellphone 객체 생성
		DmbCellphone dmbCellphone = new DmbCellphone("갤럭시s9", "로즈골드", 10);
		
		//Cellphone 클래스로부터 상속받은 필드
		System.out.println("모델: " + dmbCellphone.model);
		System.out.println("색상: " + dmbCellphone.color);
		
		//DmbCellphone 클래스의 필드
		System.out.println("채널: " + dmbCellphone.channel);
		
		//Cellphone 클래스로부터 상속받은 메소드 호출
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요?");
		dmbCellphone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		dmbCellphone.sendVoice("아 반갑습니다!");
		dmbCellphone.hangup();
		
		//DmbCellphone 클래스의 메소트 호출
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();

	}

}
