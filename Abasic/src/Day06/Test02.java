package Day06;

public class Test02 {

	// for조건문과 if조건문의 혼합 : 1~1000 정수 중 5의 배수의 합 구하기
	// 변수를 선언하는 위치에 따라 다른 결곽가 나오므로, 위치 선정은 중요하다.
	public static void main(String[] args) {

		int sum = 0;							// 루프 내에서 변수를 선언하면 루프마다 sum의 값이 0으로 초기화되버리므로
		for(int num =1; num <=10; num++) {
			//int sum = 0;  					// 변수를 선언하는 위치는 중요하다
			
			if(num % 5 == 0) {
				System.out.printf("%d ", num);	// if조건문을 충족하는 수를 확인하기 위해 출력해본다
			sum += num;
			}
		}
		System.out.println();					// 5  10
		System.out.println(sum);				// 15
	}
}
