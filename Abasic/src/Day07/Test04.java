package Day07;

	// 접근 제한 처리와 접근 지정자 + setter, getter 인캡슐레이션
	//   - public은 다른 패키지에 있어도 접근하여 사용할 수 있다
	//   - private은 같은 클래스 내에 있더라도 {브레이스} 밖에 있을 경우에는 접근할 수 없으며 setter, getter를 이용해야 한다.

	public class Test04 {

		private String   name;		// 소유주
		private String   number;	// 계좌번호
		private int 	 money;		// 잔고
		
		// 인캡슐레이션 - 히든 처리한 변수를 외부에서 접근할 수 있도록 setter, getter를 생성해준다.
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
				System.out.println("money 확인 필요");
			}
			this.money = money;
		}
		
		
		
		
		

		
}
