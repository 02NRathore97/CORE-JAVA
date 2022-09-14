package in.com.raystec.sorting;

import java.util.Comparator;

public class EmployeeOrderByFname implements Comparator<ComparatorEmployee>{
	public int compare(ComparatorEmployee ce1,ComparatorEmployee ce2) {
		return ce1.getFname().compareTo(ce2.getFname());
	}


}

