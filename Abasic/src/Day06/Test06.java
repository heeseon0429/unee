package Day06;

public class Test06 {

	// 배열에 있는 모든 값을 더하는 프로그램
	public static void main(String[] args) {
		int[] age = {25, 20, 38, 30, 15};
		int sum = 0;
		for(int data : age) {
			sum += data;
		}
		System.out.printf("sum = %d %n", sum);
	}

}
