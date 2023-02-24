package Day06;

import java.util.Arrays;

public class Test15 {

	/* 
	 * �迭 ������ �������� ����
	 *  - �迭�� ����, ����, �ʱ�ȭ�� ���ÿ� �� �� �ִ�.
	 *  - .clone() �޼ҵ�� �迭�� �����ϸ�, ������ �����͸� ������ ���ο� ������ �����Ѵ�.
	 *  	: �ڿ��� �迭�� �����͸� �߰��� �����ص� clone �迭���� �ݿ����� �ʴ´�.��
	 *  - Arrays.sort(); �޼ҵ带 ����Ͽ� �迭 ���� �����͸� ������������ ������ �� �ִ�.
	*/
	public static void main(String[] args) {

		int[] n1 = {25, 20, 18, 26, 28, 19};				// �迭�� ����, ����, �ʱ�ȭ�� ���ÿ� �ϴ� ��ũ��Ʈ
		//int[] n1 = new int[] {25, 20, 18, 26, 28, 19};	// new int[] ���� ����
		
		int[] n2 = n1;										// n2�� n1�� ���� �ּ�
		int[] n3 = n1.clone();								// n1�� �����ϵ� ���� ���� �ٶ󺸴°� �ƴ϶� �����ϰ� ������ �����Ѵ�.
		
		System.out.println(Arrays.toString(n1));			// [25, 20, 18, 26, 28, 19]
		System.out.println(Arrays.toString(n2));			// [25, 20, 18, 26, 28, 19]
		System.out.println(Arrays.toString(n3));			// [25, 20, 18, 26, 28, 19]
		
		System.out.println("------------------------");
		n1[0] = 0;
		
		System.out.println(Arrays.toString(n1));			// [0, 20, 18, 26, 28, 19]
		System.out.println(Arrays.toString(n2));			// [0, 20, 18, 26, 28, 19]
		System.out.println(Arrays.toString(n3));			// [25, 20, 18, 26, 28, 19]
		
		System.out.println("------------------------");
		
		Arrays.sort(n1);									// �迭 �� ��������
		System.out.println(Arrays.toString(n1));			// [0, 18, 19, 20, 26, 28]
		
		
		
	}

}
