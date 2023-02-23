package Day06;

public class Test09 {

	// String Ÿ������ �Է��� �����͸� �������� ����ϱ�
	/* 
	 * 1) �������� ����ϱ� ���� for ���ǹ� ���� ���� i�� �ʱⰪ�� ������ ����-1�� ����
	 *   : �������� �ּ� �ε����� 0,1,2,3 ...�̱� ����
	 * 2) for ���ǹ� ������ ������ i=0�� �� ������ ����
	 * 3) StringBuilder Ŭ������ ����ϸ� for ���ǹ� ���� .append()�޼ҵ带 �����ϰ�,
	 *    ���ǹ� ���Ŀ��� .toString() �޼ҵ�� String Ÿ�� ������ ������ �����͸� �����Ѵ�.
	 */
	public static void main(String[] args) {

		// �Է��� �����͸� �������� �����غ���
		String msg = "Hello unee, cookie love";
		
		for(int i = msg.length()-1; i>=0; i--) {
			System.out.print(msg.charAt(i));
		}
		System.out.println();
		System.out.println("===================");
		
		String result = "";							// ���ڿ��� +- ������ ������� �ʵ��� StringBuilder Ȱ��
		StringBuilder sb = new StringBuilder();
		for(int i = msg.length()-1; i>=0; i--) {
			sb.append(msg.charAt(i));
		}
		result = sb.toString();
		System.out.println(result);
	}

}
