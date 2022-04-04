package Abstract;

//인터페이스사용
import java.util.Scanner;

interface Ts {
	public abstract int cmp();
}

class Tr { // 부모 class

	String str1, str2;

	public Tr() {
	}

	public Tr(String a, String b) { // 생성자
		str1 = a;
		str2 = b;
	}
}

class Str extends Tr implements Ts { // string class

	public Str(String a, String b) {
		super(a, b); // 생성자
	}

	public int cmp() { // 문자 비교 메소드

		int result = str1.compareTo(str2);
		return result;

	}
}

class Num extends Tr implements Ts { // number class

	public Num(String a, String b) {
		super(a, b); // 생성자
	}

	public int cmp() { // 숫자 비교 메소드

		double ss1;
		double ss2;
		int result;

		ss1 = Double.parseDouble(str1);
		ss2 = Double.parseDouble(str2);
		if (ss1 > ss2)
			result = 1;
		else if (ss1 < ss2)
			result = -1;
		else
			result = 0;

		return result;
	}
}

class Select extends Tr { // select class

	public Select(String a, String b) {
		super(a, b); // 생성자
	}

	public Ts check() {
		for (int i = 0; i < str1.length(); i++) {
			if (Character.isDigit(str1.charAt(i)) == true || str1.charAt(i) == '.' || str1.charAt(i) == '-')
				continue;
			else
				return new Str(str1, str2);
		}

		for (int i = 0; i < str2.length(); i++) {
			if (Character.isDigit(str2.charAt(i)) == true || str2.charAt(i) == '.' || str2.charAt(i) == '-')
				continue;
			else
				return new Str(str1, str2);
		}
		return new Num(str1, str2);
	}

}

public class interfaceproject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		Select P = new Select(s, t);
		Ts Q = P.check();

		System.out.print(Q.cmp());

	}

}