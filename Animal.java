
public class Animal {
		
	private int age;// Public VS private int age
	
	public Animal(int age) {
		this.age= age;
		System.out.println("An animal has been created");
	}
	public void eat() {
		System.out.println("An animal is eating");
	}
	// if age is private and we need to access it we can use getters
	public int getAge() {
		return  age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal(5);
		Dog d = new Dog();
		Cat c = new Cat();
		System.out.println(d.getAge());
		a.eat();
		d.eat();
		c.eat();
		System.out.println(c.getAge());
		c.meow();
		d.run();
		c.prance();
		d.ruff();

		// what happens if ?
		// Animal o = new Dog();
		// A subclass can  be generalized to a super class 
		//A superclass cannot become a more specific superclass
	}

}
