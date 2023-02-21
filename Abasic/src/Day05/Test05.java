package Day05;

public class Test05 {

	/*
	 * for문을 사용한 조건식을 만족하는 값의 출력
	 * 1~100 정수 중. 3의 배수이면서 5의 배수인 수의 합
	 */
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.printf(" %d +", i);
			}
			sum = sum + i;
		}
		System.out.printf(" =%d", sum);
		return;
	}

}
