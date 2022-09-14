package in.com.raystec.dataAbstraction;


//*class can extends other class but one at a time.
//*class can implements more than one interfaces at the same time.
//*interfaces can extends more than one interfaces at the same time.


public class Bussinessman implements Richman, SocialWorker{
	@Override
	public void helpToOthers() {
		System.out.println("Help to others");
	}

	@Override
	public void earnMoney() {
		System.out.println("Earn money ");
	}

	@Override
	public void donation() {
		System.out.println("Donate ");
		
	}

	@Override
	public void party() {
		System.out.println("Party");
		
	}

	


public static void main(String[] args) {
	
	//by creating the object of the SocialWorker interface we can only  access all methods that are declared in this interface
	SocialWorker sw = new Bussinessman();
	sw.helpToOthers();
	
	//by creating the object of the Richman interface we can only  access all methods that are declared in this interface
	Richman rc = new Bussinessman();
	rc.earnMoney();
	rc.donation();
	rc.party();
	
	//by creating the object of the bussinessman class we can access all the methods
	Bussinessman bm = new Bussinessman();
	bm.helpToOthers();
	bm.earnMoney();
	bm.donation();
	bm.party();
	
	}
}

