package example01;

public class FieldInit {

	byte byteField;    // 1
	short shortField;  // 2
	int intField;      // 4
	long longField;    // 8
	
	boolean boolField; // 1
	char charField;    // 2
	
	float floatField;  // 4
	double doubleField;// 8
	
	
	//������ ����
	
	int[] arrField;    // 4
	String strField;   // 4
	
	
	// annotation : �����Ϸ����� ���� �������� �䱸
	// toString() : Ŭ������ ��������� ������ ���÷� Ȯ���ϰ��� �Ҷ���,
	// ���ϴ� �������� ����������� ����ϰ��� �Ҷ� ����� ���� ��.
	@Override
	public String toString() {
	
		
		String str = "byteField :  " + byteField + " shortField : " +shortField+
					  " intField : " + intField;
		return str;
	}
	
	
	
}
