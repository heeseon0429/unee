package Day06;


public class Test17 {

	// 2차원 배열의 선언 방법 두 번째
	public static void main(String[] args) {

		int[][] ii = {										// 2차원 배열 ii를 선언하고 초기화한다.
				{1,2,3},{7,8},{9}
		};
		
		for(int row=0; row<ii.length; row++) {				// 2차원 배열의 열가 행 크기를 중첩 for반복문을 통해 구현
			for(int col=0; col<ii[row].length; col++) {
				System.out.print(ii[row][col]+"  ");		// 1  2  3
			}												// 7  8
			System.out.println();							// 9
		}
	}

}
