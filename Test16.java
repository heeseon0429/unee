package Day05;

public class Test16 {

	// for���� Ȱ��
	// 1 ~ ? ���� 500�� �Ѵ� �ڿ��� ���ϱ�
	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		// 1 ~ ? ���� 500�� �Ѵ� �ڿ���
		for (num = 1;  ;  num++) {
			sum += num;
			if (sum >= 500) break;		// ���ǽ��� ���� ��� ���ѷ����� �ȴ�.
		}
		System.out.println(sum);
		System.out.println(num);
		
		}
		
	}

