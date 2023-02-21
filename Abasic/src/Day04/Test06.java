package Day04;

public class Test06 {
	
	// ÀÍ¸íÃ³¸®ÇÑ °á°ú°ªÀÇ Ãâ·Â
	public static void main(String[] args) {
		String name = "À±Èñ¼±";
		
		System.out.println(name.charAt(0) + "**");										//À±**
		System.out.println(name.charAt(0) + "*" + name.charAt(name.length()-1));		//À±*¼±
		
		System.out.printf("%c** %n", name.charAt(0));									//À±**
		System.out.printf("%c*%c %n", name.charAt(0), name.charAt(name.length()-1));	//À±*¼±
	}
}
