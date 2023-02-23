package Day06;

import java.util.Arrays;

public class Test07 {

	// 배열을 관리하는 util 클래스 중 Arrays의 사용
	/*
	 * 배열 이름으로 출력하면 주소 인덱스가 출력된다.
	 * 배열 내의 데이터를 출력하기 위해서 Arrays.toString(배열이름) 메소드를 사용한다.
	 */
	public static void main(String[] args) {
		String[] names = {"오지연","오현경","윤희선","이세희","전은진"};
		String[] guild = {"핫초코", "딸기", "소금빵", null, "아메리카노"};
		int[] age = {26,26,26,25,26};
		
		// 배열을 관리하는 util 클래스 => Arrays				//Array.toString()을 사용하지 않으면 주소가 출력됨
		
		System.out.println(names);						// [Ljava.lang.String;@7637f22
		System.out.println(guild);						// [Ljava.lang.String;@4926097b
		System.out.println(age);						// [I@762efe5d
		
		System.out.println(Arrays.toString(names));		// [오지연, 오현경, 윤희선, 이세희, 전은진]
		System.out.println(Arrays.toString(guild));		// [핫초코, 딸기, 소금빵, null, 아메리카노]
		System.out.println(Arrays.toString(age));		// [26, 26, 26, 25, 26]
		
		guild[2] = "쿠키";								// 배열의 데이터를 중간에 변경할 수 있다.
		System.out.println(Arrays.toString(guild));
	} 

}
