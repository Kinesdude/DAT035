package b;

import java.util.*;
import java.io.File;

public class Main{
	public static void main(String[] args){
		int element = Integer.parseInt(args[0]);
		File file = new File(args[1]);
		try{
			Scanner input = new Scanner(file);
			ArrayList<Integer> list = new ArrayList<Integer>();

			while(input.hasNext()){
				list.add(input.nextInt());	
			}

			MySortedArray<Integer> array = new MySortedArray<Integer>(list);
			System.out.println(array.member(element));
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}
