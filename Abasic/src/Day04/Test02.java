package Day04;
public class Test02 {

	// if ���ǹ��� ���� ������
	public static void main(String[] args) {
		String name = "����";
		int jumsu = 100;
		
		if(jumsu >= 80) {
			System.out.printf("%s�л��� %d������ �հ��Դϴ�.%n", name, jumsu);
		} // end of if
		
		else {
			System.out.printf("%s�л��� %d������ ���հ��Դϴ�.%n", name, jumsu);
		} // end of else
		
		System.out.println(jumsu >= 80 ? "�հ�" : "���հ�");  // 
		 
		return;  // �Լ� ���������� return
		
	} // end of main 

} // end of class
 
