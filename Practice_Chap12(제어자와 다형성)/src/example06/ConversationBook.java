package example06;

public class ConversationBook extends Book {
	

	private String languge;

	public ConversationBook(int proudctID, String description, String maker, int price, int iSBN, String title,
			String author, String languge) {
		super(proudctID, description, maker, price, iSBN, title, author);
		this.languge = languge;
	}
	


	public String getLanguge() {
		return languge;
	}





	@Override
	public void showInfo() {
	
		super.showInfo(); // ����ũ������ �ż��带 ����� ȣ��
		System.out.println("��� >> " + this.getLanguge()); 
	
	
		 
	}
	
}
