package example02;

public class TvEx {

	public static void main(String[] args) {
		
		Tv<String> tv1 = new Tv<>(); //<string> ���� ����
		tv1.setE("LG OLED TV");
		
		String tvName = tv1.getE(); // ����Ÿ���� String
		System.out.println("TV NAME : "+tvName);
	}

}
