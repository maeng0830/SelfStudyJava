package sec06.exam02.mycompany;

import sec06.exam02.hankook.*;
import sec06.exam02.kumho.*;
import sec06.exam02.hyundai.Engine;

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire(); //다른 패키지에 있는 동일한 이름의 클래스를 사용할 경우, 올바른 인식을 위해 전체클래스명(패키지 + 클래스)을 작성해야한다.
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire(); //다른 패키지에 있는 동일한 이름의 클래스를 사용할 경우, 올바른 인식을 위해 전체클래스명(패키지 + 클래스)을 작성해야한다.

}
