package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println("���� �������̽� �� InterfaceA�� �޼ҵ常 ȣ�� ����");
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println("���� �������̽� �� InterfaceB�� �޼ҵ常 ȣ�� ����");
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println("InterfaceC�� InterfaceA�� InterfaceB�� ����ϴ� ���� �������̽��̹Ƿ� ������ �������̽��� �޼ҵ带 ��� ȣ�� ����");

	}

}
