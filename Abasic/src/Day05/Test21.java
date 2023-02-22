package Day05;

public class Test21 {

	// 배열(Array)
	public static void main(String[] args) {

		// 배열 선언
		int [] age;				// 여러 개의 데이터를 처리해야 할 때 배열 선언을 한다
		
		// 배열 생성
		age = new int[5];		// 배열은 레퍼런스 타입만 쓰이며, 몇 개의 방을 쓸지 생성한다
		
		// 초기화  
		age[0] = 30;			// 초기화 값을 넣어주지 않으면 null값이 들어가 있다
		age[1] = 29;
		age[2] = 20;
		age[3] = 26;
		age[4] = 28;
		
		String[] name = new String[5];
		name[0] = "한유진";
		name[1] = "성현제";
		name[2] = "한유현";
		name[3] = "윤희선";
		name[4] = "강민수";
		
		double sum = 0;
		double avg = 0;
		
		for (int i=0; i<age.length; i++) {
			sum += age[i];
		}
		
		avg = sum / age.length;
		
		System.out.printf("합계 : %.0f, 평균나이 : %.2f %n", sum, avg);
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s** : %d %n", name[i].charAt(0),age[i]);
		}
		return;
		}
		
	}



