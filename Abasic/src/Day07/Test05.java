package Day07;

public class Test05 {

	// 다른 클래스에서 데이터를 불러와서 사용하기 1
	public static void main(String[] args) {
	
		// 다른 클래스에서 데이터를 불러오기
		// Test03 클래스가 day07 패키지에 없으면 에러가 발생하므로, Test03 클래스를 만들어주면 해결
		Test03 a0 = new Test03();
		a0.print();					// 출력문 : Account[null(null) => 잔고          0원] 
									// 데이터가 입력되어 있지 않음을 알 수 있다.
		
		// 클래스를 만들고, 이를 기반으로 객체 생성하고 출력하기
		Test03 a1 = new Test03();
		a1.name   = "윤희선";
		a1.number = "2023-02";
		a1.money  = 5000000;
		a1.print();					// Account[2023-02(윤희선) => 잔고    5000000원] 
		
		Test03 a2 = new Test03();
		a2.name   = "손흥민";
		a2.number = "2023-02";
		a2.money  = 500000000;
		a2.print();					// Account[2023-02(손흥민) => 잔고  500000000원]
	
		
//		Person p0 = new Person();
//		p0.print();
//		Person p1 = new Person();
//		p1.print();
//		Person p2 = new Person();
//		p2.print();
	}

}
