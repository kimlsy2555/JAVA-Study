package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class Person {

	int age;
	String name;
	
	int[] arr;


	public Person(int age, String name, int[] arr) {
		
		this.age = age;
		this.name = name;
		this.arr = arr;
	}
	
	@Override
	public int hashCode() {
		
		// ����ȣȯ �� ���ؼ� �Ʒ��� ���� �ۼ��� �ϸ� �ȴ�. (������)
//		return this.age + this.name.hashCode()
//		+Arrays.toString(this.arr).hashCode();
		
		//�ű� ������ ��, �Ʒ��� �ۼ��� �ϸ� �ؽ��ڵ� ��Ⱑ ����� �����ϴ�(�Ź���)
		return Objects.hash(this.age,this.name,Arrays.toString(this.arr));
	
	
	}
}	
