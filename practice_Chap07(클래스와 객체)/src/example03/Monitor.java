package example03;

public class Monitor {

		// ��� ���� (�ʵ�)
		String color ;
		int channel;
		boolean power;
		
		//��� �޼���
		
		public void power(){
			
			 if (!this.power){
				System.out.println("����� on");
				this.power = !power;
				}
			 else {
				System.out.println("�����  off"); 
				this.power = !power;
			 }
		}
		
		
		
		public void channelUp() {
			this.channel++;
			System.out.println("ch : "+this.channel);
			
		}
		public void channelDown(){
			System.out.println("ch : "+ --this.channel);
		}
		
		@Override
		public String toString() {
	
			
		return "���� ä�� : "+this.channel+" ���� ��  : "+ this.color;
		}
		
		
		
		
		
		
		
		
		
}
