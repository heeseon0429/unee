package Day06;

public class Test11 {

	// String Ÿ�� �����͸� char Ÿ�� �迭�� ��ȯ�� ��, �� ���ھ� ����� �� �ִ�.
	public static void main(String[] args) {

		String s1 = "unee";

		char[] c = s1.toCharArray();									// String���� char�� �迭�� �ٲٴ� �޼ҵ�

		System.out.println(c);											// ��� : unee

		for(char data : c) {											// charŸ�� �迭 c�� ����� �����͸� �ϳ��� �ҷ����� �ݺ���
			System.out.printf("%c ==> %c %n", data, (char)(data-32));	// �迭�� ����ִ� �����͸� ���� �� char Ÿ������ ĳ����
		}

	}

}
