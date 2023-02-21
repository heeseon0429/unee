package Day04;

public class Test07 {

	// null 값에 의한 오류를 방지하는 코드 작성과 유의사항
	public static void main(String[] args) {
		String name = "윤희선";
		if(name != null && name.length() > 0) {
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
		return;	
	}
}
