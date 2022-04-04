package Abstract;

import java.util.Scanner;

//추상클래스를 사용한거
abstract class Tr { // 부모 class

	String str1, str2;

	public Tr(String x, String y) { // 생성자
		this.str1 = x;
		this.str2 = y;
	}

	public abstract int cmp(); // cmp 추상 메서드

}

class Str extends Tr { // string class

	public Str(String x, String y) {
		super(x, y); // 생성자
	}

	public int cmp() { // 문자 비교 cmp 메소드

		int result = str1.compareTo(str2); // x , y 의 입력된 문자열이 가지고있는 문자들 고유의 아스키번호를 더해서 그 숫자 사이의 차이를 비교해라.
		return result;

	}

}

class Num extends Tr { // number class

	public Num(String x, String y) {
		super(x, y); // 생성자
	}

	public int cmp() { // 숫자 비교 cmp 메소드

		double ss1;
		double ss2;
		int result;

		ss1 = Double.parseDouble(str1); // 숫자로 변환.
		ss2 = Double.parseDouble(str2); // 파란Double은 더블형타입으로 변환해라 . parseDouble은()안에 들어가는 문자,문자열이 Double 형인지 확인
		if (ss1 > ss2)
			result = 1;
		else if (ss1 < ss2)
			result = -1;
		else
			result = 0;

		return result;
	}

}

class Select { // 4) 두문자열을 조사하는 상속관계가 아니기 때문에 extends 를사용 하지않는거임

	String ss, tt;

	public Select(String x, String y) { // 생성자
		ss = x;
		tt = y;
	}

	public Tr check() {
		for (int i = 0; i < ss.length(); i++) {
			if (Character.isDigit(ss.charAt(i)) == true || ss.charAt(i) == '.' || ss.charAt(i) == '-')
				continue;
			else
				return new Str(ss, tt);
		}

		for (int i = 0; i < tt.length(); i++) {
			if (Character.isDigit(tt.charAt(i)) == true || tt.charAt(i) == '.' || tt.charAt(i) == '-')
				continue;
			else
				return new Str(ss, tt);
		}
		return new Num(ss, tt);
	}
}

public class project01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 스캐너 타입의 객체를 생성하여 참조변수 sc에 대입하겟다
		String s = sc.nextLine(); // 문제에서 문자열을 조사하라고해서 nextLine()을사용
		String t = sc.nextLine();

		Select P = new Select(s, t); // select
		Tr Q = P.check();

		System.out.println(Q.cmp()); // cmp 추상메소드 > Str,Num cmp() 접근 가능(다운캐스팅 X)

	}

}