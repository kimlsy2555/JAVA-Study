package example01;

public class ArrayEx01 {

	public static void main(String[] args) {
	
		// score ���� ���� �̴�. int[]�̴�.
		int [] score= null;
		//score �� 5 ���� ���� �����ٰ� �����ϰ��ִ� 20����Ʈ
		score = new int[5];
		//�迭���� �� �ּҴ�
		System.out.println(score);
		for(int i=0;i<score.length;i++){   
			System.out.println("score["+ i+ "] = "+ score[i]);
		}
		System.out.println();
		//score[0]�� ������ �����ϴٰ� ���� �ȴ�.
		//score�� �ּҴ� .[] �ȿ� ���� ���ڸ� �ε��� ��� �Ѵ�.
			score[0]=100;
			System.out.println(score[0]);
			
			System.out.println();
			
			for(int i=0;i<score.length;i++){   
				 score[i] = i+1;
				 System.out.println("score["+ i+ "] = "+ score[i]);
			}
			
	}

}
