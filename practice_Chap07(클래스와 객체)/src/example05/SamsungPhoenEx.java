package example05;

public class SamsungPhoenEx {

	public static void main(String[] args) {
		SamsungPhone sam = new SamsungPhone();
		SamsungPhone sam1 = new SamsungPhone();
		
		sam.setCompany("�Ｚ");
		sam.setModel("������8");
		sam.setRelease(2018);
		sam.setColor("����");
		
		System.out.println(sam.toString());
		
		
		
		sam1.setCompany("lG");
		sam1.setModel("G6");
		sam1.setRelease(2018);
		sam1.setColor("����");
		System.out.println(sam1.toString());
		
		sam.setCompany("�Ｚ");
		sam.setModel("������7");
		sam.setRelease(2008);
		
		System.out.println(sam.toString());
		
		
	}

}
