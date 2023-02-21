package Day05;

public class Test03 {
	
	//for문을 사용한 1~100까지 짝수 합계
	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
				System.out.printf("%d + ", i);
			}
		}
		System.out.printf(" = %d", sum);
		return;
	}
}
