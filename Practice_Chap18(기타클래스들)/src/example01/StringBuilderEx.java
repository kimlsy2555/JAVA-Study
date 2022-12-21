package example01;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		// StringBuilder, StringBuffer Ŭ������ ���� (�ӽ�����޸�) ��
		// �̿��ϱ� ������ ���ο� �ν��Ͻ��� �����Ǵ� ���� �ƴ϶� �ϳ��� �ν��Ͻ���
		// ������ ���ڿ��� ���� �� �� �ִ�
		StringBuilder sBuilder = new StringBuilder("JAVA");
	
		System.out.println(sBuilder);
		//System.out.println(sBuilder.hashCode());
		
		sBuilder.append("Program");
		System.out.println(sBuilder);
		//System.out.println(sBuilder.hashCode());
		
		
		
		sBuilder.insert(1,"��"); // �ε��� �߰� ����
		sBuilder.insert(1,100); // �ڵ� ���ڿ��� �ν�
		System.out.println(sBuilder);
		
		sBuilder.setCharAt(0,'R');// �ε��� �����
		System.out.println(sBuilder);
		
		sBuilder.reverse(); // ���� ���� �����
		System.out.println(sBuilder);
		
		sBuilder.delete(0,3);
		System.out.println(sBuilder); // string Ŭ�������� ������ �κ��� �ε����� ���� ����
		
		int length = sBuilder.length();
		System.out.println("�ѹ��ڼ� " + length);
	
		
	}

}
