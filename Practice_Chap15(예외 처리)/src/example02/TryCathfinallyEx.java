package example02;

public class TryCathfinallyEx {

	public static void main(String[] args) {
		
		
		// ClassŬ������ ���ڿ��� ������ Ŭ������ ���� ��ȯ�� ���ش�.(���� ��ü )
		// �ν��Ͻ��� ������ �˻����� ����� ����ϴ� ���� �ȵȴ�.
		
		try {
			Class class1 = Class.forName("java.lang.String");
			// Class class2 = Class.forName("java.lang.String2"); ���ܹ߻�
			System.out.println("Ŭ������ ã�ҽ��ϴ�.");
			System.out.println(class1.getName()); // ��Ű�� + Ŭ������ ���
			System.out.println(class1.getSimpleName());//Ŭ������ ���
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �����ϴ�.");
		} finally { // �ɼ� (�׻� ����)
			System.out.println("���α׷��� �����ϰ� �����մϴ�.");
		}

	}

}
