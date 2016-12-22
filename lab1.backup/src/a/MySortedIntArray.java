package a;

import java.util.ArrayList;

public class MySortedIntArray implements MyIntSet{

	private ArrayList<Integer> list;

	public MySortedIntArray(ArrayList<Integer> list){
		this.list = list;
	}

	public boolean member(int element){
		int low = 0;
		int high = list.size() - 1;

		while(low <= high){
			int mid = low + (high - low)/2;
			if(element > this.list.get(mid)){
				low = mid + 1;
			}
			else if(element < this.list.get(mid)){
				high = mid - 1;
			}
			else{
				return true;
			}

		}
		return false;
	}
	
}
