package Class; //4.1

import java.util.Scanner;

class Ts { // 4월 1일 실습1
	static final int KING = 0; // 정적변수(=클래스변수)
	static final int QUEEN = 1; // 정적변수(=클래스변수)
	String x, y; // 인스턴스 변수 : 앞에 static 안옴

	// 클래스 TS의 생성자 = main메소드에서 만든공식이 여기 들어간다고 생각
	public Ts(String KING, String QUEEN) { // 필드에서 KING,STR을 상수 라고 고정했고 x,y에 넣을값(=메인메소드에서 받은 문자열형태)
		this.x = KING; // 필드에서 x,y 를 문자열형태로 지정했고 main메소드에서 문자열로 스캐너입력받았기때문에
		this.y = QUEEN; // 필드에서 x,y 를 문자열형태로 지정했고 main메소드에서 문자열로 스캐너입력받았기때문에
	}

	public int check() { // 메인메소드에서 int cond = P.check(); << ()안에 안들어가면 받는 곳도 안쓰는게맞음
//		- 두 문자열이 모두 숫자 문자열 이면 return king
//				 그렇지 않으면 return queen
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == '-' || x.charAt(i) == '.') //
				continue;

			if (Character.isDigit(x.charAt(i)) == false)
				return KING;

		}

		return QUEEN;
	}
}

public class Chkstr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 스캐너 타입의 변수 스캐너 객체를 참조변수 sc에 넣는다.
		String s = sc.nextLine();
		String t = sc.nextLine();
		double a, b;
		int result;

		Ts P = new Ts(s, t); // Ts 타입의 객체를 생성하고 참조변수 P에 넣었다. = 객체생성
		int cond = P.check(); // 객체가 생성이 되었기때문에 P.check가 되는거다 /Static 있을경우 객체생성없이 check만으로 가능

		if (cond == Ts.KING) {
			result = s.compareTo(t); // 문자인경우
		} else {
			a = Double.parseDouble(s); // 숫자인경우
			b = Double.parseDouble(t);
			if (a > b)
				result = 1;
			else if (a < b)
				result = -1;
			else
				result = 0;
		}
		System.out.print(result);

	} // Main 메소드 영역까지

}

// Class Chkstr 영역까지
