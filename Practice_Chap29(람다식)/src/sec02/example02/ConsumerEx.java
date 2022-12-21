package sec02.example02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		
		// String Ÿ���� �Ű������� ������ Consumer���׸� �Լ��� �������̽��� �����ߴ�.
		// t�� ������ String Ÿ���̰� �Ű������� �ȴ�.
		// Consumer�������̽����� ���ϰ��� ���� ���� �ʴ� ���� ��� �ϵ��� ���� 
		//t)->{System.out.println("ConsumerInterfacce : "+ t);};
		// ==> accept() �� ���ٽ����� �����ߴ�
		Consumer<String> consumer =  (t)->{
			
			System.out.println("ConsumerInterfacce : "+ t);
		};

		
		consumer.accept("�Һ��� �������̽� �ڹ� 1.8�߰�");
		
		// bi()Consumer�� 2���� ��ü�� �޾Ƽ�  �Һ��ϴ� �������̽� �̴�.
		BiConsumer<String, String> biConsumer = (t,u)->{
			System.out.println("BiConsumerInterfacce : "+ t+","+u);
		};
		
		biConsumer.accept("�ڹ�", "C++");
		
		DoubleConsumer doubleConsumer = (d) ->{
			System.out.println("DoubleConsumer : "+ d);
		};
		
		doubleConsumer.accept(1.80);
		
		IntConsumer intConsumer = (i)->{
			System.out.println("IntConsumer : "+ i);
		};
		intConsumer.accept(10);
		
		
		// ObjIntConsumer<T> �Լ��� �������̽��� �Ű������� T�� int��(����)�� ������.
		ObjIntConsumer<String> objIntConsumer = (t,i)-> {
			System.out.println("ObjIntConsumer : "+ t+","+i);
		};
		objIntConsumer.accept("�ڹ�", 8);
		
	}

}
