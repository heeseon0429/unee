package Day06;

import java.util.Arrays;

public class Test07 {

	// �迭�� �����ϴ� util Ŭ���� �� Arrays�� ���
	/*
	 * �迭 �̸����� ����ϸ� �ּ� �ε����� ��µȴ�.
	 * �迭 ���� �����͸� ����ϱ� ���ؼ� Arrays.toString(�迭�̸�) �޼ҵ带 ����Ѵ�.
	 */
	public static void main(String[] args) {
		String[] names = {"������","������","����","�̼���","������"};
		String[] guild = {"������", "����", "�ұݻ�", null, "�Ƹ޸�ī��"};
		int[] age = {26,26,26,25,26};
		
		// �迭�� �����ϴ� util Ŭ���� => Arrays				//Array.toString()�� ������� ������ �ּҰ� ��µ�
		
		System.out.println(names);						// [Ljava.lang.String;@7637f22
		System.out.println(guild);						// [Ljava.lang.String;@4926097b
		System.out.println(age);						// [I@762efe5d
		
		System.out.println(Arrays.toString(names));		// [������, ������, ����, �̼���, ������]
		System.out.println(Arrays.toString(guild));		// [������, ����, �ұݻ�, null, �Ƹ޸�ī��]
		System.out.println(Arrays.toString(age));		// [26, 26, 26, 25, 26]
		
		guild[2] = "��Ű";								// �迭�� �����͸� �߰��� ������ �� �ִ�.
		System.out.println(Arrays.toString(guild));
	} 

}
