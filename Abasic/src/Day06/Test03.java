package Day06;

import java.util.Scanner;

public class Test03 {

	// 스캐너 사용과 자원반납
	/*
	 * import java.util.Scanner; : 스캐너 사용을 위한 메소드 패키지 불러오기
	 * Scanner 타입의 초기값은 null 값으로 설정하고, 사용 후 반납할 떄도 null 값을 대입
	 * Scanner 타입 변수에 데이터를 입력하기 위해, 객체 생성 후 (system.in); 메소드를 사용
	 * Scanner를 통해 입력된 데이터를 String 타입 변수에 대입하기 위해 .nextLine() 메소드를 사용
	 */
	public static void main(String[] args) {

		Scanner keyboard = null;				// 불러온 스캐너를 null값으로 초기화
		
		keyboard = new Scanner(System.in);		// 변수 keyboard에 system.in입력값을 대입하도록 객체를 생성
		System.out.println("이름을 입력하세요");		// 데이터 입력을 위한 안내문 출력
		String name = keyboard.nextLine();		// String타입 변수 name에 keyboard.nextLine()으로 입력값을 대입
		
		if(keyboard != null) {					// keyboard의 값이 null이 아닌 경우는 자원을 사용한 때이므로
			System.out.println("자원반납 블럭");	
			keyboard.close();					// 사용한 자원을 반남하고
			keyboard = null;			 		// keyboard에는 원래대로 null값을 대입
		}
		
		System.out.printf("%s 헌터%n", name);
		System.out.println("====End====");
		
		
	}
}
