package Day05;

public class Test17 {

	
	// 비효율적인 코드 중복을 for문으로 고칠 수 있다.
	public static void main(String[] args) {
		
		String msg = "unee...★";
		System.out.println(msg);
//		System.out.println(msg.charAt(0));
//		System.out.println(msg.charAt(1));
//		System.out.println(msg.charAt(2));
//		System.out.println(msg.charAt(3));
//		System.out.println(msg.charAt(5));		// 코드 중복으로 비효율
		
		for(int i=0; msg != null && i <msg.length(); i++)		// 변수값에 null이 들어가는 경우에도
			System.out.println(msg.charAt(i));					// 에러가 발생하지 않도록 구성해야 한다.
		
		return;
		
		}
		
	}

