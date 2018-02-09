public class Constructors {
	public static void main(String[] args) {

		int previousAge ;
		int currentAge ;

	public Constructors (int currentAge) {
		currentAge = 27;
	}

	Constructors myAgeIn2019 = new Constructors();

	myAgeIn2019.setAge(28);

	public Constructors (int friendsAge) {

	}

	Constructors friendsAge = new Constructors();
	friendsAge.setAge(30);

	System.out.println(myAgeIn2019 + friendsAge);
	
	}
}