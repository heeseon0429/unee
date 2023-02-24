package Day07;


public class Test03 {

	// Account Ŭ������ ����� ����� ��� �����
	//    - void�� return �� �ǹ�
	//    - this�� ����Ű�� ������ ��������
	String name;		// ������
	String number;		// ���¹�ȣ
	int    money;		// �ܰ�


	// ����ϴ� -- print() �Լ��� �ش��ϴ� ��¹��� ������ �� �ִ�.
	public void print() {
		System.out.printf("Account[%s(%s) => �ܰ� %10d��] %n", this.number, this.name, this.money);
		return;
	}

	// �Ա��ϴ� -- input() �Լ��� �ش��ϴ� ��ɾ�� ��¹��� ������ �� �ִ�.
	public void input(int money) {
		this.money += money;
		System.out.printf("%s ���� �Ա� : %d, �ܰ�:%d %n", number,money,this.money);
		return;
	}
	
	// ����ϴ� -- output() �Լ��� �ش��ϴ� ��ɾ�� ��¹��� ������ �� �ִ�.
	public int output(int money) {
		if(this.money >=money) {
			this.money -= money;
			System.out.printf("%s ��� : %d, �ܰ� %d�� %n", this.number,money,this.money);
			return money;								   // �Լ��� ����� �����ϰ� ���ư� ��, money�� �ش��ϴ� ���� ������ ���ư��� �Ѵ�.
		}else {
			System.out.println("�ܰ����");
		}
		return 0;
	}

	// ������ü -- transfer( , , )�� �ش��ϴ� ��ɾ�� ��¹��� ������ �� �ִ�
	public void transfer(Test03 from, Test03 to, int money) {
		if(from == null || to == null) {					// ���� ���¿� null���� ������� �ʵ��� ��ȿ���˻� �߰�
			System.out.println("�������� Ȯ�� �ʿ�");
			return;
			}
		int temp = from.output(money);
		if(temp == 0) {
			System.out.println("������ü ����");
			return;
		}
		to.input(temp);
		System.out.println("������ü ����");
		to.input(from.output(money));
	}
}
