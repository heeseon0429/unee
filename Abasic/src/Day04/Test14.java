package Day04;

import javax.swing.JOptionPane;

public class Test14 {

	// switch문을 이용한 출력 (3) - 변수 범위가 클 경우
	public static void main(String[] args) {
		int jumsu = 90;
		char grade;
		
		if(jumsu < 0 || jumsu > 100) {
			System.out.println("점수가 유효하지 않습니다.");
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
		System.out.printf("%d => %c 학점", jumsu, grade);
		return;
		
		}
	}


