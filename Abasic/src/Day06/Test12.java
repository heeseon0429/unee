package Day06;

public class Test12 {

	// String Ÿ�Կ��� ���ϴ� ��ġ �ε����� ���ڿ��� ����� �� �ִ�
	public static void main(String[] args) {

		// ��û������ �����ϰ��� �� �� ����ϴ� �޼ҵ� API
		String url = "http://myweb/admin/login.do";
		
		System.out.println(url.substring(3));		// 3 ��ġ���� ���������� ���

		System.out.println(url.substring(20));		// 20 ��ġ���� ���������� ���
		
		System.out.println(url.substring(3,6));     // 3 ~ 6 // 6 ������ ���
		
		System.out.println(url.indexOf('/'));		// (/)�� �ִ� ��ġ �ε����� ���
		
		System.out.println(url.lastIndexOf('/'));	// ������ (/)�� �ִ� ��ġ �ε����� ���
	}

}
