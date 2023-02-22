package Day05;

public class Test08 {

	/*
	 * Math.random() 메소드를 사용하여 임의의 실수 및 정수 출력하기
	 * 정수로 출력하기 위해 int 타입으로 캐스팅
	 * Math.random() * 10        :   0~10 사이의 랜덤값
	 * Math.random() * 40 + 10   :   10~50 사이의 랜덤값
	 */

	public static void main(String[] args) {

		int num = (int)(Math.random()*45+1);		
		System.out.println(num);					// 1~45 사이의 정수가 출력

		System.out.println("--------------------");

		for(int i=0; i<5; i++) {
			int num2 = (int)(Math.random()*45+1);	//1~45 사이의 정수가 5개 출력
			System.out.println(num2);
		}
		return;
	}

}
