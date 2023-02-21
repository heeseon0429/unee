package Day04;
public class Test01 {

	// 선언문과 초기화 작업, 단항 연산자 복습
	public static void main(String[] args) {
		
		int n1 = 13;
		int n2 = 5;
		boolean a = n1 > n2;
		System.out.println(a);	//true
		
		System.out.println("------------------------");
		
		int result = 0;
		result = n1 + n2;
		System.out.println(result);  										//18
		System.out.printf("n1=%d, n2=%d, result=%d%n", n1, n2, result);
		result = n1++ + n2; 												// ++ 앞 뒤 상관없이 n1 값은 변경
		System.out.printf("n1=%d, n2=%d, result=%d%n", n1, n2, result);		// 하지만 ++가 앞에 있을 때만 최종 result 값 변경
		
		System.out.println("------------------------");
		
		int num = 99;
		System.out.println(num);    // 99    num = 99 
		System.out.println(num+1);  // 100   num = 99
		System.out.println(num++);  // 99    num = 100
		System.out.println(++num);  // 101   num = 101
		
		}

}
 
