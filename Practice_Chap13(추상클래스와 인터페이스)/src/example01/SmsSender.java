package example01;

public  class  SmsSender extends ContentSender {
	
	 private String content;

	 
	public SmsSender(String title, String name, String content) {
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
