package sec01.exam07.pack2;
import sec01.exam07.pack1.A;

public class D extends A {
	public D() {
		//protected 접근제한은 다른패키지더라도 자식 클래스에서 접근 가능하다. 
		super();
		this.field = "value";
		this.method();
	}

}
