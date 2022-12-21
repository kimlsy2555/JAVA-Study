package example08;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSortEx {

	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> scores = new TreeMap<Integer, String>();
		
		scores.put(87, "ȫ�浿");
		scores.put(98, "������");
		scores.put(75, "�迬��");
		scores.put(95, "�տ���");
		scores.put(80, "����");
		
		// �����ϱ�(key�� ������ ������ �Ǵ°��� �ָ�)
		// ��������
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		// ���������� �� descendingMap �� entrySet() �����ؼ� Set ���� �����ϰ��ִ�.
		// �ݺ��ڷ����� ȣ���� 
		Set<Map.Entry<Integer, String>>  descendingentrySet =  descendingMap.entrySet();
		// ����ϱ�
		for(Map.Entry<Integer,String> entry : descendingentrySet) {
			
			int value = entry.getKey();
			String str= entry.getValue();
			
			System.out.println("Key : "+value+" "+"Value : "+str);
		}
		System.out.println("=====================");
		
		// �ٽ� ���� �������� �����ϱ�
		
		NavigableMap<Integer, String>  ascendingentryMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>>  ascendingentrySet =  ascendingentryMap.entrySet();
		
		
		for(Map.Entry<Integer,String> entry : ascendingentrySet) {
			
			int value = entry.getKey();
			String str= entry.getValue();
			
			System.out.println("Key : "+value+" "+"Value : "+str);
		}
		
		System.out.println("=====================");
		
		
		// Ű�� �����ͼ� �ݺ��ڷ� ���
		NavigableSet<Integer> keySet = scores.descendingKeySet();
		
		Iterator<Integer> iterator = keySet.iterator();
		
		
		while(iterator.hasNext()) {
			
		
			int value= iterator.next();
			String str = scores.get(value);
			
			System.out.println("Key : "+value+" "+"Value : "+str);
			
		}
		
		
		
		
		
		

	}

}
