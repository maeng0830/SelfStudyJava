package sec02.test03;

public class MysqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("Mysql DB���� �˻�");
	}
	
	public void insert() {
		System.out.println("Mysql DB���� ����");
	}
	
	public void update() {
		System.out.println("Mysql DB���� ����");
	}
	
	public void delete() {
		System.out.println("Mysql DB���� ����");
	}

}
