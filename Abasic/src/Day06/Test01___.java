package Day06;

public class Test01___ {
	
	// ���� : for ���ǹ� / while ���ǹ� / do while ���ǹ��� ����
	public static void main(String[] args) {

		// for ����
		for(int count = 1; count <=3; count++) {
			System.out.printf("Hello %d %n", count);
		}
		
		// while  ����
		int count = 5;
		while (count < 5) {					// ���� count�� ���� 5�̱� ������ while���� false�� �Ǿ� ��µ��� �ʴ´�
			System.out.println("~~~~~~");	// ��¹� ����
		}
		while(count > 0) {
			System.out.println("-----");	// 5 4 3 2 1�� �پ��� ���� ������ �����ϹǷ� 5ȸ ���
			count-- ;						// ----- * 5
		}
		
		
		// do while ����
		do {
			System.out.println("+++++");	// while������ false�̴��� 
			count-- ;						// �ּ� 1���� ������ �� ������ Ȯ���ϹǷ� 1�� ���
		}while(count > 0);
	} 
}
