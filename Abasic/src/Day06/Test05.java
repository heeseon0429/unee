package Day06;

public class Test05 {

	// 배열에서 "String타입 데이터"와 익명 처리 및 유효성 검사
	/* 배열애서 데이터를 1개씩 꺼내고자 할 때 for 조건문을 사용할 수 있다.
	 * 배열의 길이에 대해 .length 메소드를 사용할 때는 ()를 사용하지 않는다.
	 * 배열에 null값이나 공백이 들어가 있지 않도록 if 조건문을 사용한 유효성 검사를 할 수 있다.
	 * for (String data : 변수){}형식으로 사용할 때 배열의 길이에 대한 .length()메소드에서는 ()를 사용한다.
	 */
	public static void main(String[] args) {
		
		// 배열에서 익명 처리 및 유효성 검사
		String[] names = {"이세희","윤희선","오현경","오지연","전은진"}; 	// 데이터에 " "가 있을 경우 에러가 발생한다.
		
		for (int i=0; i <names.length; i++) {
			System.out.printf("%c** %n", names[i].charAt(0));
		}
		System.out.println("=======================");
		
		
		// 새로운 방식의 for 반복문 연습
		for(String data : names) {
			if(data !=null && data.length() > 0) {
				System.out.printf("%c** %n", data.charAt(0));
			}
		}
		System.out.println("=======================");
		

		// 데이터에 " "이나 null이 아닐 경우에만 수행되도록 유효성검사를 추가하기
		String[] guild = {"우유", "푸딩", "쿠키", null, "딸기"};		
		for(int i=0; i<guild.length; i++) {
			if(guild[i] !=null && guild[i].length() >0) {			// null이 이니거나 글자수가 0보다 클 경우에 수행
				System.out.printf("%c__ %n", guild[i].charAt(0));
			}
		}
	}
}
