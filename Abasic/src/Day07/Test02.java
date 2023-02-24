package Day07;


public class Test02 {

	// 배열 내의 자료를 바탕으로 검색 기능 만들기
	public static void main(String[] args) {
	
		 String[] titles = {"unee", "UNee", "cookie", "love", "everywhere", "anywhere", "uneeverse"};
		 
		 // 순서대로 배열 내의 데이터 출력
		 for(int i=0; i<titles.length; i++) {
			 System.out.println(titles[i]);
		 }
		 
		 // 검색결과 출력
		 System.out.println("--------book title : UNee 검색---------");
		 
		 for(int i=0; i<titles.length; i++) {
			 if(titles[i].equals("UNee")) {
				 System.out.printf("%d, 위치 %s %n", i, titles[i]);
			 }
		 }
		 
		 System.out.println("--------book title : unee 검색---------");
		 
		 for(int i=0; i<titles.length; i++) {
			 if(titles[i].toUpperCase().equals("unee".toUpperCase())) {
				 System.out.printf("%d, 위치 %s %n", i, titles[i]);
			 }
		 }
		 
		 System.out.println("--------book title : unee 검색---------");
		 
		 for(int i=0; i<titles.length; i++) {
			 if(titles[i].toLowerCase().contains("unee".toLowerCase()))
				 System.out.printf("%d, 위치 %s %n", i,titles[i]);
		 }
	}

}
