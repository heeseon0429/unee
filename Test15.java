package Day05;

public class Test15 {

	// for문에서 라벨링의 역할
	public static void main(String[] args) {
		
		int i,j,gugu;
		
		OUT:for(i=1; i<10; i++ ) {
			for(j=2; j<10; j++) {
				if(j==5)break OUT;				// 라벨링이 없을 경우, 가장 가까운 for문으로 가게 된다.
				gugu = i * j;					// 여러개의 for반복문이 있을 경우 특정 for문으로 가도록 라벨링한다.
				System.out.printf("%d * %d = %2d |", j, i, gugu);
			}
			System.out.println();
		}
		return;
		
		}
		
	}

