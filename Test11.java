package Day05;

public class Test11 {

	// for문 중첩을 활용하여 구구단 출력하기
	public static void main(String[] args) {
		int i,j,gugu;
		
		for(i=1; i<10; i++ ) {
			for(j=2; j<10; j++) {
				gugu = i * j;
				System.out.printf("%d * %d = %2d |", j, i, gugu);
			}
			System.out.println();
		}
		
		
		}
		
	}

