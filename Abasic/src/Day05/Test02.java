package Day05;

public class Test02 {

	// for���� ����� 1~100���� �հ�
	public static void main(String[] args) {

		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum = sum + i;
			System.out.printf("%d + ", i);
		}
		System.out.printf("= %d %n", sum);
		 return;
	}

}
