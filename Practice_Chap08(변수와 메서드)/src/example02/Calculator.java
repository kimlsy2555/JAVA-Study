package example02;

public class Calculator {

	// �ν��Ͻ� �޼���
	// �ν��Ͻ� �޼��� Ư¡ : new �����ڷ� �ν��Ͻ��� �����ؾ�����
	// ����������.�ν��Ͻ��޽�������� ����
	public int add(int x ,int y) 
	{
		System.out.println(Calculator.divide(10.5,11));
		return x+y;
	}
	
	public int substract(int x, int y) {return x-y;}
	
	//static(���� �޼���)
	// static Ư�� : �ν��Ͻ� �������� Ŭ������.���� �޽��� ������ �ٷ�����
	public static long multiply(long x,long y)
	{	// static �޼��� �̹� �޸� ��ܿ� �ö��ְ� �ν��Ͻ� �������� ������ �����ؾ��ϵǴµ�,
		// �Ʒ��ڵ�� �ν��Ͻ��� �����Ǿ������ ��밡���� add()�� �Ա� ������ ���ܰ� �߻��ϴ� ���̴�.
		// �ν��Ͻ��� ���� �������� �ƹ��� �𸣱� ������ static �޼��� �ȿ��� �ν��Ͻ� �޼��尡 ������ ���� �ȵȴ�.
		
		// this.add(); 
		return x*y;
	}
	
	public static double divide(double x, double y)
	{
		return x/y;
	}
	
	
}
