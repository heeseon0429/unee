package Day06;

import java.util.Arrays;

public class Test14 {

	/* 배열과 리사이징, 배열 복사
	*    - 사용이 끝난 배열은 null값으로 초기화시켜, 가비지 컬렉터가 메모리를 회수할 수 있게 한다.
	*    - 배열 : 동일한 데이터 타입으로 여러 개의 방을 만들어서 하나의 이름으로 사용하며, 위치 인덱스가 필수적
	*    - 배열은 메모리에 할당될 때 연속적인 공간에 배치된다.
	*    - 배열은 한 번 생성되고 나면 리사이징이 안 된다.
	*/
	public static void main(String[] args) {

		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {			// i는 0부터 num의 길이까지 1씩 증가
			num[i] = (int)(Math.random()*100);		// 배열에 들어갈 값을 난수 발생시켜 int 타입으로 대입
		}
		System.out.println(Arrays.toString(num));
		
		// 배열 복사
		int[] temp = new int[num.length*2];			// num의 배열보다 크기가 2배인 배열 생성
		System.out.println(Arrays.toString(temp));
		
		// system.arraycopy(src, srcPos,     dest,  destPos, length);
		// system.arraycopy(원본, 원본복사시작점, 복사본, 복사시작점, 복사할 양);
		
		System.arraycopy(num, 0, temp, 0, num.length);
		System.out.println(Arrays.toString(temp));
		
		
		
		
	}

}
