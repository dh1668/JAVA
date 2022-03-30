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
		Scanner x = new Scanner(System.in); // 키보드로 입력받을 수 있는 스캐너 객체인 x 를 생성

		int i; // for문에서 반복을 위한 용도의 매개변수
		int check = 0x80000000; // 첫번째 비트가 1인 수
		int check2 = 0x7FFFFFFF; // 16진수의 비트를 가진 2번 째 비트수 //부호비트를 0으로 만들기위해 강제로 만든 비트의수

		System.out.println("정수입력 : "); // 임의의 숫자를 입력을 받기 위함
		int xnum = x.nextInt(); //

		System.out.println(Integer.toBinaryString(xnum)); // xnum을 2진법으로 변환한 값
		System.out.println("미룰 비트 수 입력 : "); // 임의의 숫자를 입력받기위함
		int xnum2 = x.nextInt(); // for문의 반복을 위해 받는 임의의 수

		for (i = 0; i < xnum2; i++) { // 입력받은 xnum2까지 n번 반복해라

			if (xnum >= 0) { // xnum이 0보다 같거나 크면 밑의 적은 조건식로 반복해라

				if ((xnum & 1) == 0) { // xnum이 1과 비트논리곱을 통해 공통의 수가 0이 나오면 밑의 조건식대로 반복해라 // 뒷자리 비트가 0일때의 조건식
					xnum = xnum >> 1; // xnum을 오른쪽으로 shift 1번해라
				} else { // xnum이 1과 비트논리곱으로 공통하는 비트의 수가 1이 나온다면 밑의 조건식을 반복해라
					xnum = xnum >> 1; // xnum을 오른쪽으로 shift 1번해라 //2줄이기때문에 else 옆에 { }꼭하기
					xnum = (xnum | check); // xnum을 check(0x80000000)과 논리합을 한 값이 새로운 xnum값이다
				}
			} else // xnum이 음수일때
			{
				if ((xnum & 1) == 0) { // xnum과 1을 비트논리곱을 통하여 공통의 수가 0이 나오면 밑의 조건식대로 반복해라
					xnum = xnum >> 1; // xnum을 오른쪽으로 1번 shift 해라
					xnum = (xnum & check2); // xnum을 check2(0x7FFFFFFF)와 논리곱을 통하여 나온 값이 새로운 xnum 값이다.
				} else
					xnum = xnum >> 1; // xnum을 오른쪽으로 shift한 1번 한 값이 새로운 xnum값이다.
			}

		}
		System.out.println(Integer.toBinaryString(xnum)); // for문에서 나온 xnum의 값을 2진법으로 표현해라

	}

}