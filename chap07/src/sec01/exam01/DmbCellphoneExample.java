package sec01.exam01;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		//DmbCellphone ��ü ����
		DmbCellphone dmbCellphone = new DmbCellphone("������s9", "������", 10);
		
		//Cellphone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellphone.model);
		System.out.println("����: " + dmbCellphone.color);
		
		//DmbCellphone Ŭ������ �ʵ�
		System.out.println("ä��: " + dmbCellphone.channel);
		
		//Cellphone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("��������?");
		dmbCellphone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
		dmbCellphone.sendVoice("�� �ݰ����ϴ�!");
		dmbCellphone.hangup();
		
		//DmbCellphone Ŭ������ �޼�Ʈ ȣ��
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();

	}

}
