package Day05;

public class Test18 {

	
	// for�� Ȱ�� -- 1���ھ� �����Ͽ� �빮�ڷ� ��ȯ�ϱ�
	public static void main(String[] args) {
		
		String msg = "unee...��";
		System.out.println(msg);
		
		for(int i=0; msg != null && i <msg.length(); i++) {			// �������� null�� ���� ��쿡��
			char a = msg.charAt(i);									// ������ �߻����� �ʵ��� �����ؾ� �Ѵ�.
			char c = (a >= 'a' && a <= 'z') ? (char) (a -32) : a;
			System.out.printf("msg(%d) %c => %c %n" , i,a,c);
		}
		
		return;
		
		}
		
	}

