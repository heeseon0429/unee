package Day05;

public class Test01 {

	/* 
	 * for문을 사용한 동일한 문장 n회 출력하기
	 * for (초기값 설정; 조건식; 증감식) { }
	 * for 루프 안에서 선언된 변수의 scope --- 아무 조건을 설정하지 않으면 무한루프가 발생하여 에러가 난다.
	 */
	
	public static void main(String[] args) {
		
		// (1)
		for(int i=0; i<3; i++) {
			System.out.println("hello uneeverse");
			System.out.println(i);
		}
		
		// (2)
		for(int i=0; i<3; i++) {
			System.out.printf("hello uneeverse %d %n", i);
		}
		
		
		return;
	}

}
