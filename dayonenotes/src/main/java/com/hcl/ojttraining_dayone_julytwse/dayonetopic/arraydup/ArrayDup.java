package com.hcl.ojttraining_dayone_julytwse.dayonetopic.arraydup;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDup {
	public static void main(String[] args) {
		int[] temp = {1,2,3,4,3,2,5};
		//stream way of solving the problem
		int[] noDup = Arrays.stream(temp).distinct().toArray();
		System.out.println(Arrays.toString(noDup));
		//For loop way of figuring out the problem
		ArrayList<Integer> noDupl = new ArrayList<Integer>();
		for (int i = 0; i< temp.length; i++) {
			if (!noDupl.contains(temp[i])) {
				noDupl.add(temp[i]);
			}
			else {
				continue;
			}
		}
		
	}
}
