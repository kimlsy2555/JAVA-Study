package example02;

public class PlayerrEx {

	public static void main(String[] args) {
		
		// �ڽ��� �ν��Ͻ��� ����� Ŭ���� ������ ������ �ڵ�
		Player player1 = new Player("�̵���", 40, 20, 60);
		player1.info();
		
		System.out.println(); 
		
		// �������� ����� �ڵ� (�ʵ��� ������)
		// ������ �ٺ��� ����� ���Ѵ� , Striker Ŭ������ �ִ� getShoot() �ż����
		// player2�������� ������ �ȵȴ�.
		Player player2 = new Striker("�����", 25, 10, 90,50);
		// �޼��忡�� ��� ���迡 �ִٸ�, �ڼ�Ŭ���� ��������� �ϰ� �Ǹ�
		// ���� �����ϰ��ִ� �ν��Ͻ��� �޼��带 ȣ���Ѵ�.
		player2.info();
		
		System.out.println();
		
		Player player3 = new MidFielder("�̰���", 18, 18, 80,120);
		
		player3.info();
		
		System.out.println();
		
		Player player4 = new Defender("�迵��", 28, 20, 60,60);
		
		player4.info();
	}

}
