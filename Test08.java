package Day05;

public class Test08 {

	/*
	 * Math.random() �޼ҵ带 ����Ͽ� ������ �Ǽ� �� ���� ����ϱ�
	 * ������ ����ϱ� ���� int Ÿ������ ĳ����
	 * Math.random() * 10        :   0~10 ������ ������
	 * Math.random() * 40 + 10   :   10~50 ������ ������
	 */

	public static void main(String[] args) {

		int num = (int)(Math.random()*45+1);		
		System.out.println(num);					// 1~45 ������ ������ ���

		System.out.println("--------------------");

		for(int i=0; i<5; i++) {
			int num2 = (int)(Math.random()*45+1);	//1~45 ������ ������ 5�� ���
			System.out.println(num2);
		}
		return;
	}

}
