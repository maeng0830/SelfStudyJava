package sec01.exam11;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception {
		//Ű����� ���� �ƺ�Ʈ�� �����ϱ� ���� �迭 ����
		byte[] bytes = new byte[100];
		
		System.out.println("�Է�: ");
		//�迭�� ������ ����Ʈ�� �����ϰ�, ���� ����Ʈ ���� ����
		int readByteNo = System.in.read(bytes);
		
		//�迭�� ���ڿ��� ��ȯ
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);

	}

}
