package in.com.raystec.sorting;

import java.util.Comparator;

public class EmployeeOrderByLname implements Comparator<ComparatorEmployee> {

	@Override
	public int compare(ComparatorEmployee ce1, ComparatorEmployee ce2) {
		
		return ce1.getLname().compareTo(ce2.getLname());
	}

}
