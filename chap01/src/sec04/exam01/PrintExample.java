package sec04.exam01;

public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("��ǰ�� ����:%d��\n", value); 
		System.out.printf("��ǰ�� ����:%6d��\n", value); //6�ڸ� ����, ���� ���ڸ� ����
		System.out.printf("��ǰ�� ����:%-6d��\n", value); //6�ڸ� ����, ������ ���ڸ� ����
		System.out.printf("��ǰ�� ����:%06d��\n", value); //6�ڸ� ����, ���� ���ڸ� 0 
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����: %10.2f\n", 10, area); //�� 10�ڸ� �Ǽ�(. ����), �Ҽ��� ���� 2�ڸ�, ���� ���ڸ� ����
		System.out.printf("�������� %d�� ���� ����: %-10.2f\n", 10, area); //�� 10�ڸ� �Ǽ�(. ����), �Ҽ��� ���� 2�ڸ�, ������ ���ڸ� ����
		System.out.printf("�������� %d�� ���� ����: %010.2f\n", 10, area); //�� 10�ڸ� �Ǽ�(. ����), �Ҽ��� ���� 2�ڸ�, ���� ���ڸ� 0
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
	}

}
