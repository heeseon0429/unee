package Day07;

	// ���� ���� ó���� ���� ������ + setter, getter ��ĸ�����̼�
	//   - public�� �ٸ� ��Ű���� �־ �����Ͽ� ����� �� �ִ�
	//   - private�� ���� Ŭ���� ���� �ִ��� {�극�̽�} �ۿ� ���� ��쿡�� ������ �� ������ setter, getter�� �̿��ؾ� �Ѵ�.

	public class Test04 {

		private String   name;		// ������
		private String   number;	// ���¹�ȣ
		private int 	 money;		// �ܰ�
		
		// ��ĸ�����̼� - ���� ó���� ������ �ܺο��� ������ �� �ֵ��� setter, getter�� �������ش�.
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			if(money < 0) {
				System.out.println("money Ȯ�� �ʿ�");
			}
			this.money = money;
		}
		
		
		
		
		

		
}
