package example06;

public class CompareEx {

	public static void main(String[] args) {
		
	int result = Compare.compare(200, 200);
	System.out.println(result);
	
	// StringŬ������ Number Ŭ���� �ϰ�� �ƹ��� ���谡 ����.
	//Compare.compare("���ؼ�", 100);
	
	// Number Ŭ������ ObjcetŬ������ �ڼ��̱� ������ �Ű����� Ÿ������ �������� �ʴ�.
	//Compare.compare(new Object(),new Object());
	
	 result = Compare.compare(new Integer(100), new Double(75.11));
	 System.out.println(result);
	 
	 // Number �� �߻�Ŭ���� �̹Ƿ� �ν��Ͻ��� �������� ���Ѵ�.
	 //result = Compare.compare(new Number(), new Number());
	 System.out.println(result);
	}

}
