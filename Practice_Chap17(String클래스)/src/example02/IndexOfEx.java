package example02;

public class IndexOfEx {

	public static void main(String[] args) {
		
		//indexOf �޼���� ã�� ����� �Ҷ� , ���� ���δ�.(����  ��)
		
		String  str = "������ �ڹ� ���ΰ� �ϱ� ����..�Ф�";
		int index = str.indexOf("�Ȱ���");
		System.out.println("������ ���� �� ��ȣ  �迭 ��ȣ : " +index);
		// ���ζ�� ���ڿ��� ���ԵǾ� ������..
		
		if(str.indexOf("����")!= -1) {
			System.out.println("���ο� ���õ� ����");
		}
		else {
			System.out.println("���ο� ���þ��� ����");
		}

	}

}
