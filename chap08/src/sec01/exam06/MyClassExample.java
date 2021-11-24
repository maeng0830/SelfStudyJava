package sec01.exam06;

import sec01.exam04.Audio;
import sec01.exam04.Television;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)_________________");
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)_________________");
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)_________________");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)_________________");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());

	}

}
