package Day05;

public class Test01 {

	/* 
	 * for���� ����� ������ ���� nȸ ����ϱ�
	 * for (�ʱⰪ ����; ���ǽ�; ������) { }
	 * for ���� �ȿ��� ����� ������ scope --- �ƹ� ������ �������� ������ ���ѷ����� �߻��Ͽ� ������ ����.
	 */
	
	public static void main(String[] args) {
		
		// (1)
		for(int i=0; i<3; i++) {
			System.out.println("hello uneeverse");
			System.out.println(i);
		}
		
		// (2)
		for(int i=0; i<3; i++) {
			System.out.printf("hello uneeverse %d %n", i);
		}
		
		
		return;
	}

}
