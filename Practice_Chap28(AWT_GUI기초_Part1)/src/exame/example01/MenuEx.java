package exame.example01;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuEx {

	public static void main(String[] args) {
		
		
		Frame frame = new Frame("�޴�");
		frame.setSize(300,200);
		
		// �޴� �� ����
		MenuBar menuBar = new MenuBar();
		
		// �޴��� ������
		Menu mFile = new Menu("����");
		
		// �޴� �������� ������
		
		MenuItem mNew = new MenuItem("������");
		MenuItem mOpen = new MenuItem("����");
		
		// �޴� �������� �ƴ϶� ���� �޴��� ������ ���� �޴��̱� ������
		// �޴��� �߰��Ѵ�.
		Menu mOthers = new Menu("��Ÿ");
		MenuItem mExit = new MenuItem("������");
		
		// �޴����ٰ� �޴� �������� �߰��ϰ� �ִ�.
		mFile.add(mNew);
		mFile.add(mOpen);
		// ������ �޴��� ������ �ϰ� �ִ�.
		mFile.add(mOthers);
		
		// �޴� �и����� �߰�
		mFile.addSeparator();
		
		mFile.add(mExit);
		
		// ��Ÿ �޴��� �� �޴� ������ �����
		
		MenuItem mPrint = new MenuItem("����ϱ�");
		MenuItem mPriview = new MenuItem("�̸�����");
		MenuItem mPsetup = new MenuItem("������ ����");
		
		// ��Ÿ�޴��� �޴������� �߰��ϱ�
		menuBar.add(mFile);
		mOthers.add(mPrint);
		mOthers.add(mPriview);
		mOthers.add(mPsetup);
		
		Menu mEdit = new Menu("����");
		Menu mView = new Menu("����");
		Menu mHelp = new Menu("����");
		
		
		CheckboxMenuItem mStatus = new CheckboxMenuItem("���� ǥ��");
		mView.add(mStatus);
		
		
		// �޴��ٿ��ٰ� �޴����� �� �߰���
		menuBar.add(mEdit);
		menuBar.add(mView);
		menuBar.add(mHelp);
		
		
		
		frame.setMenuBar(menuBar);		
		frame.setVisible(true);
		
		
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			
				System.exit(0);
			}
		});
		
		
     
	
	}

}
