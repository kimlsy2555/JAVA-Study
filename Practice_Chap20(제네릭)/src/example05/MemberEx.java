package example05;

public class MemberEx {
	//���׸� Ŭ������ Member�� ������ MemberEx Ŭ������ �ν��Ͻ� �޼���
	public <T> Member<T>boxong(T t){
		
	Member<T> member = new Member<T>();
	member.setT(t);
	return member;
}	
	//MemberEx Ŭ������ ���� �޼���
	public static <T> Member<T>  wrapping(T t){
		
		Member<T> member = new Member<T>();
		member.setT(t);
		return member;
	}
	
	public static void main(String[] args) {
	
	MemberEx memberEx = new MemberEx();
	Member<Integer> member = memberEx.boxong(new Integer(100));
	
	System.out.println("Member Ŭ������ �� : "+ member.getT());
	
	Member<String>member2 = wrapping("ȫ�浿");
	
	System.out.println("Member Ŭ������ �� : "+ member2.getT());
	
	}

}
