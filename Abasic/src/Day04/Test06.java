package Day04;

public class Test06 {
	
	// �͸�ó���� ������� ���
	public static void main(String[] args) {
		String name = "����";
		
		System.out.println(name.charAt(0) + "**");										//��**
		System.out.println(name.charAt(0) + "*" + name.charAt(name.length()-1));		//��*��
		
		System.out.printf("%c** %n", name.charAt(0));									//��**
		System.out.printf("%c*%c %n", name.charAt(0), name.charAt(name.length()-1));	//��*��
	}
}
