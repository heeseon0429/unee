package Day05;

public class Test07 {

	/*
	 * Math.random() �޼ҵ带 ����Ͽ� ������ �Ǽ� �� ���� ����ϱ�
	 * ������ ����ϱ� ���� int Ÿ������ ĳ����
	 * 0 <= ~ <1 �Ǽ� ���� �߻�  
	 */
	
	public static void main(String[] args) {
		System.out.println(Math.random());				//������ �Ǽ��� ���
		System.out.println((int)Math.random());			//0 ���
		System.out.println((int)(Math.random()*10));	//������ ������ ���
		return;
	}

}
