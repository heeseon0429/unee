package Day04;

import javax.swing.JOptionPane;

public class Test14 {

	// switch���� �̿��� ��� (3) - ���� ������ Ŭ ���
	public static void main(String[] args) {
		int jumsu = 90;
		char grade;
		
		if(jumsu < 0 || jumsu > 100) {
			System.out.println("������ ��ȿ���� �ʽ��ϴ�.");
		return;
		}
		switch(jumsu / 10) {
		case 10 : case 9 : grade = 'A';
		break;
		case 8 :   		   grade = 'B';
		break;
		case 7 :  		   grade = 'C';
		break;
		case 6 :  		   grade = 'D';
		default : 		   grade = 'F';
		}
		System.out.printf("%d => %c ����", jumsu, grade);
		return;
		
		}
	}


