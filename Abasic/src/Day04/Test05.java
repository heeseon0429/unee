package Day04;

public class Test05 {
	
	// chatAt()를 사용하여 특정 위치의 문자열을 꺼내기
	public static void main(String[] args) {
		String msg = null;
		msg = " hello uneeverse...! ";
		
		System.out.println(msg);			// hello uneeverse...!
		//System.out.println(msg.length());	// 21
		msg = msg.trim().toUpperCase();		// 공백 제거 후 대문자로 변경
		System.out.println(msg.length());   // 19
		
		
		/*
		 * 문자열은 각자 위치 인덱스를 가지고 있어서 특정 위치의 문자열을 .charAt() 메소드를 사용하여 꺼낼 수 있다.
		 * 단, 존재하지 않는 위치의 문자열을 꺼내려 할 경우 오류가 발생한다.
		 */
		
		System.out.println(msg.charAt(0));
		System.out.println(msg.charAt(4));
		System.out.println(msg.charAt(12));
		
		// 마지막 문자
		System.out.println(msg.charAt(msg.length()-1));
	}
}
