package Day04;

public class Test10 {

	// if ���ǹ��� �̿��� ������ ���� ���� ���� ��ȿ�� �˻� (1)
	public static void main(String[] args) {
		int jumsu = 30;
		char grade;
		
		grade = (jumsu >= 90 && jumsu <= 100 ? 'A' :
			(jumsu >= 80 && jumsu < 90 ? 'B':
				(jumsu >= 70 && jumsu < 80 ? 'C':
					(jumsu >= 60 && jumsu < 70 ? 'D':
						(jumsu >= 0 && jumsu <59 ? 'F' : 'Z')))));
		
		if(grade == 'Z') {
			System.out.println("��ȿ���� ���� �����Դϴ�.");
		}
		else {
			System.out.printf("����� ������ %d���̸� %c�����Դϴ�.", jumsu, grade);
		}
			}

}
