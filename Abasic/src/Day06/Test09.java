package Day06;

public class Test09 {

	// String 타입으로 입력한 데이터를 역순으로 출력하기
	/* 
	 * 1) 역순으로 출력하기 위해 for 조건문 내의 변수 i의 초기값을 변수의 길이-1로 설정
	 *   : 데이터의 주소 인덱스는 0,1,2,3 ...이기 때문
	 * 2) for 조건문 내에서 루프는 i=0이 될 때까지 진행
	 * 3) StringBuilder 클래스는 사용하면 for 조건문 내에 .append()메소드를 삽입하고,
	 *    조건문 이후에는 .toString() 메소드로 String 타입 변수에 저장한 데이터를 대입한다.
	 */
	public static void main(String[] args) {

		// 입력한 데이터를 역순으로 추출해보기
		String msg = "Hello unee, cookie love";
		
		for(int i = msg.length()-1; i>=0; i--) {
			System.out.print(msg.charAt(i));
		}
		System.out.println();
		System.out.println("===================");
		
		String result = "";							// 문자열에 +- 연산을 사용하지 않도록 StringBuilder 활용
		StringBuilder sb = new StringBuilder();
		for(int i = msg.length()-1; i>=0; i--) {
			sb.append(msg.charAt(i));
		}
		result = sb.toString();
		System.out.println(result);
	}

}
