package Day07;

import java.util.Arrays;

public class Test01 {

	// �迭�� ����, ����, �ʱ�ȭ ���� + �迭 �� Ư���� ���� �����ϴ��� Ȯ���� �� �ִ�.
	public static void main(String[] args) {
		
		// ������ ����� ������ �ʱ�ȭ ���� 
		int[] num = {66,77,88,99,100};
		
		System.out.println(Arrays.toString(num));	// [66, 77, 88, 99, 100]
		System.out.println(num.length); 			// length : ���� ��, ���� ����   // 5
		
		for(int i=0; i <num.length; i++) {
			if(num[i] == 100) {
				System.out.printf("�迭 �� %d ��ġ�� ���� %d�̴�. %n", i, num[i]);   //�迭 �� 4 ��ġ�� ���� 100�̴�. 
			}
		}
	}

}
