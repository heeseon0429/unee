package Day04;
public class Test01 {

	// ���𹮰� �ʱ�ȭ �۾�, ���� ������ ����
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
		result = n1++ + n2; 												// ++ �� �� ������� n1 ���� ����
		System.out.printf("n1=%d, n2=%d, result=%d%n", n1, n2, result);		// ������ ++�� �տ� ���� ���� ���� result �� ����
		
		System.out.println("------------------------");
		
		int num = 99;
		System.out.println(num);    // 99    num = 99 
		System.out.println(num+1);  // 100   num = 99
		System.out.println(num++);  // 99    num = 100
		System.out.println(++num);  // 101   num = 101
		
		}

}
 
