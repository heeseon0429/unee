package Day05;

public class Test19 {

	 //대소문자가 섞여 있을 때 대문자로만 출력하기 -- StringBuilder 혹은 StringBuffer의 사용
	 //String으로 + - 연산을 하여 변수에 저장하거나 출력하게 될 경우 성능이 저하되기에 사용하지 않는다.
	 
	/*
	 * StringBuilder 변수이름 = new StringBuilder();
	 * for문을 비롯한 함수 {
	 * 		sb.append();
	 * 	}
	 * result = 변수이름.toString();
	 */

	/*
	 * StringBuffer 변수이름 = new StringBuffer();
	 * for문을 비롯한 함수{
	 * 	sb.append();
	 * }
	 * result = 변수이름.toString();
	 */
	
	/*
	 * for (int=0; i<msg.length(); i++)    :   int는 1부터 시작 : 1 2 3 4 5 6 7 8
	 * for (int=0; i<msg.length()-1; i++)  :   int는 0부터 시작 : 1 2 3 4 5 6 7 8
	 */
	public static void main(String[] args) {

		String msg = "abcdEFGhijk";
		String result = "";
		System.out.println(msg); 									// 출력문 : abcdEFGhijk 

		StringBuilder sb = new StringBuilder();						// 확인 및 변환이 끝난 문자열을 저장해두는 메소드
		for(int i=0; i<msg.length(); i++) {							
			char a = msg.charAt(i);									// 문자열에서 1글자씩 추출한다.
			char b = 'a' <= a && a <= 'z' ? (char) (a -32) : a;		// 소문자인지 확인하고 맞을 경우 대문자로 변환한다.
			sb.append(b);
		}
		result = sb.toString();										// 저장해둔 sb의 데이터들을 변수 result에 대입한다.
		System.out.println(result);									// 출력문 : ABCDEFGHIJK

		return;
	}

}

