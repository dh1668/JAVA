package Chapter1;

import java.io.IOException;
import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) throws IOException {
//		System.out.println("안녕하세요");
//		System.out.println("기분이 좋군요 깔아서");
//		double area = 3.14;
//		System.out.println(area);

//		Scanner in = new Scanner(System.in);
//
//		System.out.print("정수를 입력하세요 : ");
//		String in = in.nextLine();

		// 실습1
//		Scanner num = new Scanner(System.in);
//
//		int check = 80000000; // 앞이1인지 0인지 판단할 방법의 임의의 비교코드
//		int i;
//
//		System.out.println("정수 입력 : ");
//
//		int n = num.nextInt();
//
//		System.out.println("미룰 비트 수 입력 : ");
//		int num2 = num.nextInt();
//
//		String num1 = Integer.toBinaryString(n); // num1 은 2진수변환 n
//		System.out.println(num1);
//
//		for (i = 0; i < num2; i++) {
//			if ((n & check) == 0) {
//				n <<= 1;
//			} else {
//				n >>= 1;
//				n += 1;
//
//			}
//		}
//		System.out.println(Integer.toBinaryString(n)); // 2진수로 출력해라

//		실습2
		Scanner x = new Scanner(System.in);

		int i;
		int check = 0x80000000; // 16진수
		int check2 = 0x7FFFFFFF;

		System.out.println("정수입력 : ");
		int xnum = x.nextInt();

		System.out.println(Integer.toBinaryString(xnum));
		System.out.println("미룰 비트 수 입력 : ");
		int xnum2 = x.nextInt();

		for (i = 0; i < xnum2; i++) {

			if (xnum >= 0) {

				if ((xnum & 1) == 0) { // 뒷자리 비트가 0일때의 조건식
					xnum = xnum >> 1;
				} else {
					xnum = xnum >> 1; // 2줄이기때문에 else 옆에 { }꼭하기
					xnum = (xnum | check);
				}
			} else // 음수일때

			if ((xnum & 1) == 0) {
				xnum = xnum >> 1;
				xnum = (xnum & check2);
			} else
				xnum = xnum >> 1;

		}
		System.out.println(Integer.toBinaryString(xnum));

	}

}