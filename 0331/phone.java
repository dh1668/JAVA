package ����;

//����Ÿ�� , (Ŭ����) �����̸�
class phone {   
	
	String phonename;  //Ŭ������ �ʵ� ����
	int Value;
	
	private void print() {   //Ŭ������ �޼ҵ� ����
		System.out.print( Value + " ���� " + phonename + "����Ʈ��");
	}
	
	public static void main(String[] args) {
		
		phone myphone = new phone(); // phone Ÿ��(Ŭ������Ÿ����)��ü�� �����ѵ� ,myphone�̶�� �� ���������� ����
		myphone.phonename = " ������ s20";
		myphone.Value = 100;    //�ʵ�(��������� ��)�� �� �� ����
		myphone.print(); //Ŭ������ ����޼ҵ� ȣ��
		
		phone yourphone = new phone(); //phone Ÿ���� ��ü�� �����ѵ� yourphone�̶��  ���������� ����		
		yourphone.phonename = "iPhone 13";
		yourphone.Value = 150;   //�ʵ忡 �� yourphone�� �� ����
		yourphone.print(); //Ŭ������ ����޼ҵ� ȣ��
		
		
		
		
		
		
	}

}
