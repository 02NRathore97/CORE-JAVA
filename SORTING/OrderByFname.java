package in.com.raystec.sorting;

import java.util.Comparator;

public class OrderByFname implements Comparator<ComparatorMarksheet>{
	public int compare(ComparatorMarksheet cm1,ComparatorMarksheet cm2) {
		return cm1.getFname().compareTo(cm2.getFname());
	}
}
/**public class OrderByFname implements Comparator<ComparatorMarksheet>{
	public int compare(ComparatorMarksheet cm1,ComparatorMarksheet cm2) {
		int i = cm1.getFname().compareTo(cm2.getLname());
		if(i==0) {
			i= cm1.getLname().compareTo(cm2.getLname());
		}
		return i;
	}
}*/
