package example03;

public class MyVector {
	

	
	Object[] data = null; // ��ü�� ������� ��ü �迭�� ����
	private int capacity; // �뷮
	private int size;	  // ��ü��
	// �⺻������
	public MyVector() {
		
		this(10);
	}
	
	// �Ű������� �ִ� ������
	public MyVector(int capacity) {
		if(capacity<0) {
			throw new IllegalArgumentException("Vector �÷����� �������� ����� ����"+capacity);
		}
		this.capacity= capacity;
		data= new Object[capacity];
	}
	
	
	// ���Ϳ� ����� ��ü�� �ִ��� Ȯ���ϴ� �޼���
	public boolean isEmpty() {
		
		return size==0;
	}
	
	// ������ �뷮�� �����ϴ� �޼���
	public int capacity() {
		return this.capacity;
	}
	
	// ��ü ���� �����ϴ� �޼���
	public int size() {
		return this.size;
	}
	
	
	// �ּ����� ������� (capacity)�� Ȯ���ϴ� �޼���(�뷮 �߰�)
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length>0) {
			setCapacity(minCapacity);
		}
	}
	
	
	private void setCapacity(int capacity) {
		// �뷮�� ũ�Ⱑ ���ٸ�...
		if(this.capacity == capacity) {
			return;
		}
		Object[] tmp = new Object[capacity];
		System.arraycopy(data,0, tmp, 0, size); // �迭����
		
		data = tmp;	 // ���������� ���� ������
		this.capacity = capacity; // �뷮����
		
	}
	
	// ��ü �߰��ϱ�
	
	public boolean add(Object obj) {
		
		ensureCapacity(size+1);
		data[size++] = obj;
		return true;
	}
	
	
	public Object get(int index) {
		
		if (index<0||index>=size) {
			throw new IndexOutOfBoundsException("������ ���");
		}
		return data[index];
	}
	
	public Object remove(int index) {
		Object oldObj = null;
		if(index <0 || index>= size) {
			throw new IndexOutOfBoundsException("������ ���");
		}
		oldObj = data[index];
		if(index != size-1) {
			System.arraycopy(data,index+1, data, index, size-index-1);
			//System.arraycopy(data,index+1, data, index, index);
		}
		data[size-1]=null;
		size--;
		return oldObj;
	
	}
	
	public Object remove(Object obj) {
		
		for(int i=0;i<size;i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		
		}
		return false;
	}
	
	public void trimToSize() {
		setCapacity(size);
	}
	
	public void clear() {
		for(int i =0;i<size;i++) {
			data[i] = null;
		}
		this.size =  0;
		
	}
	
	@Override
	public String toString() {
	
		String tmp= "";
		for(int i =0;i<size;i++) {
			if(i == (size-1))
				tmp += this.data[i];
			else
				tmp +=this.data[i] +",";
		}
		return "[" + tmp+"]";
		
	}
	

	
	
	
	
}
