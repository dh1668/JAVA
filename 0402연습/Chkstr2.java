package 실습Test;

import java.util.Scanner;

class Tr { // Tr 클래스 생성 // 1번째로 해야하는항목(부모클래스 생성)
	String x, y; // Tr 클래스 필드에 변수선언

//				   () ↓매개변수 =메인메소드에서 변수선언해서 생성자메소드에 가져올것들
	public Tr(String P, String Q) { // Tr생성자메소드 = 접근지정자 클래스이름(매개변수 ){}

		this.x = P; // x는 필드멤버변수 , P는 매개변수
		this.y = Q; // y는 필드멤버변수 , Q는 매개변수

	} // Tr생성자 끝

} // Class Tr 끝

class Strcmp extends Tr { // 상속선언 = Strcmp클래스가 Tr클래스의 (필드,메소드)사용할수있다.
	public Strcmp(String P, String Q) { // Strcmp의 생성자메소드
		super(P, Q); // super를 사용해 초기화
	}

	public int cmp() { // Strcmp클래스의 cmp 메소드
		return x.compareTo(y);
		// 문자비교

	}

}

class Numcmp extends Tr {
	public Numcmp(String P, String Q) {
		super(P, Q);
	}

	public int cmp() {
		double a, b;
		// cmp메소드
		a = Double.parseDouble(x); // 숫자인경우
		b = Double.parseDouble(y);
		if (a > b)
			return 1;
		else if (a < b)
			return -1;
		else
			return 0;
//		실수비교

	}

}

class Select extends Tr {

	public Select(String P, String Q) {
		super(P, Q);
	}

	public Tr check() { // 체크 메소드
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == '-' || x.charAt(i) == '.') //
				continue;

			if (Character.isDigit(x.charAt(i)) == false)
				return new Strcmp(x, y);
		}
		return new Numcmp(x, y);
		// s와t가 모두 숫자문자열이면 return new Numcmp(s,t)
		// 그게아님
		// return enw Strcmp(s,t)
	}

	public int connect(Tr Q) {
		// Q를 원래 지식객체도 다운캐스팅 한 후에 해당 cmp 메소드 실행
		if (Q instanceof Strcmp)
			return ((Strcmp) Q).cmp();
		else
			return ((Numcmp) Q).cmp();

	}
}

public class Chkstr2 {
	public static void main(String[] args) { // 2번째 해야할 것. 메인메소드에 공식작성

		Scanner sc = new Scanner(System.in); // 스캐너타입의 객체를 생성하고 참조변수 sc 에 대입한다.
		String s = sc.nextLine(); // 참조변수 sc에 들어간 객체를 문자열형태 s변수에 대입한다.
		String t = sc.nextLine(); // 참조변수 sc에 들어간 객체를 문자열형태 t변수에 대입한다.

		Tr P, Q; // 부모클래스 P,Q 변수 선언 (매개변수에 들어갈 변수들임)

		P = new Select(s, t); // 업캐스팅
		Q = ((Select) P).check(); // 다운캐스팅

		System.out.println(((Select) P).connect(Q));
	} // main()

}// class Chkstr
