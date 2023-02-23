package Day06;

public class Test05 {

	// �迭���� "StringŸ�� ������"�� �͸� ó�� �� ��ȿ�� �˻�
	/* �迭�ּ� �����͸� 1���� �������� �� �� for ���ǹ��� ����� �� �ִ�.
	 * �迭�� ���̿� ���� .length �޼ҵ带 ����� ���� ()�� ������� �ʴ´�.
	 * �迭�� null���̳� ������ �� ���� �ʵ��� if ���ǹ��� ����� ��ȿ�� �˻縦 �� �� �ִ�.
	 * for (String data : ����){}�������� ����� �� �迭�� ���̿� ���� .length()�޼ҵ忡���� ()�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		
		// �迭���� �͸� ó�� �� ��ȿ�� �˻�
		String[] names = {"�̼���","����","������","������","������"}; 	// �����Ϳ� " "�� ���� ��� ������ �߻��Ѵ�.
		
		for (int i=0; i <names.length; i++) {
			System.out.printf("%c** %n", names[i].charAt(0));
		}
		System.out.println("=======================");
		
		
		// ���ο� ����� for �ݺ��� ����
		for(String data : names) {
			if(data !=null && data.length() > 0) {
				System.out.printf("%c** %n", data.charAt(0));
			}
		}
		System.out.println("=======================");
		

		// �����Ϳ� " "�̳� null�� �ƴ� ��쿡�� ����ǵ��� ��ȿ���˻縦 �߰��ϱ�
		String[] guild = {"����", "Ǫ��", "��Ű", null, "����"};		
		for(int i=0; i<guild.length; i++) {
			if(guild[i] !=null && guild[i].length() >0) {			// null�� �̴ϰų� ���ڼ��� 0���� Ŭ ��쿡 ����
				System.out.printf("%c__ %n", guild[i].charAt(0));
			}
		}
	}
}
