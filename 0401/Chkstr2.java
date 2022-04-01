package 실습Test;

import java.util.Scanner;

class Tr {
	String x, y;

	public Tr(String P, String Q) { // Tr생성자

		this.x = P;
		this.y = Q;

	} // Tr생성자

} // Class Tr

class Strcmp extends Tr {
	public Strcmp(String P, String Q) {
		super(P, Q);
	}

	public int cmp() {
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
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		Tr P, Q;

		P = new Select(s, t); // 업캐스팅
		Q = ((Select) P).check(); // 다운캐스팅

		System.out.println(((Select) P).connect(Q));
	} // main()

}// class Chkstr
