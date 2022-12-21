package example06;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class CardLayoutEvent extends Frame{
	
	Button first,prev,next,last;
	// ��ư�� ��ġ�� ���ؼ� �гμ���
	Panel buttons;
	Panel slide;
	// slide�� ���Ե� �гε�
	Panel card1,card2,card3,card4,card5; 
	CardLayout card;
	
	
	public CardLayoutEvent(String title){
		super(title);
	}
	
	public void CardShow() {
		
		this.slide = new Panel();
		this.card = new CardLayout();
		this.slide.setLayout(card);
	
		
		//��ư�� ���� Panel�� �����.
		this.buttons = new Panel();
		this.buttons.setLayout(new FlowLayout());
		
		this.first = new Button("<<");
		this.prev = new Button("<");
		this.next = new Button(">");
		this.last = new Button(">>");
		
		
		// �гο��ٰ� ��ư�� �߰���
		this.buttons.add(first);
		this.buttons.add(prev);
		this.buttons.add(next);
		this.buttons.add(last);
		
		// ������ �г��� 5�� �����.
		
		this.card1 = new Panel();
		card1.setBackground(Color.gray);
		card1.add(new Label("ù ��° ������ �Դϴ�."));
		
		this.card2 = new Panel();
		card2.setBackground(Color.orange);
		card2.add(new Label("�� ��° ������ �Դϴ�."));
		
		this.card3 = new Panel();
		card3.setBackground(Color.blue);
		card3.add(new Label("�� ��° ������ �Դϴ�."));
		
		this.card4 = new Panel();
		card4.setBackground(Color.cyan);
		card4.add(new Label("�� ��° ������ �Դϴ�."));
		
		this.card5 = new Panel();
		card5.setBackground(Color.pink);
		card5.add(new Label("�ټ� ��° ������ �Դϴ�."));
		
		//slide(Panel)�� card1�� "1"�̶� �̸����� �߰��� �ߴ�.
		
		this.slide.add(card1,"1");
		this.slide.add(card2,"2");
		this.slide.add(card3,"3");
		this.slide.add(card4,"4");
		this.slide.add(card5,"5");
		
		
		// �̺�Ʈ ó�� �κ�
		// ��ư�� ActionEvent�����ʸ� �߰��Ѵ�.
		
		this.first.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// CardLayout�� ù��° slide(Panel)�� ���̵����Ѵ�.
				card.first(slide);
				
			}
		});
		
		this.prev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ����  slide(Panel)�������� ���� slide�� ���̵����Ѵ�.
				card.previous(slide);
				
			}
		});
		
		
		this.next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ����  slide(Panel)�������� ���� slide�� ���̵����Ѵ�.
				card.next(slide);
				
			}
		});
		
		this.last.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ������ slide�� ���̵����Ѵ�.
				card.last(slide);
				
			}
		});
		
		this.add("South",buttons);
		this.add("Center",slide);
		
		this.setSize(500,500);
		this.setLocation(300, 100);
		this.setVisible(true);
		
		// �����ϰԵǸ� ù��° �����̵�(card1)�� ��Ÿ���� �Ѵ�.
		
		card.show(slide, "1");
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
