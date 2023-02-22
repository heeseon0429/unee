package Day05;

public class Test12 {

	// for문에서 break의 역할
	public static void main(String[] args) {
		int i,j,gugu;
		
		for(i=1; i<10; i++ ) {
			for(j=2; j<10; j++) {
				if(j==5)break;				// if문의 조건을 충족할 경우 for문을 더이상 수행하지 않고 빠져나감 			
				gugu = i * j;
				System.out.printf("%d * %d = %2d |", j, i, gugu);
			}
			System.out.println();
		}
		return;
		
		}
		
	}

