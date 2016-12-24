import java.util.*;

public class PriorityQueue<E extends Comparator<? super E>>{

	private ArrayList<E> list;
	private Comparator<E> comp;
	private static final int DEFAULT_CAPACITY = 10;
	

	public PriorityQueue(Comparator comp){
		this.comp = comp;
		this.list = new ArrayList<E>(DEFAULT_CAPACITY);  

	}
}
