package Day07;

public class Test05 {

	// �ٸ� Ŭ�������� �����͸� �ҷ��ͼ� ����ϱ� 1
	public static void main(String[] args) {
	
		// �ٸ� Ŭ�������� �����͸� �ҷ�����
		// Test03 Ŭ������ day07 ��Ű���� ������ ������ �߻��ϹǷ�, Test03 Ŭ������ ������ָ� �ذ�
		Test03 a0 = new Test03();
		a0.print();					// ��¹� : Account[null(null) => �ܰ�          0��] 
									// �����Ͱ� �ԷµǾ� ���� ������ �� �� �ִ�.
		
		// Ŭ������ �����, �̸� ������� ��ü �����ϰ� ����ϱ�
		Test03 a1 = new Test03();
		a1.name   = "����";
		a1.number = "2023-02";
		a1.money  = 5000000;
		a1.print();					// Account[2023-02(����) => �ܰ�    5000000��] 
		
		Test03 a2 = new Test03();
		a2.name   = "�����";
		a2.number = "2023-02";
		a2.money  = 500000000;
		a2.print();					// Account[2023-02(�����) => �ܰ�  500000000��]
	
		
//		Person p0 = new Person();
//		p0.print();
//		Person p1 = new Person();
//		p1.print();
//		Person p2 = new Person();
//		p2.print();
	}

}
