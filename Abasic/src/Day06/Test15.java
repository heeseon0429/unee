package Day06;

import java.util.Arrays;

public class Test15 {

	/* 
	 * 배열 복제와 오름차순 정렬
	 *  - 배열의 선언, 생성, 초기화를 동시에 할 수 있다.
	 *  - .clone() 메소드로 배열을 복제하면, 동일한 데이터를 갖도록 새로운 공간을 생성한다.
	 *  	: ★원본 배열의 데이터를 중간에 수정해도 clone 배열에는 반영되지 않는다.★
	 *  - Arrays.sort(); 메소드를 사용하여 배열 내의 데이터를 오름차순으로 정렬할 수 있다.
	*/
	public static void main(String[] args) {

		int[] n1 = {25, 20, 18, 26, 28, 19};				// 배열의 선언, 생성, 초기화를 동시에 하는 스크립트
		//int[] n1 = new int[] {25, 20, 18, 26, 28, 19};	// new int[] 생략 가능
		
		int[] n2 = n1;										// n2는 n1과 같은 주소
		int[] n3 = n1.clone();								// n1을 복제하되 같은 곳을 바라보는게 아니라 동일하게 새로이 생성한다.
		
		System.out.println(Arrays.toString(n1));			// [25, 20, 18, 26, 28, 19]
		System.out.println(Arrays.toString(n2));			// [25, 20, 18, 26, 28, 19]
		System.out.println(Arrays.toString(n3));			// [25, 20, 18, 26, 28, 19]
		
		System.out.println("------------------------");
		n1[0] = 0;
		
		System.out.println(Arrays.toString(n1));			// [0, 20, 18, 26, 28, 19]
		System.out.println(Arrays.toString(n2));			// [0, 20, 18, 26, 28, 19]
		System.out.println(Arrays.toString(n3));			// [25, 20, 18, 26, 28, 19]
		
		System.out.println("------------------------");
		
		Arrays.sort(n1);									// 배열 내 오름차순
		System.out.println(Arrays.toString(n1));			// [0, 18, 19, 20, 26, 28]
		
		
		
	}

}
