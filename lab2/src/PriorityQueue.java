import java.util.*;
import java.lang.reflect.Array;

public class PriorityQueue<E>{ 

	private ArrayList<E> array;
	private Comparator<E> comp;
	private HashMap<E,Integer> map;
	private static final int DEFAULT_CAPACITY = 10;
	
	public PriorityQueue(Comparator<E> comp){
		this.array = new ArrayList<E>(DEFAULT_CAPACITY);
		this.comp = comp;
		map = new HashMap<>();
		array.add(null);
	}

	public void add(E e){
		//System.out.println("---Adding----");
		array.add(e);
		map.put(e,getSize());
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
		replace(1,getSize());
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

	public String toString(){
		return "test";
	}

	public boolean replace(E e1, E e2){
		if(map.get(e1) != null){
			int index = map.get(e1);
			map.remove(e1);
			map.put(e2,index);
			array.set(index,e2);
			percolateDown(index);
			percolateUp(index);
			return true;
		}
		else{
			return false;
		}
	}

	private void percolateDown(int hole){
		//Index 0 is used for a temporary storage for the element
		//that will percolate down 
		replace(0,hole);

		while(hole * 2 <= getSize()){
			int child = hole * 2;

			if(child != getSize() && comp.compare( array.get(child + 1) , array.get(child) ) > 0){
				child++;
			}
			if(comp.compare(array.get(child),array.get(0)) > 0){
				replace(hole,child);	
			}
			else{
				break;
			}
			hole = child;
		}
		replace(hole,0);
	}

	private void percolateUp(int hole){
		//Index 0 is used for a temporary storage for the element
		//that will percolate up 
		replace(0,hole);
		
		while(hole/2 != 0 && comp.compare(array.get(0) , array.get(hole/2)) > 0){
			replace(hole,hole/2);
			hole /= 2;
			//System.out.println("Percolate up");
		}
		replace(hole,0);
	}

	private void replace(int a, int b){
		array.set(a, array.get(b));
		map.put(array.get(b), a);
	}

	public int index(E e){
		return map.get(e);
	}

	public ArrayList<E> getArray(){
		return this.array;
	}

}
