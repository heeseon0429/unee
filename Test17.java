package Day05;

public class Test17 {

	
	// ��ȿ������ �ڵ� �ߺ��� for������ ��ĥ �� �ִ�.
	public static void main(String[] args) {
		
		String msg = "unee...��";
		System.out.println(msg);
//		System.out.println(msg.charAt(0));
//		System.out.println(msg.charAt(1));
//		System.out.println(msg.charAt(2));
//		System.out.println(msg.charAt(3));
//		System.out.println(msg.charAt(5));		// �ڵ� �ߺ����� ��ȿ��
		
		for(int i=0; msg != null && i <msg.length(); i++)		// �������� null�� ���� ��쿡��
			System.out.println(msg.charAt(i));					// ������ �߻����� �ʵ��� �����ؾ� �Ѵ�.
		
		return;
		
		}
		
	}

