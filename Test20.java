package Day05;

public class Test20 {

	 // Cisear Cipher ����� ����Ͽ� ���ڿ��� ��ȣȭ�ϰ� ����ϱ�
	
	public static void main(String[] args) {

		String sourceString = "everyday we have is one more than we deserve";
		String encodeString = "";
		
		StringBuilder sb = new StringBuilder();		// ���ڿ��� ������ �� �����ϵ��� StringBuilder �޼ҵ� ���
		
		for(int i=0; i<sourceString.length(); i++) {// 0���� �����Ͽ� ���ڼ���ŭ �����ϵ��� ���ǽİ� ������ ����
			char a = sourceString.charAt(i);		// sourceString ������ ����� �����͸� 1���� �ҷ��´�.
			char b = 'a' <= a && a <= 'w' ? (char)(a+3) : (a=='x'||a=='y'||a=='z' ? (char)(a-23) : a);
			
			sb.append(b);
		}
		
		encodeString = sb.toString();
		
		System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : " + encodeString);
	}

}

