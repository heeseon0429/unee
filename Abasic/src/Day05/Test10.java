package Day05;

public class Test10 {

	// for문을 중첩하기
	public static void main(String[] args) {

		for (int j=1; j<3; j++) {
			System.out.printf("j = %d %n", j);
			for(int k=0; k<5; k++) { 
				System.out.printf("  k=%d,", k);
			}
			System.out.println();
		}
		
	}

}
