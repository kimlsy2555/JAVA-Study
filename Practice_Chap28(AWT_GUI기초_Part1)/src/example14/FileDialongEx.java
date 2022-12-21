package example14;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialongEx {

	public static void main(String[] args) {
		 
		Frame frame = new Frame("���� ���̾�α�");
		
		frame.setSize(200,200);
		
		// mode�� �⺻ ���� FileDialog.LOAD������ ��� , FileDialog.SAVE��
		// ����������. 
		FileDialog fileOpen = new FileDialog(frame, "���Ͽ���",FileDialog.LOAD);
		FileDialog fileSave = new FileDialog(frame, "���Ͽ���",FileDialog.SAVE);
		
		frame.setVisible(true);
		fileOpen.setVisible(true);
		fileSave.setVisible(true);
		
		System.out.println("���� ���� ��� �� �̸� : "+fileOpen.getDirectory()+fileOpen.getFile());
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	}

}
