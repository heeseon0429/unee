package Day04;
import javax.swing.JOptionPane;

public class Test03 {

	//JOptionPane.showInputDialog
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
		String tempjumsu = JOptionPane.showInputDialog("������ �Է��ϼ���");
		
		int jumsu = Integer.parseInt(tempjumsu);
		
		if(jumsu >= 80) {
			System.out.printf("%s�л��� %d������ �հ��Դϴ�. %n", name, jumsu);
		}
		else {
			System.out.printf("%s�л��� %d������ ���հ��Դϴ�. %n", name, jumsu);
		}
				System.out.println(jumsu >= 80 ? "�հ�":"���հ�");
				
				return;
	}

}
