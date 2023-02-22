package Day05;

public class Test19 {

	 //��ҹ��ڰ� ���� ���� �� �빮�ڷθ� ����ϱ� -- StringBuilder Ȥ�� StringBuffer�� ���
	 //String���� + - ������ �Ͽ� ������ �����ϰų� ����ϰ� �� ��� ������ ���ϵǱ⿡ ������� �ʴ´�.
	 
	/*
	 * StringBuilder �����̸� = new StringBuilder();
	 * for���� ����� �Լ� {
	 * 		sb.append();
	 * 	}
	 * result = �����̸�.toString();
	 */

	/*
	 * StringBuffer �����̸� = new StringBuffer();
	 * for���� ����� �Լ�{
	 * 	sb.append();
	 * }
	 * result = �����̸�.toString();
	 */
	
	/*
	 * for (int=0; i<msg.length(); i++)    :   int�� 1���� ���� : 1 2 3 4 5 6 7 8
	 * for (int=0; i<msg.length()-1; i++)  :   int�� 0���� ���� : 1 2 3 4 5 6 7 8
	 */
	public static void main(String[] args) {

		String msg = "abcdEFGhijk";
		String result = "";
		System.out.println(msg); 									// ��¹� : abcdEFGhijk 

		StringBuilder sb = new StringBuilder();						// Ȯ�� �� ��ȯ�� ���� ���ڿ��� �����صδ� �޼ҵ�
		for(int i=0; i<msg.length(); i++) {							
			char a = msg.charAt(i);									// ���ڿ����� 1���ھ� �����Ѵ�.
			char b = 'a' <= a && a <= 'z' ? (char) (a -32) : a;		// �ҹ������� Ȯ���ϰ� ���� ��� �빮�ڷ� ��ȯ�Ѵ�.
			sb.append(b);
		}
		result = sb.toString();										// �����ص� sb�� �����͵��� ���� result�� �����Ѵ�.
		System.out.println(result);									// ��¹� : ABCDEFGHIJK

		return;
	}

}

