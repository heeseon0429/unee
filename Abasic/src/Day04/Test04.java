package Day04;

public class Test04 {
	
	// ���ڿ� �� �������� �� ���ڼ� ����
	public static void main(String[] args) {
		String msg = null;
		msg = " hello uneeverse .. ";
		
		System.out.println(msg);			// hello uneeverse ..
		System.out.println(msg.length());   // ���� �� : 20
		
		System.out.println(msg.trim());  	//hello uneeverse ..
		System.out.println(msg);			// hello uneeverse ..
		
		msg = msg.trim();
		System.out.println(msg.length());   // ������ ������ ���� �� : 18
	}
}
