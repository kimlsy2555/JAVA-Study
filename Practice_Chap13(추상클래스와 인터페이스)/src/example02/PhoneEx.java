package example02;

public class PhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SmartPhone smarPhone = new SmartPhone(190815, "���ؼ�", "LG-V50");
		smarPhone.showInfo();
		smarPhone.turnOn();
		smarPhone.turnOff();
		smarPhone.interntSearch();
		System.out.println("----------------------");
		
		
		FolderblePhone folderblePhone = new FolderblePhone(190920, "Ƽ�ƶ�", "SANSUNG");
		folderblePhone.showInfo();
		folderblePhone.turnOn();
		folderblePhone.turnOff();
		folderblePhone.foldOn();;
		folderblePhone.foldOff();;
		System.out.println("----------------------");
		
	}

}
