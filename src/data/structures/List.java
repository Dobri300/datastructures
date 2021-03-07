package data.structures;

import java.util.ArrayList;

public interface List<T> 
{
	
	boolean isEmpty();
	boolean contains(T item);
	void add(T item);
	void insertAt(T item, int index);
	void removeAt(int index);
	void removeFrom(T item);
	T get(int index);
	void clear();
	 
	
}
