package Day05;

public class Test13 {

	// for������ continue�� ����
	public static void main(String[] args) {
		int i,j,gugu;
		
		for(i=1; i<10; i++ ) {
			for(j=2; j<10; j++) {
				if(j==5)continue;				// if���� ������ ������ ��� for���� ���̻� �������� �ʰ� �������� 			
				gugu = i * j;
				System.out.printf("%d * %d = %2d |", j, i, gugu);
			}
			System.out.println();
		}
		return;
		
		}
		
	}
