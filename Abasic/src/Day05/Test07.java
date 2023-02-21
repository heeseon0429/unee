package Day05;

public class Test07 {

	/*
	 * Math.random() 메소드를 사용하여 임의의 실수 및 정수 출력하기
	 * 정수로 출력하기 위해 int 타입으로 캐스팅
	 * 0 <= ~ <1 실수 난수 발생  
	 */
	
	public static void main(String[] args) {
		System.out.println(Math.random());				//임의의 실수가 출력
		System.out.println((int)Math.random());			//0 출력
		System.out.println((int)(Math.random()*10));	//임의의 정수가 출력
		return;
	}

}
