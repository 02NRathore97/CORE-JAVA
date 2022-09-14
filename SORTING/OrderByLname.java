package in.com.raystec.sorting;

import java.util.Comparator;



public class OrderByLname implements Comparator<ComparatorMarksheet>{
	
	public int compare(ComparatorMarksheet cm1,ComparatorMarksheet cm2) {
		return cm1.getLname().compareTo(cm2.getLname());
	}
}

