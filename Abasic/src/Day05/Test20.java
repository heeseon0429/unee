package Day05;

public class Test20 {

	 // Cisear Cipher 기법을 사용하여 문자열을 암호화하고 출력하기
	
	public static void main(String[] args) {

		String sourceString = "everyday we have is one more than we deserve";
		String encodeString = "";
		
		StringBuilder sb = new StringBuilder();		// 문자열을 연산한 뒤 저장하도록 StringBuilder 메소드 사용
		
		for(int i=0; i<sourceString.length(); i++) {// 0부터 시작하여 글자수만큼 진행하도록 조건식과 증감식 구성
			char a = sourceString.charAt(i);		// sourceString 변수에 저장된 데이터를 1개씩 불러온다.
			char b = 'a' <= a && a <= 'w' ? (char)(a+3) : (a=='x'||a=='y'||a=='z' ? (char)(a-23) : a);
			
			sb.append(b);
		}
		
		encodeString = sb.toString();
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화할 문자열 : " + encodeString);
	}

}

