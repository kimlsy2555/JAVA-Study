package PattenExample;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattenEx02 {

	public static void main(String[] args){
		String[] data = {
						"bat","baby","bonus","ca","cd","c.","car",
						"com","date","zoo","disc"
						};
		
		//Matcher Ŭ������ �̿��� ���
		//Pattern pattern = Pattern.compile("b[a-z]*");
		String pattern = ("c[a-z]*");
		
		Vector <String> vString = new Vector<String>();
		for(String str : data) {
			
			boolean result =  Pattern.matches(pattern, str);
			//Matcher Ŭ������ �̿��� ���
//			Matcher matcher = pattern.matcher(str);
//			
//			// ������ ���ϰ� ��ġ�ϴ°�?
//			if(matcher.matches()) {
//				System.out.println(str);
//				vString.add(str);
//			}
//		}
			if(result) {
				System.out.println(str);
				vString.add(str);
			}
		}
		System.out.println();
		System.out.println("c�� �����ϴ� �ҹ��� ���ܾ� : "+ vString.toString());
		
		
	}
}
