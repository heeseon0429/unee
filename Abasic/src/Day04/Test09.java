package Day04;

public class Test09 {

	// if 조건문을 이용한 점수에 따른 학점 계산과 유효성 검사 (1)
	public static void main(String[] args) {
		int jumsu = 99;
		char grade;
		
		if(jumsu < 0 || jumsu > 100) {
			System.out.println("점수가 유효하지 않습니다.");
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
		
		System.out.printf("%d점 => %c학점 %n", jumsu, grade);
	
	}

}
