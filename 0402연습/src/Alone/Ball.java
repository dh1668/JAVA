package Alone;

public class Ball extends Circle {
	private String color; // Ball 클래스의 필드

	public Ball(String color) { // Ball클래스에 추가한 생성자이다.
		this.color = color;
	}

	public void findcolor() {
		System.out.println(color + " 공이다. ");
	}

	public void findVolume() {
		System.out.println("부피는 4/3*(π*반지름*반지름*반지름)이다.");
	}
}
