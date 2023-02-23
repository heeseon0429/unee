package Day06;

public class Test01___ {
	
	// 복습 : for 조건문 / while 조건문 / do while 조건문의 차이
	public static void main(String[] args) {

		// for 루프
		for(int count = 1; count <=3; count++) {
			System.out.printf("Hello %d %n", count);
		}
		
		// while  루프
		int count = 5;
		while (count < 5) {					// 변수 count의 값이 5이기 떄문에 while문은 false가 되어 출력되지 않는다
			System.out.println("~~~~~~");	// 출력문 없음
		}
		while(count > 0) {
			System.out.println("-----");	// 5 4 3 2 1로 줄어드는 동안 조건을 만족하므로 5회 출력
			count-- ;						// ----- * 5
		}
		
		
		// do while 루프
		do {
			System.out.println("+++++");	// while조건이 false이더라도 
			count-- ;						// 최소 1번은 수행한 뒤 조건을 확인하므로 1번 출력
		}while(count > 0);
	} 
}
