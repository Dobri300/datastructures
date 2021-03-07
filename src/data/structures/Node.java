package data.structures;

public class Node<T>
{
	T data;
	Node <T> next;
	
	public Node(T dataValue, Node <T> nextValue) 
	{
		this.data = dataValue;
		this.next = nextValue;
	}
	
	public Node(T dataValue)
	{
		this.data = dataValue;
		this.next = null;
	}
	
	public String toString()
	{
		 return data.toString();
	}
}
