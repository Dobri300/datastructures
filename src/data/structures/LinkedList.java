package data.structures;

import java.util.ArrayList;

public class LinkedList<T> implements List
{

	private Node<T> head = new Node();
	private int count = 0;
	private int size;
	
	
	public LinkedList()
	{
		this.count = 0;
		this.size = 10;
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
		
	}

	@Override
	public boolean contains(Object item) {
		
		Node<T> node = head;
		
		while(node.next != null)
		{
			
			node = node.next;
			if (node.data == item) 
			{
			return true;	
			}
			
		}
		
		return false;
	}
	
	@Override
	public void add(Object item)
	{
		// TODO Auto-generated method stub

		Node<T> newNode = head;
		
		while(newNode.next != null)
		{
			newNode = newNode.next;
			
		}
		newNode.next = new Node((T)item);
		
	}

	@Override
	public void insertAt(Object item, int index)
	{
		Node<T> node = head;
		Node<T> newNode = new Node();
		newNode.data = (T) item;
		if (index<=count-1 && index>=0) 
		{
			throw new IndexOutOfBoundsException("Insert At");
		}else
		{
		
		
		for (int i = 1; i <= index; i++) 
		{
			
			node = node.next;
		}
		
		Node<T> tempNode = node.next;
		node.next = newNode;
		newNode.next = tempNode;
		count++;
		
		}
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		Node<T> node = head;
		
		for (int i = 0; i < index-1; i++)
		{
			node = node.next;
		}
		
		node.next = node.next.next;
		
	}

	@Override
	public void removeFrom(Object item) {
		// TODO Auto-generated method stub
		Node<T> node = head;
		
		while(node.next!=null && node.next.data != item)
		{
			node = node.next;
			
		}
		if (node.next!=null) {
			
			node.next = node.next.next;
		}
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		
		
		Node<T> node = head;
		
		for (int i = 0; i < index; i++) 
		{
			node = node.next;
		}
		return node.data;
	}

	@Override
	public void clear()
	{
		
	}

	
	
	public static void main(String args[])
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.insertAt(5, 2);
		//list.removeAt(3);
		//list.removeFrom(5);
		System.out.println(list.get(3));
		System.out.println(list.contains(3));
	}
	
	
	
}
