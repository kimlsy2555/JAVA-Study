package example03;

public class HddEx {

	public static void main(String[] args) {
		
		HddDisk hddDisk= new HddDisk(500,7200);
		
		UsbMemory usbMemory = new UsbMemory(32,960);
		
		System.out.println("HDD ��");
		System.out.println(hddDisk.Status()); 
		
		System.out.println();
		
		System.out.println("USB ��");
		System.out.println(usbMemory.Status());
		
		System.out.println(usbMemory.Status(9999));
	}

}
