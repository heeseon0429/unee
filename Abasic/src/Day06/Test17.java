package Day06;


public class Test17 {

	// 2���� �迭�� ���� ��� �� ��°
	public static void main(String[] args) {

		int[][] ii = {										// 2���� �迭 ii�� �����ϰ� �ʱ�ȭ�Ѵ�.
				{1,2,3},{7,8},{9}
		};
		
		for(int row=0; row<ii.length; row++) {				// 2���� �迭�� ���� �� ũ�⸦ ��ø for�ݺ����� ���� ����
			for(int col=0; col<ii[row].length; col++) {
				System.out.print(ii[row][col]+"  ");		// 1  2  3
			}												// 7  8
			System.out.println();							// 9
		}
	}

}
