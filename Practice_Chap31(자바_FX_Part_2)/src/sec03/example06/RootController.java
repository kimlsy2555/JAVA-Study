package sec03.example06;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;



public class RootController implements Initializable{
	
	// FXML�� ������ ���´�
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	/////////////////////////////////////
	
	@FXML private Label labelTime;
	@FXML private ProgressBar progressBar;
	@FXML private ProgressIndicator progressIndicator;
	@FXML private Slider sliderVolume;
	@FXML private Slider sliderMedia;
	
	
	private boolean endOfMedia;// �÷��� ����
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// ����� �ҽ� (Media)�� �����ϴ� �ڵ�
		
		//�����
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
				// setDisable() �Ű����� true �̸� ��Ȱ��ȭ ,false�� Ȱ��ȭ
				btnPlay.setDisable(false); // �����ư�� Ȱ��ȭ
				btnPause.setDisable(true); // �Ͻ����� ��ư ��Ȱ��ȭ
				btnStop.setDisable(true);  // ���� ��ư ��Ȱ��ȭ	
				
				/////////////////////////////////////////
				
				// ��������� �̵�� �����̴��� �ְ��� �ּҰ��� �ʴ����� ������
				sliderMedia.setMin(0.0);
				sliderMedia.setValue(0.0);
				sliderMedia.setMax(mediaPlayer.getTotalDuration().toSeconds());
				
				// MediaPlayer�� ���� �ð��� �Ӽ������ϴ� �ڵ带 �ۼ��Ѵ�.
				// �ð��̱⿡ ���׸� Ÿ���� Duration�̴�.
				// ���� �Ǹ鼭 currentTime�� ������ �Ǹ�, �װ��� newValue�� ��� ������ �ȴ�
				// currentTime�� ProgressBar,ProgressIndiator�� ��Ÿ���� ���ؼ� 0.0~1.0 ������ ������
				// ȯ���Ͽ� ��Ÿ ����� �ϱ� ������ �Ӽ����ø� �Ѵ�.
				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {

					@Override
					public void changed(ObservableValue<? extends Duration> observable, 
										Duration oldValue,Duration newValue) {
						// ���� ����ð� / ������ð� �ϸ� , 0.0~1.0�� ���� ���̴�.
						double progress = mediaPlayer.getCurrentTime().toSeconds()/
						mediaPlayer.getTotalDuration().toSeconds();
 						// 0.0~1.0 ������ ���� ���� ���ش�.
						progressBar.setProgress(progress);
						progressIndicator.setProgress(progress);
						// �����̴��� �̵�� �ҽ��� ��������� ��Ÿ����.
						sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());
						// ����ð��� Label�� ǥ�� �ϱ����� ����
						labelTime.setText((int)mediaPlayer.getCurrentTime().toSeconds()+
									"/"+(int)mediaPlayer.getTotalDuration().toSeconds()+"��");
					
						System.out.println("��� ��");
					}
				});
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
			
			// ���������� 1.0�� �����Ͽ� �Ϸ� ���°� �������� ����� �ڵ�
			progressBar.setProgress(1.0);
			progressIndicator.setProgress(1.0);
			
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
		
		
		// SliderVolume�� ����Ǿ��� �� ������ ũ�⸦ �����ϴ� �Ӽ����� �ڵ尡 �ʿ��ϴ�
		// Slider�� value���� ������ 0.0~100.0�̴� mediaPlayer�� value�� ������
		// 0.0~1.0�̱� ������ 100.0���� ������
		sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {

			
			
			@Override
			public void changed(ObservableValue<? extends Number> observable, 
								Number oldValue, Number newValue) {

				//mediaPlayer.setVolume(newValue.doubleValue()/100.0);
				mediaPlayer.setVolume(sliderVolume.getValue()/100.0);
				System.out.println("���� ����");

			}

		});
	
		sliderVolume.setValue(50.0);
		
		
		///////////////////////////////////////
		// sliderMedia �κ��� ���콺�� �巡�׸� �ϰų� ������ �� �̵�� �ҽ��� ����
		// ��ȭ�� �Ͼ�Բ� �ϴ� �ڵ带 �ۼ��� �غ���.
		
		sliderMedia.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, 
								Number oldValue, Number newValue) {

				// ���콺�� �巡���� ��
				
				if(sliderMedia.isValueChanging()) {
					System.out.println("���콺 �巡��");
					mediaPlayer.seek(Duration.seconds(sliderMedia.getValue()));
				}
				// ���� ��� �Ǵ� ���콺�� Ŭ���� ��
				
				else {
					// ��������� ��� (��ȭ�� 0.5�̸�)seek���� �ʰڴ�.
					if(Math.abs(oldValue.doubleValue() - newValue.doubleValue()) > 0.5) {
						System.out.println("���콺 Ŭ��");
						mediaPlayer.seek(Duration.seconds(sliderMedia.getValue()));
					}
				
				}
			}
		});
		
		
		
	}

}
