package Day04;

import javax.swing.JOptionPane;

public class Test13 {

	// switch문을 이용한 출력 (2) - 변수를 showInputDialog를 통해 String 타입으로 대입할 경우
	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog("내리실 층을 입략하세요. 1~7");

		switch(Integer.parseInt(num)) {
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
