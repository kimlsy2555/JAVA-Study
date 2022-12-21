package example01;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutEx {

	public static void main(String[] args) {
		
			Frame frame = new Frame("CardLayout");
			
			// ���̾ƿ��� ���� �����ؼ� ������ �ϴ� ���̴�.
			CardLayout card = new CardLayout(10,10);
			frame.setLayout(card);
			

			// �����ӿ� ���ӵ� �����̳��� �г� 3�� ����
			Panel card1 = new Panel(); 
			card1.setBackground(Color.LIGHT_GRAY);
			card1.add(new Label("ī�� - 1 "));
			
			Panel card2 = new Panel(); 
			card2.setBackground(Color.ORANGE);
			card2.add(new Label("ī�� - 2 "));
			
			Panel card3 = new Panel(); 
			card3.setBackground(Color.CYAN);
			card3.add(new Label("ī�� - 3 "));
			
			// ������ ���ٰ� �г� 3�� �߰��ϱ�
			
			frame.add(card1);
			frame.add(card2);
			frame.add(card3);
			
			// ��ø Ŭ���� Handler , MouseAdapter�� ��� �ް� �ִ�.
			// ���콺 �̺�Ʈ �ڵ鸵�� ���ִ� ������ �Ѵ�.
			class Handler extends MouseAdapter{
				 	
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
						System.out.println(e.getModifiers());
						// ���� �г��� ������
						card.previous(frame);
					}
					else {
						System.out.println(e.getModifiers());
						 // ���� �г��� ������
						card.next(frame);
					}
				}
			}
			// MouseAdapterŬ������ MouseListener�������̽��� ���� �ϰ� �ֱ� ������
			// Handler�� �ν��Ͻ��� �Ű������� �� ���� �ִ�. (�������̽��� ������)
			card1.addMouseListener(new Handler());
			card2.addMouseListener(new Handler());
			card3.addMouseListener(new Handler());
			
			
			frame.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					
					System.exit(0);
				}
			});
			
			
			frame.setSize(300,300);
			frame.setLocation(500, 300);
			
			
			// �����ӿ� �߰��� panel �߿��� ó������ �߰��� ���� �����ش�.
			// ������ �߰��� ���� �����ְ��� �Ѵٸ� last(frame)�� �����ϸ� �ȴ�.
			card.first(frame);
			frame.setVisible(true);
			
			
			
			
			
		}

	}
