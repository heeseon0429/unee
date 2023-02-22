package Day05;

public class Test18 {

	
	// for문 활용 -- 1글자씩 추출하여 대문자로 변환하기
	public static void main(String[] args) {
		
		String msg = "unee...★";
		System.out.println(msg);
		
		for(int i=0; msg != null && i <msg.length(); i++) {			// 변수값에 null이 들어가는 경우에도
			char a = msg.charAt(i);									// 에러가 발생하지 않도록 구성해야 한다.
			char c = (a >= 'a' && a <= 'z') ? (char) (a -32) : a;
			System.out.printf("msg(%d) %c => %c %n" , i,a,c);
		}
		
		return;
		
		}
		
	}

