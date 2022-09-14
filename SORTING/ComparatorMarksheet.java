package in.com.raystec.sorting;

import java.util.Comparator;

public class ComparatorMarksheet implements Comparator<ComparatorMarksheet>{
private String rollNo;
private String fname;
private String lname;
private int phy;
private int chem;
private int math;

//default constructor
public ComparatorMarksheet() {
	// TODO Auto-generated constructor stub
}

//setter
public void setRollNo(String rollNo) {
    this.rollNo = rollNo; 
}
public void setFname(String fname) {
	this.fname = fname;
}
public void setLname(String lname) {
	this.lname = lname;
	}
public void setPhy(int phy) {
	this.phy = phy;
}
public void setChem(int chem) {
	this.chem = chem;
	}
public void setMath(int math) {
	this.math = math;
}

//getter
public String getRollNo() {
	return rollNo;
}
public String getFname() {
	return fname;
}
public String getLname() {
	return lname;
}
public int getPhy() {
	return phy;
}
public int getChem() {
	return chem;
}
public int getMath() {
	return math;
}


@Override
public int compare(ComparatorMarksheet cm1,ComparatorMarksheet cm2) {
	return cm1.getFname().compareTo(cm2.getFname());
}


}
