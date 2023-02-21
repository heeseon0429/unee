package Day04;

public class Test04 {
	
	// 문자열 내 공백제거 및 글자수 세기
	public static void main(String[] args) {
		String msg = null;
		msg = " hello uneeverse .. ";
		
		System.out.println(msg);			// hello uneeverse ..
		System.out.println(msg.length());   // 글자 수 : 20
		
		System.out.println(msg.trim());  	//hello uneeverse ..
		System.out.println(msg);			// hello uneeverse ..
		
		msg = msg.trim();
		System.out.println(msg.length());   // 공백을 제거한 글자 수 : 18
	}
}
