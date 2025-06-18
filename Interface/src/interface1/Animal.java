package interface1;

public interface Animal {
	void animalRuns();
	void sleep();
}
class Cat implements Animal {
	@Override
	public void animalRuns() {
		System.out.println ("The cat says meow meow");
	}
	@Override
	public void sleep() {
		System.out.println("Cat sleeps");
	}
	public static void main(String[]args) {
		Cat myCat = new Cat();
		myCat.animalRuns();
		myCat.sleep();
	}
	}
