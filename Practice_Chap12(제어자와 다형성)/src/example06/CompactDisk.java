package example06;

public class CompactDisk extends Product {
	

	private String albumTitle;
	private String artist;
	
	
	
	public CompactDisk(int proudctID, String description, String maker, int price, String albumTitle, String artist) {
		super(proudctID, description, maker, price);
		this.albumTitle = albumTitle;
		this.artist = artist;
	}
	

	public String getAlbumTitle() {
		return albumTitle;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public void showInfo() {
	
		super.showInfo(); // ����ũ������ �ż��带 ����� ȣ��
		System.out.println("�ٹ����� >> " + this.getAlbumTitle()); 
		System.out.println("���� >> " + this.getArtist()); 
	
		 
	}
	
}
