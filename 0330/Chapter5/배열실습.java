package Chapter5;

import java.util.Scanner;

public class 배열실습 {

	public static void main(String[] args) {
//		실습)주어진 문자열(s) 에서 또 다른 주어진 문자(c) 를 제거하고 역순화 시킨 문자열을 만들어
//		주는 함수 revsqueeze(s, c)를 만드시오
//		- ex) abcabc b > caca
//		- 1) while 또는 for 사용해서 인덱스로 접근해서 해결
//		  2) for each 사용해서 순서열로 접근해서 해결

//		>> 문자열 s에서 c를 제거하고 역변환
//		String s = "abcabc";
//		char c = 'a';

		// 그대로 쓴거
		System.out.println("문자열\n문자"); // "문자열\n문자" 출력을 위한 코드
		Scanner sc = new Scanner(System.in); // 키보드 입력을 받을 수 있는 스캐너객체 변수sc 를 생성
		String s = sc.nextLine(); // 입력받은 문자열을 s에 대입
		char c = sc.next().charAt(0); // 스캐너로 입력받은 문자열에서 0번째 순서에 있는 특정문자를 char 형태의 c에 대입

		String result = revsqueeze(s, c); // 문자열 변수 result에다가 다른메소드(함수) revsqueeze의 결과갑 넣기
		System.out.println(result); // result 출력해보기

	}

	private static String revsqueeze(String s, char c) { // 지역 revsqueeze메소드 생성하되
		char ch;
		String temp = "";
		int i = s.length() - 1;
		while (i >= 0) {
			ch = s.charAt(i);

			if (ch != c) {
				temp += ch;
			}
			i--;
		}
		return temp;

	}
}
//   또다른방법
//	public static String revsqueeze(String ps, char pc) {
//		String temp;
//		temp = new String("");
//
//		for (int i = ps.length() - 1; i >= 0; i--) {
//			if (ps.charAt(i) != pc) {
//				temp = temp + ps.charAt(i);
//			}
//		}
//		return temp;
