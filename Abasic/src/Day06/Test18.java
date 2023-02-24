package Day06;


public class Test18 {

	// 배열 내의 데이터를 역순으로 출력하는 동시에 문자열도 역순으로 출력
	public static void main(String[] args) {

		String[] strData = {"Hello unee", "jjanggu", "cookie love", "love is anywhere"};
		 
		// 문자열 역순 출력
//		for(int i=0; strData.length > i; i++) {				// strData의 값을 하나씩 추출
//			String subData = strData[i];					// 추출한 strData의 값을 변수 subData에 저장한다.
//			
//
//			StringBuilder sb = new StringBuilder();			// 문자열이 저장될 StringBuilder를 생성한다.
//			for(int j = subData.length()-1; j>=0; j--) {	// subData의 데이터를 1글자씩 역순으로 추출하여 append 메소드로 저장
//				sb.append(subData.charAt(j));
//			}
//			subData = sb.toString();						// subData에 저장된 값을 String 타입으로 변화한다.
//			System.out.println(subData);					// i = 0일 떄부터 순서대로 subData에 저장된 데이터를 출력한다.
//		}
		
		
		// 문자열 역순 + 데이터 역순 출력
		for(int i = strData.length-1; i>=0; i--) {
			String data = strData[i];						// 배열 strData에서 꺼낸 값을 String타입 변수 data애 대입
			int last = data.length()-1;						// 변수 data의 길이를 int타입 변수 last에 대입
			for(int idx = last; idx >=0; idx--) {			// 변수 data의 길이에 해당하는 수부터 역순으로 가는 int 타입 변수 idx
				System.out.print(data.charAt(idx));			// 변수 idx에 해당하는 순서대로 1글자씩 출력
			}
			System.out.println();							// 다음 문자열과 구분하기 위한 줄바꿈 처리
		}
	}														// erehwyna si evol
															// evol eikooc
															// uggnajj
															// eenu olleH


}
