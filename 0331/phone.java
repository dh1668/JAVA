package 복습;

//변수타입 , (클래스) 변수이름
class phone {   
	
	String phonename;  //클래스의 필드 생성
	int Value;
	
	private void print() {   //클래스의 메소드 생성
		System.out.print( Value + " 만원 " + phonename + "스마트폰");
	}
	
	public static void main(String[] args) {
		
		phone myphone = new phone(); // phone 타입(클래스의타입임)객체를 생성한뒤 ,myphone이라는 를 참조변수에 대입
		myphone.phonename = " 갤럭시 s20";
		myphone.Value = 100;    //필드(멤버변수의 값)에 들어갈 값 생성
		myphone.print(); //클래스의 멤버메소드 호출
		
		phone yourphone = new phone(); //phone 타입의 객체를 생성한뒤 yourphone이라는  참조변수에 대입		
		yourphone.phonename = "iPhone 13";
		yourphone.Value = 150;   //필드에 들어갈 yourphone의 값 생성
		yourphone.print(); //클래스의 멤버메소드 호출
		
		
		
		
		
		
	}

}
