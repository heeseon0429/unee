package Day05;

public class Test16 {

	// for문의 활용
	// 1 ~ ? 합이 500이 넘는 자연수 구하기
	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		// 1 ~ ? 합이 500이 넘는 자연수
		for (num = 1;  ;  num++) {
			sum += num;
			if (sum >= 500) break;		// 조건식이 없을 경우 무한루프가 된다.
		}
		System.out.println(sum);
		System.out.println(num);
		
		}
		
	}

