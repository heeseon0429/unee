package Day06;

public class Test11 {

	// String 타입 데이터를 char 타입 배열로 변환한 뒤, 한 글자씩 출력할 수 있다.
	public static void main(String[] args) {

		String s1 = "unee";

		char[] c = s1.toCharArray();									// String에서 char의 배열로 바꾸는 메소드

		System.out.println(c);											// 출력 : unee

		for(char data : c) {											// char타입 배열 c에 저장된 데이터를 하나씩 불러오는 반복문
			System.out.printf("%c ==> %c %n", data, (char)(data-32));	// 배열에 들어있는 데이터를 연산 후 char 타입으로 캐스팅
		}

	}

}
