package sec02.exam01;

public class VgaExample {

	public static void main(String[] args) {
		//��ü ����
		Vga myVga = new Vga();
		
		//�ʵ尪 �б�
		System.out.println("���� ȸ��: " + myVga.company);
		System.out.println("�𵨸�: " + myVga.model);
		System.out.println("����: " + myVga.color);
		System.out.println("�ְ�Ŭ��: " + myVga.maxClock);
		System.out.println("����Ŭ��: " + myVga.clock);
		
		//�ʵ尪 ����
		myVga.clock = 1300;
		System.out.println("����� Ŭ��: " + myVga.clock);
		
	}

}
