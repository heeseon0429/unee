package Day05;

public class Test02 {

	// for문을 사용한 1~100까지 합계
	public static void main(String[] args) {

		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum = sum + i;
			System.out.printf("%d + ", i);
		}
		System.out.printf("= %d %n", sum);
		 return;
	}

}
