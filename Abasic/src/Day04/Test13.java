package Day04;

import javax.swing.JOptionPane;

public class Test13 {

	// switch���� �̿��� ��� (2) - ������ showInputDialog�� ���� String Ÿ������ ������ ���
	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog("������ ���� �Է��ϼ���. 1~7");

		switch(Integer.parseInt(num)) {
		case 1 : System.out.println("�౹");
		break;
		case 2 : System.out.println("�����ܰ�");
		break;
		case 3 : System.out.println("�Ǻΰ�");
		break;
		case 4 : System.out.println("ġ��");
		break;
		case 5 : System.out.println("�ｺŬ��");
		default : System.out.println("�߸� �Է��g���ϴ�. 1,2,3,4,5 �߿��� �Է����ּ���");
		}
	}

}
