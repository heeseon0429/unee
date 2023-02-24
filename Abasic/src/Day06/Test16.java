package Day06;

import java.util.Arrays;

public class Test16 {

	/* 
	 * 2차원 배열
	 *  - 1차원 배열들을 모아서 관리하는 2차원 배열
	 *  - 2차원 배열 내의 데이터를 별도로 대입하지 않을 경우 0이 들어있다.
	 *  - 배열의 크기가 바뀌어도 작동하도록 스크립트를 구성한다.
	 *  - 배열 내의 데이터를 출력할 수 있는 스크립트를 작성할 수 있다.
	*/
	public static void main(String[] args) {

		// 2차원 배열
		int[] n1 = {1,2,3,4,5};
		int[] n2 = {5,6,9,2};
		int[] n3 = {15,17,19,22,44,88,999};
		
		int[][] nn = {n1, n2, n3};				// 1차원 배열 n1, n2, n3을 모아서 관리하는 2차원 배열 nn을 생성한다.
		
		int[][] two = new int[4][3];			// 2차원 배열에서 데이터에 접근하려면 다중 for 문이 필요하다.
		two[0][0] = 999;						// 2차원 배열 two는 두 개의 999 값을 제외하면 0값이 저장되어 있다.
		two[3][2] = 999;
		
		// 2차원 배열의 크기가 바뀌면 다음과 같은 스크립트는 일일이 수정해야 하므로 비효율적이다.
		for(int r=0; r<4; r++) {						
			for(int c=0; c<3; c++) {					
				System.out.printf("%3d  ", two[r][c]);   // 999    0    0  
				}									     //  0     0    0  
			System.out.println(); 						 //  0     0    0  
														 //  0     0   999  
		}  										 
														
			
		
		// 2차원 배열의 크기가 바뀌더라도, 배열의 데이터를 출력하도록 작동하는 스크립트
		for(int row=0; row <nn.length; row++){				// 변수가 0부터 시작하되 배열 nn의 길이만큼 진행
			for(int col=0; col<nn[row].length; col++){		// 내부 배열의 길이만큼 진행
				System.out.print(nn[row][col]+ " , ");		
			}												// 1 , 2 , 3 , 4 , 5 ,		
			System.out.println();							// 5 , 6 , 9 , 2 ,
		}													// 15 , 17 , 19 , 22 , 44 , 88 , 999 , 
		

		
		
		
	}

}
