package Day06;

public class Test08 {

	// �����Լ����� args�� �ǹ�
	/* ���α׷��� ������ �� �Ѱ��ִ� �������� ���� ����ִ� StringŸ���� �迭�̴�.
	 * �����Լ��� �Ű������� ���� �� �ִ�.
	 */
	public static void main(String[] args) {

		System.out.println(args.length); 			// arg�� �����Ͱ� ��������� 0���� ���
		System.out.println("==== End ====");        // args�� ����Ÿ�ӿ� �ʿ��� ������ �Ѱܹ޴� ���
		
		                                            // ���ǥ�� �� - run Configuration -Arguments 
													// 			Program Arguments�� ������ �Է�
													//
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}											
	}

}
