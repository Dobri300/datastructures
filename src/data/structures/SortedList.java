package data.structures;

public class SortedList <T extends Comparable<T>> implements List<T> {

	Node<T> head = new Node<T>();
	int count = 0;
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == null;
	}

	@Override
	public boolean contains(T item) {
		// TODO Auto-generated method stub
		Node<T> nodeCheck = head;
		for (int i = 0; i < count; i++)
		{
			if (nodeCheck == item) 
			{
				return true;
			}
			else if(nodeCheck.next != null)
			{
				nodeCheck = nodeCheck.next;
			}
			
		}
		return false;
	}

	@Override
	public void add(T item) 
	{
		Node<T> checkNode = head;
		if (count >= 1) {
			
			while(checkNode.next != null && (int)checkNode.next.data < (int)item) 
			{
				checkNode = checkNode.next;
			}
			Node<T> newNode = new Node<T>(item, checkNode.next);
			checkNode.next = newNode;
			count++;
		}else
		{
			head = new Node<T>(item, null);
			count++;
		}
		
		
	}

	@Override
	public void insertAt(T item, int index)
	{
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		if (index>=0 && index < count) {
			
		
		Node<T> checkNode = head;
		for (int i = 0; i < index-1; i++)
		{
			checkNode = checkNode.next;
		}
		checkNode.next = checkNode.next.next;
		count--;
		}
	}

	@Override
	public void removeFrom(T item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		if (index>=0 && index < count)
		{	
			
		Node<T> nodeCheck = head;
		for (int i = 0; i < index; i++)
		{	
			nodeCheck = nodeCheck.next;			
		}
			
			return nodeCheck.data;
		}
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.head = null;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedList<Integer> list = new SortedList<>();
		
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
			
		System.out.println(list.get(0));
		
		
		
	}
	

}
