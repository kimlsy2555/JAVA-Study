package example05;

public class SamsungPhone {
	
	
	private String company;
	private String model;
	private String color;
	private int release;
	 

	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		//���� ó�� �ڵ�
		
		if (!company.equals("�Ｚ"))
		{
			System.out.println("�Ｚ ���� �ƴ�");
			return;
		}
		this.company = company;
	}
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		
		
		if (!(model.equals("������7")||model.equals("������8"))){
			System.out.println("�Ｚ �� �ƴ�");
			this.model = null;
			return;
			
		}
		this.model = model;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	
	
	@Override
	public String toString() {
		
		return this.getCompany()+"ȸ���� " +this.getModel()+
				"���̸�, ������� "+this.getRelease()+"�� �Դϴ�.";
	}
	
	
	
}
