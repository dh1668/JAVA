package Chapter5;

public class 배열1 {

	public static void main(String[] args) {
//		String str1[] = { "ABCD", "abcd" };
//		System.out.println(str1.length); // 배열안의 크기란 것은 << 배열안의 갯수

//		System.out.println("Hello" + "java"); // 문자열 + 문자열
//		System.out.println("num" + 30); // 문자열 + 비문자열(숫자)

//		같은뜻임(1번 ,2 번 같은의미임 하지만 2번쓰는게좋음)
//		1. String str1 = "ABCD"
//		2. String str1 = new String("ABCD") //String '객체'인 str1을 생성

//		String s1 = "abcd";
//		System.out.println(s1);
//		String s1 = new String("dcba");
//		System.out.println(s1); // 이론상으로 기존께 삭제되고 새로운것이 나와야하는데 에러남

		// String 클래스
//		String a = "abcdefg";
//		"abcdefg".charAt(2);
//		System.out.println(charAt);

//		int[] b = { 10, 20, 30, 40 };		//전통적인방식
//		int[] b = new int[] { 10, 20, 30, 40 };		//위랑 같은방식인데 원래대로라면 이렇게 써야하는방식

		System.out.println("합(1~10) : " + sum(1, 10)); // sum 부터 함수콜
		System.out.println("합(10~100) : " + sum(10, 100));
		System.out.println("합(100~1000) : " + sum(100, 1000));
	}

	// 함수정의
	public static int sum(int i1, int i2) {
		int sum = 0;
		for (int i = i1; i <= i2; i++)
			sum += i;

		return sum;

		// main 함수에선 i =1 , j=10 sum(i,j)
		// sun 함수에선 i =1 , j=10 ★call by reference <<파이썬에서는 call by value 없음
		// 주소값 넘겨줘도 (복사해줘도) 다른함수에서 값(내용물)변경된상황 발생시 값은 서로다름(원래 값 그대로임)
	}

}
