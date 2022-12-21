package example08;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> scores = new TreeMap<Integer, String>();
		
		scores.put(87, "ȫ�浿");
		scores.put(98, "������");
		scores.put(75, "�迬��");
		scores.put(95, "�տ���");
		scores.put(80, "����");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("���� ���� ���� : "+entry.getKey()+" - "+entry.getValue());
	
		
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : "+entry.getKey()+" - "+entry.getValue());
		
		System.out.println("===============================");
		
		entry = scores.lowerEntry(95);
		System.out.println("(95������ )95�� �ٷ� �Ʒ��� ����  : "+entry.getKey()+" - "+entry.getValue());
		
		entry = scores.higherEntry(95);
		System.out.println("(95������ )95�� �ٷ� ���� ����  : "+entry.getKey()+" - "+entry.getValue());
		
		System.out.println("===============================");
		
		entry = scores.floorEntry(95);
		System.out.println("(95���� )95�� �ٷ� �Ʒ� ����  : "+entry.getKey()+" - "+entry.getValue());
		
		entry = scores.ceilingEntry(95);
		System.out.println("(95���� )95�� �ٷ� �� ����  : "+entry.getKey()+" - "+entry.getValue());
		
		System.out.println("===============================");
		
		while(!scores.isEmpty()) {
			
			entry = scores.pollFirstEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			
			System.out.println("Key : "+value+" Value : "+str);
			System.out.println("���� ��ü : "+scores.size());
		}
		
		System.out.println("===============================");
		
		scores.put(87, "ȫ�浿");
		scores.put(98, "������");
		scores.put(75, "�迬��");
		scores.put(95, "�տ���");
		scores.put(80, "����");
		
		while(!scores.isEmpty()) {
			
			entry = scores.pollLastEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			
			System.out.println("Key : "+value+" Value : "+str);
			System.out.println("���� ��ü : "+scores.size());
		}
		
		System.out.println("===============================");
		
		scores.put(87, "ȫ�浿");
		scores.put(98, "������");
		scores.put(75, "�迬��");
		scores.put(95, "�տ���");
		scores.put(80, "����");
		
		Set<Map.Entry<Integer,String>> entrySet = scores.entrySet();
		
		Iterator<Map.Entry<Integer, String>> iterator =	entrySet.iterator();
		
		while(iterator.hasNext()) {
			
			Entry<Integer, String> mapentry = iterator.next();
			
			int value = mapentry.getKey();
			String str = mapentry.getValue();
			
			//iterator.remove();
			
			System.out.println("Key : "+value+" Value : "+str);
			System.out.println("���� ��ü : "+scores.size());
			
			
		}
		//KeySet() �̿��ؼ� ����ϱ�
		System.out.print("===============================");
		
		
		
		
		
		
	}

}
