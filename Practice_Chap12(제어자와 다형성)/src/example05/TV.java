package example05;

public class TV extends Product{
	// ����Ŭ������ �Ű������� �ִ� ������ Product(int price) ȣ��
	public TV() {
		super(300);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}
