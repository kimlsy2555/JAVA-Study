package example05;

import java.util.LinkedList;
import java.util.Queue;

public class QuqueEx {

	public static void main(String[] args) {
		
		Queue<Messge> mQueue = new LinkedList<Messge>();
		
		mQueue.offer(new Messge("sendMail", "�ڱ浿"));
		mQueue.offer(new Messge("sendSNS", "�̳���"));
		mQueue.offer(new Messge("sendMailkakaotal", "���Ͽ�"));
		mQueue.offer(new Messge("sendFaceBook", "��Ը�"));

		
		while(!mQueue.isEmpty()) {
			Messge messge = mQueue.poll();
			System.out.println(mQueue.size());
			switch(messge.getComman()) {
				
			case "sendMail" :
				System.out.println(messge.getTo()+"���� ������ �����ϴ�.");
				break;
				
			case "sendSNS" :
				System.out.println(messge.getTo()+"���� SNS�� �����ϴ�.");
				break;
				
			case "sendMailkakaotal" :
				System.out.println(messge.getTo()+"���� īī���� �� �����ϴ�.");
				break;
				
			case "sendFaceBook" :
				System.out.println(messge.getTo()+"���� ����� �����ϴ�.");
				break;
			}
			
		}
	}

}
