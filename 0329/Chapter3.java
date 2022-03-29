package Chapter1;

import java.util.Scanner;

public class Chapter3 {

	public static void main(String[] args) {
//		int sum = 0;
//		int i = 0;
//
//		while (true) {
//			if (sum > 100)
//				break;
//			i++; // 100보다커지면 빠져나옴
//			sum += i;
//		}
//		System.out.println("i = :" + i);
//		System.out.println("sum = :" + sum);

//		int i = 97;
//		String s = "Java";
//		double f = 3.14f;
//		System.out.printf("%d\n", i);
//		System.out.printf("%o\n", i);
//		System.out.printf("%x\n", i);
//		System.out.printf("%c\n", i);
//		System.out.printf("%5d\n", i);
//		System.out.printf("%05d\n", i);
//		System.out.printf("%s\n", s);
//		System.out.printf("%5s\n", s);
//		System.out.printf("%-5s\n", s);
//		System.out.printf("%f\n", f);
//		System.out.printf("%e\n", f);
//		System.out.printf("%4.1f\n", f);
//		System.out.printf("%04.1f\n", f);
//		System.out.printf("%-4.1f\n", f);

//		int a = 97;
//		System.out.printf("%d", a);

		// 실습
		// 주어진 정수형 데이터를 왼쪽으로 n-bit circular shift 시켜주는 프로그램 짜시오

//		010000...00110를 2bit 왼쪽으로 circular shift 시키면 000000...011001
//		
//		-입력은 num=scanner.nextInt()
//				n=scanner.nextInt()

//		-출력은 입력된 num을 2진수로 출력, n -bit circular shift 된 num 2진수로 출력
//		System.out.println(Integer.toBinaryString(num));
//		
//		-check = 0x80000000    //   0이 7개
//		
//		비트 | 쓰는 경우 : 정보추가시킬때 사용
//		비트 & 쓰는 경우 : 정보추출할때 사용
		Scanner num = new Scanner(System.in);

		System.out.printf("정수를 입력 : %b", num);
		int n = num.nextInt();

//		System.out.println(Integer.toBinaryString(num));  //10진수에서 2진수출력법

	}

}
