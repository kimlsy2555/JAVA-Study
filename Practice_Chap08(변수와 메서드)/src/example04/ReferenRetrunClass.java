package example04;

class Data{
	int data;
}
public class ReferenRetrunClass {

	public static Data copy(Data d) {
		Data cloned = new Data();
		System.out.println("d �ּ� : "+d);
		
		
		System.out.println("cloned �ּ� : "+cloned);
		
		cloned.data = d.data;
	
		return cloned;
		
	}
	
	public static void main(String[] args) {
		
		Data ori= new Data();
		ori.data =100;
		
		System.out.println("ori �ּ� : "+ori);

		Data cloned = copy(ori);
		
		System.out.println("cloned �ּ� : "+cloned);
		
		System.out.println(cloned.data);
		
	}
	

}
