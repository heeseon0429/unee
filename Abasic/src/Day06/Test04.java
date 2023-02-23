package Day06;

public class Test04 {

	// 배열(Array)과 for반복문의 또 다른 기술법
	/*
	 * 배열에서는 null값으로 초기화되며, 가비지 컬렉터에서 메모리를 회수한다.
	 * Math.random()메소드를 사용하여 난수를 발생시킬 수 있다.
	 * for(int data : 변수) {}  --- 배열을 다룰 때 사용하면, 배열에 직접 접근하지 않기에 에러가 날 확률이 낮다.
	 */
	public static void main(String[] args) {

	int[] level = null;							// 배열에서는 초기화를 0이 아닌 null로 해줘야 한다.
	level = new int[5];							// null값이 들어간 배열은 추후 가비지 컬렉터가 메모리를 회수한다. 
												// 방이 5개(0 1 2 3 4)
	
	for(int i=0; i <level.length; i++) {		// i는 0부터 level의 길이만큼까지 1씩 증가해 나간다.
		level[i] = (int)(Math.random()*100);	// Math.random()메소드로 난수를 발생시켜 배열의 데이터로 초기화한다.
	}
	for(int i=0; i <level.length; i++) {		
		System.out.printf("%d ,", level[i]);	
	}
	System.out.println();
	System.out.println("========");
	
	for(int data : level) {						// 새로운 방식의 for 반복문 기술법
		System.out.printf("%d ,", data);		// level이라는 배열에서 int타입의 data를 하나씩 대입하는 반복문
	}
	
	
	}

}
