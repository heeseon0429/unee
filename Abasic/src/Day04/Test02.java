package Day04;
public class Test02 {

	// if 조건문과 삼항 연산자
	public static void main(String[] args) {
		String name = "윤희선";
		int jumsu = 100;
		
		if(jumsu >= 80) {
			System.out.printf("%s학생은 %d점으로 합격입니다.%n", name, jumsu);
		} // end of if
		
		else {
			System.out.printf("%s학생은 %d점으로 불합격입니다.%n", name, jumsu);
		} // end of else
		
		System.out.println(jumsu >= 80 ? "합격" : "불합격");  // 
		 
		return;  // 함수 마지막에는 return
		
	} // end of main 

} // end of class
 
