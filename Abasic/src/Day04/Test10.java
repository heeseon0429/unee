package Day04;

public class Test10 {

	// if 조건문을 이용한 점수에 따른 학점 계산과 유효성 검사 (1)
	public static void main(String[] args) {
		int jumsu = 30;
		char grade;
		
		grade = (jumsu >= 90 && jumsu <= 100 ? 'A' :
			(jumsu >= 80 && jumsu < 90 ? 'B':
				(jumsu >= 70 && jumsu < 80 ? 'C':
					(jumsu >= 60 && jumsu < 70 ? 'D':
						(jumsu >= 0 && jumsu <59 ? 'F' : 'Z')))));
		
		if(grade == 'Z') {
			System.out.println("유효하지 않은 점수입니다.");
		}
		else {
			System.out.printf("당신의 점수는 %d점이며 %c학점입니다.", jumsu, grade);
		}
			}

}
