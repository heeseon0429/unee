package Day06;

import java.util.Arrays;

public class Test14 {

	/* �迭�� ������¡, �迭 ����
	*    - ����� ���� �迭�� null������ �ʱ�ȭ����, ������ �÷��Ͱ� �޸𸮸� ȸ���� �� �ְ� �Ѵ�.
	*    - �迭 : ������ ������ Ÿ������ ���� ���� ���� ���� �ϳ��� �̸����� ����ϸ�, ��ġ �ε����� �ʼ���
	*    - �迭�� �޸𸮿� �Ҵ�� �� �������� ������ ��ġ�ȴ�.
	*    - �迭�� �� �� �����ǰ� ���� ������¡�� �� �ȴ�.
	*/
	public static void main(String[] args) {

		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {			// i�� 0���� num�� ���̱��� 1�� ����
			num[i] = (int)(Math.random()*100);		// �迭�� �� ���� ���� �߻����� int Ÿ������ ����
		}
		System.out.println(Arrays.toString(num));
		
		// �迭 ����
		int[] temp = new int[num.length*2];			// num�� �迭���� ũ�Ⱑ 2���� �迭 ����
		System.out.println(Arrays.toString(temp));
		
		// system.arraycopy(src, srcPos,     dest,  destPos, length);
		// system.arraycopy(����, �������������, ���纻, ���������, ������ ��);
		
		System.arraycopy(num, 0, temp, 0, num.length);
		System.out.println(Arrays.toString(temp));
		
		
		
		
	}

}
