public abstract class Animal {
	

	abstract String getName();
	abstract String getSound();

	void singVerse() {

		System.out.println("Old MacDonald had a farm, EIEIO!");
		System.out.println("And on that farm he had a " + getName() + " EIEIO!");
		System.out.println("With a " + getSound() + ", " + getSound() + ", here, and a "+ 
			getSound() + ", " + getSound() + " , there,");
		System.out.println("Here a " + getSound() + ", there a "+ getSound() + ", everywhere a " + 
			getSound() + ", "+ getSound() + ",");
		System.out.println("Old MacDonald had a farm, EIEIO!");

	}

	public static void main(String[] args) {
		
		Animal [] anim = new Cow();
	/*	Animal cow = new Cow();
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal horse = new Horse();
		cow.singVerse();
		dog.singVerse();
		cat.singVerse();
		horse.singVerse();

		*/
	}
}
/*
	String name;
	String sound;

	public Animal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	abstract public void singVerse() {
		
	}

		
		System.out.println("And on that farm he had a " + name + "EIEIO!");
		System.out.println("With a " + sound + ", " + sound + ", here, and a "+ 
			sound + ", "+ sound + "there,");
		System.out.println("Here a " + sound + ", there a "+ sound + ", everywhere a " + 
			sound + ", "+ sound + ",");
		System.out.println("Old MacDonald had a farm, EIEIO!");
	
	
}


*/



