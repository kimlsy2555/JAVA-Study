
public class Main_Arguments {

	
	public static void main(String[] args) {
		
		//main() �� �Ű������� Ȱ���ϴ� ���
		if(args.length !=2) {
			
			System.out.println("���α׷��� ����");
			System.out.println("���̵� �Է� �н������Է�");
		}
		String str1= args[0];
		String str2= args[1];
		
		System.out.println("���̵� : "+str1);
		System.out.println("�н����� : "+str2);
		
		
		int count  = Integer.parseInt(str1);
		int tatal  = count + 500;
		System.out.println(count);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

