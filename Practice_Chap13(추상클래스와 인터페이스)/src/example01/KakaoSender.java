package example01;

public  class  KakaoSender extends ContentSender {
	
	 private String content;

	 
	public KakaoSender(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}

	 
	public String getContent() {
		return content;
	}

	// ����Ŭ������ �߻�޼��带 �������̵���.
	@Override
	public void sendMessage(String recipient) {
		
		System.out.println("���� : " + this.getTitle());
		System.out.println("�̸� : " + this.getName());
		System.out.println("���� : " + this.getContent());
		System.out.println("�޴� ��� : " + recipient);
	}
	
	
}
