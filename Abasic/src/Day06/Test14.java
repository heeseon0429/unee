package Day06;

public class Test14 {

	// String Ÿ������ �� ���� �Էµ� �����͸� ������ ����� �� �ִ�.
	public static void main(String[] args) {

		// �� ���� �Էµ� �����͸� ������ ����ϱ�
		String name = "����/F/98/100";
		String[] names = name.split("/");
		
		double sum = 0;
		for(int i=2; i<names.length;i++) {		// �迭�� ���̿����� ()�� ������� �ʴ´�.
			sum += Integer.parseInt(names[i]);	// �迭�� �����͸� intŸ������ ĳ�����Ͽ� �����Ѵ�.
		}
		System.out.printf("%c**  , ��� %.2f", names[0].charAt(0), sum/2);
	}

}
