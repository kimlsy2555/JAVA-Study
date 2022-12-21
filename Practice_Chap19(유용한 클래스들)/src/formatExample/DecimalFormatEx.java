package formatExample;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		
		double number = 5577669.88;
		
		// 0�� �ڸ����� �� �����ϰ� ǥ���� �ϴ� �ݸ� 
		// #�� ǥ���� �� �ϵ� �ڸ��� ���� �������� ǥ�ð� �ȵ�
		DecimalFormat dfFormat = new DecimalFormat("0");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("0.0");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("00000000000.000000");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("#");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("#.#");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("#######.######");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("#,###.00");
		System.out.println(dfFormat.format(number));
		
		
		
	}

}
