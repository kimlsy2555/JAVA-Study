package example06;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CheckBoxEx {

	public static void main(String[] args) {


		Frame frame = new Frame("CheckBox");
		frame.setSize(305,250);
		
		// �������� ���̾ƿ� �Ŵ����� BorderLayout �ε� ���⼭��
		// FlowLayout�� �������� 
		// FlowLayout ����� ��ġ�� �� �������
		// �������� �������� ������Ʈ�� ���Ľ�Ų��.
		// ������ ���� ������ ���� �ߴ�.
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		// Checkbox �� ���������� ������ �ϰ� �Ǹ� ���� ������ �Ǿ�����.(�߿�)
		Label q1 = new Label("1. ����� ���� �оߴ�?(���� ���� ����)");
		
		// true �Ű����� �ָ� ���õ� ���·� ��������.
		Checkbox news = new Checkbox("news",true);
		Checkbox sports = new Checkbox("sports");
		Checkbox movies = new Checkbox("movies");
		Checkbox music = new Checkbox("music");
		
		frame.add(q1);
		frame.add(news);
		frame.add(sports);
		frame.add(movies);
		frame.add(music);
		
		// Checkbox �� �����ϸ� �Ҽ��� group1���� �����.
		// true�� ���õ� ������ ��Ÿ����. (���� ��ư)
		
		Label q2 = new Label("2. �󸶳� ���� ���忡 ���ʴϱ�?");
		
		CheckboxGroup group1 = new CheckboxGroup();// �׷� ����
		
		Checkbox movie1 = new Checkbox("�Ѵ޿� �ѹ�",group1,false);
		Checkbox movie2 = new Checkbox("�����Ͽ� �ѹ�",group1,false);
		Checkbox movie3 = new Checkbox("�����Ͽ� �ι�",group1,false);
		
		frame.add(q2);
		frame.add(movie1);
		frame.add(movie2);
		frame.add(movie3);
		

		frame.setVisible(true);
		
	}

}
