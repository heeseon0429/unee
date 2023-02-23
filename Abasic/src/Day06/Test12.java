package Day06;

public class Test12 {

	// String 타입에서 원하는 위치 인덱스의 문자열을 출력할 수 있다
	public static void main(String[] args) {

		// 요청정보를 추출하고자 할 때 사용하는 메소드 API
		String url = "http://myweb/admin/login.do";
		
		System.out.println(url.substring(3));		// 3 위치에서 마지막까지 출력

		System.out.println(url.substring(20));		// 20 위치에서 마지막까지 출력
		
		System.out.println(url.substring(3,6));     // 3 ~ 6 // 6 전까지 출력
		
		System.out.println(url.indexOf('/'));		// (/)가 있는 위치 인덱스를 출력
		
		System.out.println(url.lastIndexOf('/'));	// 마지막 (/)가 있는 위치 인덱스를 출력
	}

}
