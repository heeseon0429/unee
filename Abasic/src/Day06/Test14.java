package Day06;

public class Test14 {

	// String 타입으로 한 번에 입력된 데이터를 나눠서 출력할 수 있다.
	public static void main(String[] args) {

		// 한 번에 입력된 데이터를 나눠서 출력하기
		String name = "윤희선/F/98/100";
		String[] names = name.split("/");
		
		double sum = 0;
		for(int i=2; i<names.length;i++) {		// 배열의 길이에서는 ()를 사용하지 않는다.
			sum += Integer.parseInt(names[i]);	// 배열의 데이터를 int타입으로 캐스팅하여 연산한다.
		}
		System.out.printf("%c**  , 평균 %.2f", names[0].charAt(0), sum/2);
	}

}
