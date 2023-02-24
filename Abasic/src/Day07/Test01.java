package Day07;

import java.util.Arrays;

public class Test01 {

	// 배열의 선언, 생성, 초기화 복습 + 배열 내 특정한 값이 존재하는지 확인할 수 있다.
	public static void main(String[] args) {
		
		// 베열의 선언과 생성과 초기화 복습 
		int[] num = {66,77,88,99,100};
		
		System.out.println(Arrays.toString(num));	// [66, 77, 88, 99, 100]
		System.out.println(num.length); 			// length : 길이 즉, 방의 갯수   // 5
		
		for(int i=0; i <num.length; i++) {
			if(num[i] == 100) {
				System.out.printf("배열 내 %d 위치의 값은 %d이다. %n", i, num[i]);   //배열 내 4 위치의 값은 100이다. 
			}
		}
	}

}
