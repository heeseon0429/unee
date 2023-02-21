package Day04;
import javax.swing.JOptionPane;

public class Test03 {

	//JOptionPane.showInputDialog
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		String tempjumsu = JOptionPane.showInputDialog("점수를 입력하세요");
		
		int jumsu = Integer.parseInt(tempjumsu);
		
		if(jumsu >= 80) {
			System.out.printf("%s학생은 %d점으로 합격입니다. %n", name, jumsu);
		}
		else {
			System.out.printf("%s학생은 %d점으로 불합격입니다. %n", name, jumsu);
		}
				System.out.println(jumsu >= 80 ? "합격":"불합격");
				
				return;
	}

}
