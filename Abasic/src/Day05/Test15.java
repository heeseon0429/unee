package Day05;

public class Test15 {

	// for������ �󺧸��� ����
	public static void main(String[] args) {
		
		int i,j,gugu;
		
		OUT:for(i=1; i<10; i++ ) {
			for(j=2; j<10; j++) {
				if(j==5)break OUT;				// �󺧸��� ���� ���, ���� ����� for������ ���� �ȴ�.
				gugu = i * j;					// �������� for�ݺ����� ���� ��� Ư�� for������ ������ �󺧸��Ѵ�.
				System.out.printf("%d * %d = %2d |", j, i, gugu);
			}
			System.out.println();
		}
		return;
		
		}
		
	}

