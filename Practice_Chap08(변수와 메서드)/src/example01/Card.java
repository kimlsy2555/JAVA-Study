package example01;

public class Card {
	// �ν��Ͻ� ���� -- �ݵ�� �ν��Ͻ��� �����ؾ� ���� ����
	private String color;
	private String company;
	
	// static ���� (����,Ŭ��������)-- �ν��Ͻ� ���� ���̵� Ŭ������.static ���������� ���� ����
	static int width = 100; // ī���� ��
	static int height = 50; // ī���� ����
	
	
	
	// �ν��Ͻ� �޼���
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void show() {
		// ���������� �ݵ�� �ʱ�ȭ
		// �޼���ȿ� static ������ ��� ���Ѵ� ��������
		// static �� Ư���� �ν��Ͻ� �������̵� �󸶵��� ���� �����ѵ�
		// ���� �ν��Ͻ��� �������� �𸣱� ������ �̷� �ڵ�� �ùٸ� ����̾ƴϴ�.
		//   static int i = 1;
		
		String color = this.color;
		String company = this.company;
		System.out.println(color+" "+company);
	}
	@Override
	public String toString() {
		
		return "card1 �� ���� : "+this.getColor()+" card1�� ȸ�� : "+
		this.getCompany()+" ũ�� : "+Card.height+" �� : "+Card.width;
		
	}
}
