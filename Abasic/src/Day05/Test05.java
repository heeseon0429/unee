package Day05;

public class Test05 {

	/*
	 * for���� ����� ���ǽ��� �����ϴ� ���� ���
	 * 1~100 ���� ��. 3�� ����̸鼭 5�� ����� ���� ��
	 */
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.printf(" %d +", i);
			}
			sum = sum + i;
		}
		System.out.printf(" =%d", sum);
		return;
	}

}
