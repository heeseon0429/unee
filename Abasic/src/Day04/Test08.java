package Day04;

public class Test08 {

	// 글자수에 따라 다르게 출력하기 (입력값이 2글자일 떄의 조건문 삽입)
	public static void main(String[] args) {
		String name = "윤희선";
		if(name.length() > 0) {
			if(name.length() == 2) {
				System.out.printf("%c* %n", name.charAt(0));
			}
			else {
				System.out.printf("%c** %n", name.charAt(0));
				System.out.printf("%c*%c %n", name.charAt(0), name.charAt(name.length()-1));
			}
		}
		else {
			System.out.println("1글자 이상 입력해주세요");

		}
	}
}
