package Day04;

public class Test08 {

	// ���ڼ��� ���� �ٸ��� ����ϱ� (�Է°��� 2������ ���� ���ǹ� ����)
	public static void main(String[] args) {
		String name = "����";
		if(name.length() > 0) {
			if(name.length() == 2) {
				System.out.printf("%c* %n", name.charAt(0));
			}
			else {
				System.out.printf("%c** %n", name.charAt(0));
				System.out.printf("%c*%c %n", name.charAt(0), name.charAt(name.length()-1));
			}
		}
		else {
			System.out.println("1���� �̻� �Է����ּ���");

		}
	}
}
