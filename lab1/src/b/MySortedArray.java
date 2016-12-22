package b;

import java.util.*;

public class MySortedArray<E extends Comparable<? super E>> 
	implements MySet<E>{

	private ArrayList<E> array;

	public MySortedArray(ArrayList<E> array){
		this.array = array;
	}

	public boolean member(E element){
		int low = 0;
		int high = array.size()-1;

		while(low <= high){
			int mid = low + (high - low)/2;
			if(element.compareTo(array.get(mid)) > 0){
				low = mid + 1;
			}
			else if(element.compareTo(array.get(mid)) < 0){
				high = mid - 1;
			}
			else{
				return true;
			}
		}
		return false;
	}
}
