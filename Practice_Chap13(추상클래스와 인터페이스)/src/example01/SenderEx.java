package example01;

public class SenderEx {

	public static void main(String[] args) {
		// ContentSender �� �߻� Ŭ���� �̴� ���� �ν��Ͻ��� ���� �� ���� ����.
		// ContentSender contentSender = new ContentSender();
		// �߻�Ŭ������ �����̴ϱ� �ʵ��� �������� �����
		ContentSender contentSender1 = new KakaoSender("���������� ������", "��Ը�"
														, "��ȣ��");
		
		contentSender1.sendMessage("���Ͽ�");
		System.out.println();
		
		ContentSender contentSender2 = new SmsSender("SMS", "���Ͽ�"
													, "���ι̽�����");
		
		contentSender2.sendMessage("��ä��");
		
		
	}

}
