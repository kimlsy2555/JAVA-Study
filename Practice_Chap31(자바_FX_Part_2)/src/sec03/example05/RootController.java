package sec03.example05;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;



public class RootController implements Initializable{
	
	// FXML�� ������ ���´�
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	
	private boolean endOfMedia;// �÷��� ����
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// ����� �ҽ� (Media)�� �����ϴ� �ڵ�
		
		// �����
		//Media media = new Media(getClass().getResource("media/audio.mp3").toString());
		// ������
		Media media = new Media(getClass().getResource("media/�׽�Ʈ������.mp4").toString());
		
		//MediaView�� ��Ʈ���� MediaPlayerŬ������ �����ϴ� �ڵ�
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		//MediaPlayerŬ������ �����ϴ� ������ MediaView�� �����ֱ� ���ؼ� �Ʒ��Ͱ��� �ۼ�
		mediaView.setMediaPlayer(mediaPlayer);
		
		// �ҽ��� �м��� ����� �ȵǾ��µ� play()ȣ���ϸ� �ȵ�(���� ����)
		// mediaPlayer.play();
		// �ҽ��м��� ������ Unknown���� Ready���°� �Ǹ� �Ʒ��� ���� �ڵ带 �ۼ��ϸ� �ȴ�.
		
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				// setDisable() �Ű����� true �̸� ��Ȱ��ȭ ,flase�� Ȱ��ȭ
				btnPlay.setDisable(false); // �����ư�� Ȱ��ȭ
				btnPause.setDisable(true); // �Ͻ����� ��ư ��Ȱ��ȭ
				btnStop.setDisable(true);  // ���� ��ư ��Ȱ��ȭ	
			}
		});
		
		
		// �̵��ҽ��� ����ǰ� ���� ���� �����ؼ� ������ ������ ���ٽ����� �ڵ� �ۼ�
		mediaPlayer.setOnPlaying(()-> {
		
			btnPlay.setDisable(true); 	// �����ư�� ��Ȱ��ȭ
			btnPause.setDisable(false); // �Ͻ����� ��ư Ȱ��ȭ
			btnStop.setDisable(false);  // ���� ��ư Ȱ��ȭ	
			
		});
		// �̵��ҽ��� �Ͻ����� �ǰ� ���� ���� �����ؼ� ������ ������ ���ٽ����� �ڵ� �ۼ�
		mediaPlayer.setOnPaused(()-> {
			
			btnPlay.setDisable(false); // �����ư�� Ȱ��ȭ
			btnPause.setDisable(true); // �Ͻ����� ��ư ��Ȱ��ȭ
			btnStop.setDisable(false);  // ���� ��ư Ȱ��ȭ	
			
		});
		
		// �̵��ҽ��� �������� �� �����ؼ� ������ ������ ���ٽ����� �ڵ� �ۼ�
		mediaPlayer.setOnStopped(()-> {
			
			btnPlay.setDisable(false); // �����ư�� Ȱ��ȭ
			btnPause.setDisable(true); // �Ͻ����� ��ư ��Ȱ��ȭ
			btnStop.setDisable(true);  // ���� ��ư ��Ȱ��ȭ	
			
		});
		// �̵��ҽ���  �������� ���·� ���ϷḦ 
		// �����ؼ� ������ ������ ���ٽ����� �ڵ� �ۼ�
		mediaPlayer.setOnEndOfMedia(() -> {
			
			btnPlay.setDisable(false); // �����ư�� Ȱ��ȭ
			btnPause.setDisable(true); // �Ͻ����� ��ư ��Ȱ��ȭ
			btnStop.setDisable(true);  // ���� ��ư ��Ȱ��ȭ	
			
		// ������ ����� �Ϸᰡ �Ǿ ��� ��ư�� Ȱ���ϰ� �Ǿ� Ŭ���� ������
		// ����� ���� �ʴ´� �� ������ ����Ϸ� ������ �� �̵�� �ҽ��� ���°�
		// �ӹ��� �ֱ� �����̴�. �Ͽ� ��������� stop() ȣ���� �ϰ� �� �ҽ���
		// �̵���� ���¸� ó������ ������ �ڵ带 �ۼ��� �ؾ��Ѵ�. 
		// ���� �÷��� ������ ����ϸ� �ȴ�.
			endOfMedia = true;
			
		});
		
		// ��� ��ư�� �̺�Ʈ ó�� �ڵ�
		btnPlay.setOnAction( event -> {
		
			// �÷��� ������ true �� �Ǿ��ٴ� ���� �̵�� ���°� ����Ϸ� (endOfMedia)���¸� ������
			// ��������� stop() ȣ���ϰ�, �̵�� ó���ð����� �����ִ� �ڵ带 �ۼ���
			if(endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
				endOfMedia = false;
			}
			mediaPlayer.play();
		});
		
		// �Ͻ����� ��ư�� Ŭ�������� �̺�Ʈ ó�� �ڵ�
		btnPause.setOnAction(event -> mediaPlayer.pause());
		// ���� ��ư�� Ŭ�������� �̺�Ʈ ó�� �ڵ�
		btnStop.setOnAction(event -> mediaPlayer.stop());
	}

}
