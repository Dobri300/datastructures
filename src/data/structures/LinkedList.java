package data.structures;

import java.util.ArrayList;

public class LinkedList<T> implements List
{

	private Node<T> lastNode;
	private int count = 0;
	private int size;
	private ArrayList<Node> nodes = new ArrayList<>(size);
	
	
	public LinkedList()
	{
		this.lastNode = null;
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
		// TODO Auto-generated method stub
		return nodes.contains(item);
	}
	
	@Override
	public void add(Object item)
	{
		// TODO Auto-generated method stub
		Node<T> newNode = new Node(item, lastNode);
		this.nodes.add(newNode);
	}

	@Override
	public void insertAt(Object item, int index)
	{
		this.nodes.add(index, (Node) item);
		
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		this.nodes.remove(index);
	}

	@Override
	public void removeFrom(Object item) {
		// TODO Auto-generated method stub
		this.nodes.remove(item);
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		
		return this.nodes.get(index);
		
	}

	@Override
	public void clear()
	{
		this.nodes.clear();
		
	}

}
