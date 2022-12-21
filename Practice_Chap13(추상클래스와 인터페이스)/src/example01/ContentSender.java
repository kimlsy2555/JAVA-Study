package example01;

// �߻�Ŭ������? : 1���̻��� �߻�޼��带 �����ϴ� Ŭ������ �߻�Ŭ����
// �߻�Ŭ������ �ν��ʹ��� ���� ������ ���� ����.
// �߻�޼���� ����θ� �����ϰ� �����ΰ� ���� ��
public abstract class ContentSender {
	
	private String title;
	private String name;
	
	//������
	public ContentSender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}

	
	
	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}
	
	// �߻� �޼��� -> ����� ���ؼ� �ݵ�� �����ǰ� �Ǿ�� ��μ�
	// �ν��Ͻ��� ������ �� �ִ�.
	
	public abstract void sendMessage(String content);
}
