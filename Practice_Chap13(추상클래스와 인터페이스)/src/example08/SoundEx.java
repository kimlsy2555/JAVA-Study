package example08;

public class SoundEx {

	public static void main(String[] args) {
		
		// �͸� ������ü(�̸� X) --UI �̺�Ʈ ó���� ������ ��ü �������
		
		Soundable soundable = new Soundable() { // Ÿ��(�ٺ�)�� �������̽� 
			// ���������� Ŭ�����ϱ� ������� ������ �� �ִ�.
			// ������ �ܺο��� ���� �Ұ� 
			// �ʿ�� �Ͻ������� ����Ѵ�
			int a = 10;
			public void method(){
				System.out.println("�͸�����ü �޼���");
			}
			
			@Override
			public void sound() {
				String str = "����";
				System.out.println("ù ��° �͸� ������ü : " + str);
				System.out.println(str +" �� ���� ����ϴ�."); 
				System.out.println(str +" �Ҹ��� ���ϴ�."); 
				this.method();
				System.out.println(this.a);
				
			}
		};
		soundable.sound();
		
	
	
	
	
	}

}
