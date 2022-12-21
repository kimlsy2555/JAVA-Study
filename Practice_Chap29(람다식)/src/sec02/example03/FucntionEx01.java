package sec02.example03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import sec02.example04.Student;

public class FucntionEx01 {

	// ArraysŬ������ asList() �� �Ű������� ������ ��ü�� �� ������ ������ؼ�
	// List<T> ���� �����Ѵ�.
	private static List<Student> list = Arrays.asList(
			
			new Student("���Ͽ�","����",100,95),
			new Student("��ä��","����",90,98),
			new Student("�̼���","����",80,92),
			new Student("�̻���","��õ",80,92),
			new Student("��Ը�","�뱸",81,99)
			);
	
	public static void main(String[] args) {
		
		Function<Student,String> function = t-> {return t.getAddress();};
		
		PrtinString(function);
		
		ToIntFunction<Student> toIntFunction = t  ->{return t.getEnglishScore();};
		
		intPrint(toIntFunction,"����");
		
		ToIntFunction<Student> toIntFunction2 = t  ->{return t.getMathScore();};
		
		intPrint(toIntFunction2,"����");
	}
	
	// Function<T,R> �Լ��� �������̽��� T�� �Ű��������Ͽ� R�� �����Ͽ� �����ϴ� �������̽�
	// ���⼭�� �� PrtinString�� �Ű����� Ÿ���� Function<T,R> �Լ��� �������̽��̴�.
	// �׸��� ��, Function<T,R> �Լ��� �������̽��� ������ ���ٽ��� �Ű������� �Ѱ��־�� �Ѵ�.
	
	public static void PrtinString(Function<Student,String> function) {
		
		for(Student student : list) {
			String str = function.apply(student);
			System.out.print("�ּ� : "+str+"\t");
		}
		System.out.println();
	}
	
	public static void intPrint(ToIntFunction<Student> function,String str) {
		
		for(Student student : list) {
			int score =  function.applyAsInt(student);
			
			System.out.print(str+"���� : "+score+"\t");
		}
		System.out.println();
	}
	
	

}
