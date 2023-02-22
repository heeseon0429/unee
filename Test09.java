package Day05;

public class Test09 {

	/*
	 *  while문에 boolean문과 if문을 포함하여 조건식 만들기
	 *  boolean : true / false
	 */
	
	public static void main(String[] args) {

		boolean flag = true;
		while(flag) {
			int num3 = (int)(Math.random() * 45 )+1;
			
			if (num3 % 3 == 0) flag = !flag;			// num3가 3의 배수일 때 false로 반전되며 루프 종료됨
			System.out.println(num3);
		}
		
		System.out.println("--------------------------");
		
		boolean flag2 = false;							// do while 구문은 false가 있더라도 최소 1번은 수행
		do {
			int num4 = (int)(Math.random() * 45) + 1;
			if (num4 % 3 == 0) flag2 = !flag;			// num3가 3의 배수일 때 false로 반전되며 루프 종료됨
			System.out.println(num4);
		}while(flag2);
		return;
	}

}
