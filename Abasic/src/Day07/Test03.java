package Day07;


public class Test03 {

	// Account 클래스를 만들고 입출금 기능 만들기
	//    - void와 return 의 의미
	//    - this가 가리키는 변수가 무엇인지
	String name;		// 소유주
	String number;		// 계좌번호
	int    money;		// 잔고


	// 출력하다 -- print() 함수에 해당하는 출력문을 지정할 수 있다.
	public void print() {
		System.out.printf("Account[%s(%s) => 잔고 %10d원] %n", this.number, this.name, this.money);
		return;
	}

	// 입금하다 -- input() 함수에 해당하는 명령어와 출력문을 지정할 수 있다.
	public void input(int money) {
		this.money += money;
		System.out.printf("%s 계좌 입금 : %d, 잔고:%d %n", number,money,this.money);
		return;
	}
	
	// 출금하다 -- output() 함수에 해당하는 명령어와 출력문을 지정할 수 있다.
	public int output(int money) {
		if(this.money >=money) {
			this.money -= money;
			System.out.printf("%s 출금 : %d, 잔고 %d원 %n", this.number,money,this.money);
			return money;								   // 함수가 명령을 수행하고 돌아갈 때, money에 해당하는 값은 가지고 돌아가야 한다.
		}else {
			System.out.println("잔고부족");
		}
		return 0;
	}

	// 계좌이체 -- transfer( , , )에 해당하는 명령어와 출력문을 지정할 수 있다
	public void transfer(Test03 from, Test03 to, int money) {
		if(from == null || to == null) {					// 양쪽 계좌에 null값이 들어있지 않도록 유효성검사 추가
			System.out.println("계좌정보 확인 필요");
			return;
			}
		int temp = from.output(money);
		if(temp == 0) {
			System.out.println("계좌이체 실패");
			return;
		}
		to.input(temp);
		System.out.println("계좌이체 성공");
		to.input(from.output(money));
	}
}
