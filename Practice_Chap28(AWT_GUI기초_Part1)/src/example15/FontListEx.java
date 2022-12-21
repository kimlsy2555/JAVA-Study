package example15;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class FontListEx {

	public static void main(String[] args) {
	 
		// GraphicsEnvironmentŬ������ GraphicsDeviceŬ���� �� FontŬ��������
		// �����ϰ� �մ� Ŭ�����̴�.
		GraphicsEnvironment gEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		// ��� Font�� �����ͼ� �迭�� ����
	
		Font[] fonts = 	gEnvironment.getAllFonts();
	
		for(int i = 0; i<fonts.length;i++ ){
			System.out.println(fonts[i].getFontName());
		}
	}

}
