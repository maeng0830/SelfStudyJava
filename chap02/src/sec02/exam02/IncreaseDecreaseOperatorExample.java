package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++;
		++x;
		System.out.println("x= " + x); //12
		
		System.out.println("------------------");
		y--;
		--y;
		System.out.println("y= " + y); //8
		
		
		System.out.println("------------------");
		z = x++; // z에 x가 먼저 대입되고, x에 x+1가 대입된다.
		System.out.println("z= " + z); //12
		System.out.println("x= " + x); //13
		
		
		System.out.println("------------------");
		z = ++x; // x에 x+1이 먼저 대입되고, z에 x가 대입된다.
		System.out.println("z= " + z); //14
		System.out.println("x= " + x); //14
		
		
		System.out.println("------------------");
		z = ++x + y++; //x에 x+1 대입, x+y, z에 x+y 대입, y에 y+1 대입
		System.out.println("z= " + z); //23
		System.out.println("x= " + x); //15
		System.out.println("y= " + y); //9

	}

}
