package Day06;

import java.util.Scanner;

public class Test03 {

	// ��ĳ�� ���� �ڿ��ݳ�
	/*
	 * import java.util.Scanner; : ��ĳ�� ����� ���� �޼ҵ� ��Ű�� �ҷ�����
	 * Scanner Ÿ���� �ʱⰪ�� null ������ �����ϰ�, ��� �� �ݳ��� ���� null ���� ����
	 * Scanner Ÿ�� ������ �����͸� �Է��ϱ� ����, ��ü ���� �� (system.in); �޼ҵ带 ���
	 * Scanner�� ���� �Էµ� �����͸� String Ÿ�� ������ �����ϱ� ���� .nextLine() �޼ҵ带 ���
	 */
	public static void main(String[] args) {

		Scanner keyboard = null;				// �ҷ��� ��ĳ�ʸ� null������ �ʱ�ȭ
		
		keyboard = new Scanner(System.in);		// ���� keyboard�� system.in�Է°��� �����ϵ��� ��ü�� ����
		System.out.println("�̸��� �Է��ϼ���");		// ������ �Է��� ���� �ȳ��� ���
		String name = keyboard.nextLine();		// StringŸ�� ���� name�� keyboard.nextLine()���� �Է°��� ����
		
		if(keyboard != null) {					// keyboard�� ���� null�� �ƴ� ���� �ڿ��� ����� ���̹Ƿ�
			System.out.println("�ڿ��ݳ� ��");	
			keyboard.close();					// ����� �ڿ��� �ݳ��ϰ�
			keyboard = null;			 		// keyboard���� ������� null���� ����
		}
		
		System.out.printf("%s ����%n", name);
		System.out.println("====End====");
		
		
	}
}
