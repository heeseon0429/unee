package Day04;

public class Test05 {
	
	// chatAt()�� ����Ͽ� Ư�� ��ġ�� ���ڿ��� ������
	public static void main(String[] args) {
		String msg = null;
		msg = " hello uneeverse...! ";
		
		System.out.println(msg);			// hello uneeverse...!
		//System.out.println(msg.length());	// 21
		msg = msg.trim().toUpperCase();		// ���� ���� �� �빮�ڷ� ����
		System.out.println(msg.length());   // 19
		
		
		/*
		 * ���ڿ��� ���� ��ġ �ε����� ������ �־ Ư�� ��ġ�� ���ڿ��� .charAt() �޼ҵ带 ����Ͽ� ���� �� �ִ�.
		 * ��, �������� �ʴ� ��ġ�� ���ڿ��� ������ �� ��� ������ �߻��Ѵ�.
		 */
		
		System.out.println(msg.charAt(0));
		System.out.println(msg.charAt(4));
		System.out.println(msg.charAt(12));
		
		// ������ ����
		System.out.println(msg.charAt(msg.length()-1));
	}
}
