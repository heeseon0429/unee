package Day07;


public class Test02 {

	// �迭 ���� �ڷḦ �������� �˻� ��� �����
	public static void main(String[] args) {
	
		 String[] titles = {"unee", "UNee", "cookie", "love", "everywhere", "anywhere", "uneeverse"};
		 
		 // ������� �迭 ���� ������ ���
		 for(int i=0; i<titles.length; i++) {
			 System.out.println(titles[i]);
		 }
		 
		 // �˻���� ���
		 System.out.println("--------book title : UNee �˻�---------");
		 
		 for(int i=0; i<titles.length; i++) {
			 if(titles[i].equals("UNee")) {
				 System.out.printf("%d, ��ġ %s %n", i, titles[i]);
			 }
		 }
		 
		 System.out.println("--------book title : unee �˻�---------");
		 
		 for(int i=0; i<titles.length; i++) {
			 if(titles[i].toUpperCase().equals("unee".toUpperCase())) {
				 System.out.printf("%d, ��ġ %s %n", i, titles[i]);
			 }
		 }
		 
		 System.out.println("--------book title : unee �˻�---------");
		 
		 for(int i=0; i<titles.length; i++) {
			 if(titles[i].toLowerCase().contains("unee".toLowerCase()))
				 System.out.printf("%d, ��ġ %s %n", i,titles[i]);
		 }
	}

}
