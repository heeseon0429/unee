package Day05;

public class Test09 {

	/*
	 *  while���� boolean���� if���� �����Ͽ� ���ǽ� �����
	 *  boolean : true / false
	 */
	
	public static void main(String[] args) {

		boolean flag = true;
		while(flag) {
			int num3 = (int)(Math.random() * 45 )+1;
			
			if (num3 % 3 == 0) flag = !flag;			// num3�� 3�� ����� �� false�� �����Ǹ� ���� �����
			System.out.println(num3);
		}
		
		System.out.println("--------------------------");
		
		boolean flag2 = false;							// do while ������ false�� �ִ��� �ּ� 1���� ����
		do {
			int num4 = (int)(Math.random() * 45) + 1;
			if (num4 % 3 == 0) flag2 = !flag;			// num3�� 3�� ����� �� false�� �����Ǹ� ���� �����
			System.out.println(num4);
		}while(flag2);
		return;
	}

}
