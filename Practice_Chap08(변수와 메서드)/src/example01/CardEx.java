package example01;

public class CardEx {

	public static void main(String[] args) {
		
		
		Card card1 = new Card();
		Card card2 = new Card();
		card1.setColor("���");
		card1.setCompany("��������");
		
		System.out.println(card1);
		
		
		// static ������ �ݵ�� Ŭ������.static ���������� ����
		// �����ϸ� ���������� �м��ϴ� �ܰ迡���� �ٲ��� �ʴ°� �ٶ����� ���
		Card.width = 80;
		Card.height = 50;
		
		card2.setColor("�Ķ�");
		card2.setCompany("����");
		System.out.println(card2);
		
		card1.show();
	}

}
