package Day06;

public class Test02 {

	// for���ǹ��� if���ǹ��� ȥ�� : 1~1000 ���� �� 5�� ����� �� ���ϱ�
	// ������ �����ϴ� ��ġ�� ���� �ٸ� ����� �����Ƿ�, ��ġ ������ �߿��ϴ�.
	public static void main(String[] args) {

		int sum = 0;							// ���� ������ ������ �����ϸ� �������� sum�� ���� 0���� �ʱ�ȭ�ǹ����Ƿ�
		for(int num =1; num <=10; num++) {
			//int sum = 0;  					// ������ �����ϴ� ��ġ�� �߿��ϴ�
			
			if(num % 5 == 0) {
				System.out.printf("%d ", num);	// if���ǹ��� �����ϴ� ���� Ȯ���ϱ� ���� ����غ���
			sum += num;
			}
		}
		System.out.println();					// 5  10
		System.out.println(sum);				// 15
	}
}
