package Day06;


public class Test18 {

	// �迭 ���� �����͸� �������� ����ϴ� ���ÿ� ���ڿ��� �������� ���
	public static void main(String[] args) {

		String[] strData = {"Hello unee", "jjanggu", "cookie love", "love is anywhere"};
		 
		// ���ڿ� ���� ���
//		for(int i=0; strData.length > i; i++) {				// strData�� ���� �ϳ��� ����
//			String subData = strData[i];					// ������ strData�� ���� ���� subData�� �����Ѵ�.
//			
//
//			StringBuilder sb = new StringBuilder();			// ���ڿ��� ����� StringBuilder�� �����Ѵ�.
//			for(int j = subData.length()-1; j>=0; j--) {	// subData�� �����͸� 1���ھ� �������� �����Ͽ� append �޼ҵ�� ����
//				sb.append(subData.charAt(j));
//			}
//			subData = sb.toString();						// subData�� ����� ���� String Ÿ������ ��ȭ�Ѵ�.
//			System.out.println(subData);					// i = 0�� ������ ������� subData�� ����� �����͸� ����Ѵ�.
//		}
		
		
		// ���ڿ� ���� + ������ ���� ���
		for(int i = strData.length-1; i>=0; i--) {
			String data = strData[i];						// �迭 strData���� ���� ���� StringŸ�� ���� data�� ����
			int last = data.length()-1;						// ���� data�� ���̸� intŸ�� ���� last�� ����
			for(int idx = last; idx >=0; idx--) {			// ���� data�� ���̿� �ش��ϴ� ������ �������� ���� int Ÿ�� ���� idx
				System.out.print(data.charAt(idx));			// ���� idx�� �ش��ϴ� ������� 1���ھ� ���
			}
			System.out.println();							// ���� ���ڿ��� �����ϱ� ���� �ٹٲ� ó��
		}
	}														// erehwyna si evol
															// evol eikooc
															// uggnajj
															// eenu olleH


}
