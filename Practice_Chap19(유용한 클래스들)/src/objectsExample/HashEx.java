package objectsExample;

public class HashEx {

	public static void main(String[] args) {
		
		Person person1 = new Person(30, "ȫ�浿",new int[] {178,68});
		Person person2 = new Person(30, "ȫ�浿",new int[] {178,68});
		
		int [] arr1= new int[] {178,68};
		int [] arr2= new int[] {178,68};
		// �迭�� �ؽ� �ڵ尡 �ٸ� ������ new ������ �����̴�.
//		System.out.println(arr1.hashCode());
//		System.out.println(arr2.hashCode());
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
	}

}
