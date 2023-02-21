package Day04;

public class Test12 {

	// switch문을 이용한 출력 (1) - 기본 케이스
	public static void main(String[] args) {
		int num = 7;
		
		switch(num) {
		case 1 : System.out.println("약국");
		break;
		case 2 : System.out.println("정형외과");
		break;
		case 3 : System.out.println("피부과");
		break;
		case 4 : System.out.println("치과");
		break;
		case 5 : System.out.println("헬스클럽");
		default : System.out.println("잘못 입력헸습니다. 1,2,3,4,5 중에서 입력해주세요");
		}
			}

}
