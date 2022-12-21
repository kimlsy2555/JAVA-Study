package sec02.example08;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {

	public static void main(String[] args) {
		
		IntPredicate predicateA = x -> 
			{return (x%2) == 0; }; //2 �� ��� ���ؼ� Ȯ�� ���ٽ�
		IntPredicate predicateB = x -> 
			{return (x%3) == 0; }; //3 �� ��� ���ؼ� Ȯ�� ���ٽ�
	
			System.out.println("15 �� 2�� ��� ? >>"+predicateA.test(15));
			System.out.println("15 �� 3�� ��� ? >>"+predicateB.test(15));
			
			// and() �� �Ѵ� ���Ͻ� ���� ����
			IntPredicate predicateAB = predicateA.and(predicateB);
			System.out.println("6 �� 2��3�� ����� ? >>"+predicateAB.test(6));
	
			// or() �� �ϳ��� ���̸� ���� ����
			predicateAB = predicateA.and(predicateB);
			System.out.println("7 �� 2��3�� ��� ? >>"+predicateAB.test(7));
			System.out.println("8 �� 2��3�� ��� ? >>"+predicateAB.test(8));
			
			// negate() �� true �̸� false�� ���� , false�� true �� ����
			
			predicateAB = predicateA.negate();
			 
			System.out.println("8 �� ¦�� ? >>"+predicateAB.test(8));
					
	}

}
