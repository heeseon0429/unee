package Day06;

public class Test04 {

	// �迭(Array)�� for�ݺ����� �� �ٸ� �����
	/*
	 * �迭������ null������ �ʱ�ȭ�Ǹ�, ������ �÷��Ϳ��� �޸𸮸� ȸ���Ѵ�.
	 * Math.random()�޼ҵ带 ����Ͽ� ������ �߻���ų �� �ִ�.
	 * for(int data : ����) {}  --- �迭�� �ٷ� �� ����ϸ�, �迭�� ���� �������� �ʱ⿡ ������ �� Ȯ���� ����.
	 */
	public static void main(String[] args) {

	int[] level = null;							// �迭������ �ʱ�ȭ�� 0�� �ƴ� null�� ����� �Ѵ�.
	level = new int[5];							// null���� �� �迭�� ���� ������ �÷��Ͱ� �޸𸮸� ȸ���Ѵ�. 
												// ���� 5��(0 1 2 3 4)
	
	for(int i=0; i <level.length; i++) {		// i�� 0���� level�� ���̸�ŭ���� 1�� ������ ������.
		level[i] = (int)(Math.random()*100);	// Math.random()�޼ҵ�� ������ �߻����� �迭�� �����ͷ� �ʱ�ȭ�Ѵ�.
	}
	for(int i=0; i <level.length; i++) {		
		System.out.printf("%d ,", level[i]);	
	}
	System.out.println();
	System.out.println("========");
	
	for(int data : level) {						// ���ο� ����� for �ݺ��� �����
		System.out.printf("%d ,", data);		// level�̶�� �迭���� intŸ���� data�� �ϳ��� �����ϴ� �ݺ���
	}
	
	
	}

}
