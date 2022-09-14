package in.com.raystec.gradingsystem;

public class Grades {

	public static void main(String[] args) {
	double marks = 76.67;
	if(marks > 91 && marks <= 100) {
		System.out.println("A+");
		}else if(marks > 81 && marks <= 90) {
			System.out.println("A");	
		}else if(marks > 71 && marks <= 80) {
			System.out.println("B+");	
		}else if(marks > 61 && marks <= 70) {
			System.out.println("B");	
		}else if(marks > 51 && marks <= 60) {
			System.out.println("C+");	
		}else if(marks > 41 && marks <= 50) {
			System.out.println("C");	
		}else if(marks > 35 && marks <= 40) {
			System.out.println("D");	
		}else {
			System.out.println("FAIL");
		}
	}

}
