package Day04;

public class Test09 {

	// if ���ǹ��� �̿��� ������ ���� ���� ���� ��ȿ�� �˻� (1)
	public static void main(String[] args) {
		int jumsu = 99;
		char grade;
		
		if(jumsu < 0 || jumsu > 100) {
			System.out.println("������ ��ȿ���� �ʽ��ϴ�.");
			return;
		}
		
		if(jumsu >= 90 && jumsu <=100) {
			grade = 'A';
		}
		else if(jumsu >= 80 && jumsu <=89) {
			grade = 'B';
		}
		else if(jumsu >= 70 && jumsu <=79) {
			grade = 'C';
		}
		else if(jumsu >= 60 && jumsu <=69) {
			grade = 'D';
		} 
		else {
			grade = 'F';
		}
		
		System.out.printf("%d�� => %c���� %n", jumsu, grade);
	
	}

}
