package Day05;

public class Test21 {

	// �迭(Array)
	public static void main(String[] args) {

		// �迭 ����
		int [] age;				// ���� ���� �����͸� ó���ؾ� �� �� �迭 ������ �Ѵ�
		
		// �迭 ����
		age = new int[5];		// �迭�� ���۷��� Ÿ�Ը� ���̸�, �� ���� ���� ���� �����Ѵ�
		
		// �ʱ�ȭ  
		age[0] = 30;			// �ʱ�ȭ ���� �־����� ������ null���� �� �ִ�
		age[1] = 29;
		age[2] = 20;
		age[3] = 26;
		age[4] = 28;
		
		String[] name = new String[5];
		name[0] = "������";
		name[1] = "������";
		name[2] = "������";
		name[3] = "����";
		name[4] = "���μ�";
		
		double sum = 0;
		double avg = 0;
		
		for (int i=0; i<age.length; i++) {
			sum += age[i];
		}
		
		avg = sum / age.length;
		
		System.out.printf("�հ� : %.0f, ��ճ��� : %.2f %n", sum, avg);
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s** : %d %n", name[i].charAt(0),age[i]);
		}
		return;
		}
		
	}



