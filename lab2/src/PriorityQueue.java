import java.util.*;
import java.lang.reflect.Array;

public class PriorityQueue<E>{ 

	private ArrayList<E> array;
	private Comparator<E> comp;
	private static final int DEFAULT_CAPACITY = 10;
	
	public PriorityQueue(Comparator comp){
		this.comp = comp;
		this.array = new ArrayList<E>(DEFAULT_CAPACITY);
		array.add(null);
	}

	public void add(E e){
		array.add(e);
		percolateUp(getSize());
	}

	public E peek(){
		if(getSize() == 0)
			return null;
		else
			return array.get(1);
	}

	public E poll(){
		E priorityOne = array.get(1);
		array.set(1, array.get(getSize()));
		if(getSize() != 1)
			percolateDown(1);
		return priorityOne;
	}

	public void remove(int a){
		return;
	}

	public boolean remove(Object o){
		return false;
	}

	public int getSize(){
		return array.size() - 1;
	}


	//private methods
	

	private void percolateDown(int hole){
		//Index 0 is used for a temporary storage for the element
		//that will percolate down 
		array.set(0,array.get(hole));
		
		while(hole * 2 <= getSize() && comp.compare(
										array.get(hole*2),
									   	array.get(hole)) > 0){
			array.set(hole,array.get(hole*2));	
			hole *= 2;
		}
		array.set(hole, array.get(0));
	}

	private void percolateUp(int hole){
		//Index 0 is used for a temporary storage for the element
		//that will percolate up 
		array.set(0,array.get(hole));
		
		while(hole/2 != 0 && comp.compare(array.get(hole),
										  array.get(hole/2)) > 0){
			array.set(hole,array.get(hole/2));
			hole /= 2;
		}
		array.set(hole, array.get(0));
	}
}
