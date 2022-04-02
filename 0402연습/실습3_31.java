package 실습Test;

import java.util.Scanner;

public class 실습3_31 {

	public static void main(String[] args) {
		// p. 108, 109 , p.186 참고
		String result;
		Scanner sc = new Scanner(System.in);

		System.out.println("입력받을 값 : ");
		String s = sc.nextLine();
		System.out.println("a 값 : ");
		String a = sc.nextLine();
		System.out.println("b 갯수 : ");
		String b = sc.nextLine();

		result = midstr(s, a, b);
		System.out.println(result);

	}

	public static String midstr(String... strs) {

		Scanner sc = new Scanner(System.in);

		String ps = strs[0];
		int pa = Integer.parseInt(strs[1]);
		int pb = Integer.parseInt(strs[1]);
		String temp = new String("");

		return ps.substring(pb - 1, pb + 1);

	}

}
