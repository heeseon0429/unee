package Day06;

public class Test08 {

	// 메인함수에서 args의 의미
	/* 프로그램을 실행할 때 넘겨주는 연속적인 값이 들어있는 String타입의 배열이다.
	 * 메인함수의 매개변수로 쓰일 수 있다.
	 */
	public static void main(String[] args) {

		System.out.println(args.length); 			// arg에 데이터가 비어있으면 0으로 출력
		System.out.println("==== End ====");        // args는 실행타임에 필요한 정보를 넘겨받는 통로
		
		                                            // 재생표시 옆 - run Configuration -Arguments 
													// 			Program Arguments에 데이터 입력
													//
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}											
	}

}
